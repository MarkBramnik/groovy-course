package meeting3.ex4

class Voice {
    static void whisper(String s, String message) { // apply to anything (s) of type String
        println "$s - Whispering: $message"
    }

    static void shout(String s, String message) {
        println "$s - Shouting: ${message.toUpperCase()}"
    }
}

use(Voice) {
    "George Michael".whisper "Careless whisper"
    "Jennifer Lopez".shout "Let's get loud"
}