package meeting3.ex8.logging.metaprogramming

import groovy.transform.InheritConstructors
import groovy.transform.TypeChecked
import meeting3.ex8.logging.log4lectures.Level
import meeting3.ex8.logging.log4lectures.Logger

// 1. Extend the object and introduce new levels:

// AST transformation, will be covered later
@InheritConstructors
class CustomLevel extends Level {
    public static Level OMG = new Level(ERROR.value  + 100, "OMG")
    public static Level WTF = new Level(INFO.value / 2 as Integer, "WTF")
}


// 2.
// Called when there is no method - a fallback, by default throws a 'MethodMissingException', but
// we'll define it so that it would check the logger's method and react appropriately
Logger.metaClass.methodMissing = {String methodName, args -> // Note I don't know which arguments will be passed, so I say 'ah... whatever'
    //println "inside method missing "
    def registry = ['omg' : CustomLevel.OMG, 'wtf' : CustomLevel.WTF]

    // Add the method to the cache so that the next time it won't be missing
    if(['omg', 'wtf'].any {it == methodName}) {
        // Create the method
        def impl = {Object ... varArgs ->
            // the first argument is a message
            delegate.log(registry[methodName], varArgs[0])

        }
        // Note, we cant say Logger.metaClass.methodName because the method named 'methodName' will be defined - not what we want
        // instead we want to evaluate the variable and put the name which name is an evaluation result
        Logger.metaClass."$methodName" = impl
        // call the method. This will happen for the first invocation, when the method is really missing
        impl(args)
    }
    else {
        throw new MissingMethodException(methodName, delegate.getClass(), args)
    }

}

Logger logger2 = new Logger()
logger2.wtf "I don't know what's going on 2"
logger2.wtf "I don't know what's going on 3"
logger2.omg 'Something awful has happened here 2'

// Note that if the method wasn't intercepted, we'll still get the 'MissingMethodException'. Uncomment this
//logger2.fyi 'For your information'

// Note that the 'methodMissing' is something that can be cached
// uncomment println (line 21 and see what happens)

