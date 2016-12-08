package meeting3.ex4

@Category(String)
class VoiceAST {
    void whisper(String message) {
        println "${this} - Whispering: $message"
    }
    void shout(String message) {
        println "${this} - Shouting: ${message.toUpperCase()}"
    }
}



use(VoiceAST) {
    "George Michael".whisper "Careless whisper"
    "Jennifer Lopez".shout "Let's get loud"
}
