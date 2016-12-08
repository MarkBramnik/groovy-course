package meeting2.ex5

def tempDir = System.getProperty('java.io.tmpdir') as File

println tempDir.listFiles().sum {
   it.name.length()
}

////////////////////////////////////////

File sampleFile = new File(tempDir, "sampleFile.txt")
sampleFile.deleteOnExit()
//println sampleFile.absolutePath
sampleFile <<"Hello\n" << "World\n"

println sampleFile.text
////////////////////////////////////////////////////////////

sampleFile.eachLine { println it}

////////////////////////////////////////////////////////////

