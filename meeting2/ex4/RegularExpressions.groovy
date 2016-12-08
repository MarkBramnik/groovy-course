package meeting2.ex4

// regular match
assert   ("How are you" =~ /are/)
assert   ("How are you" =~ /you/)
assert ! ("How are you" =~ /your/)

// exact match
assert !  ("How are you" ==~ /How/)
assert    ("How are you" ==~ /How.*you/)

// find letters a in text
def finder = ("java, groovy, ruby, pascal" =~ /a/)
assert finder.count  == 4
assert finder.size() == 4
assert finder[0] == 'a'
println finder.getClass().getName()
assert ("java, groovy, ruby, pascal" =~ /g[a-z]*y/)[0] == "groovy"

def l = ['java', 'groovy', 'ruby', 'pascal']
