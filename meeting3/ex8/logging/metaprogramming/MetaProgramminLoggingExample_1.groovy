package meeting3.ex8.logging.metaprogramming

import meeting3.ex8.logging.log4lectures.Logger

// We will add 2 new Levels to our logging configuration:

// 1. OMG level - which is supposed to log an unrecoverable error
// 2. WTF level - for debugging of the most cryptic parts of code
//=======================================================

// An Implementation:

// As an initial approach we could try to use meta programming on Logger, but it won't provide us the desired behaviour:

// delegate - contains a reference to the object on which the closure has been invoked
// (this is 'occupied' by the closure itself
Logger.metaClass.omg = {msg -> delegate.error msg}
Logger.metaClass.wtf = {msg -> delegate.info msg}

Logger logger1 = new Logger()
logger1.wtf "I don't know what's going on"
logger1.omg 'Something awful has happened here'
