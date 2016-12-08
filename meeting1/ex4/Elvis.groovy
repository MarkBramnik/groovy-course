package meeting1.ex4


// Elvis operator
String emptyWithDefault(String  s) {
    if(s.size()> 0) {
        s
    }
    else {
        "[EMPTY STRING]"
    }
}

String emptyWithDefault2(String s) {
    (s.size() > 0) ? s : "[EMPTY STRING]"
}

String emptyWithDefault3(String s) {
    s ?: "[EMPTY STRING]"
}


assert emptyWithDefault3("") == "[EMPTY STRING]"
assert emptyWithDefault3("some string") == "some string"

