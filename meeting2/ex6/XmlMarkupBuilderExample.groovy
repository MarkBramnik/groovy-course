package meeting2.ex6

import groovy.xml.MarkupBuilder

def xmlString = "<movie id='2'>the godfather</movie>"

def xmlWriter = new StringWriter()
def xmlMarkup = new MarkupBuilder(xmlWriter)

xmlMarkup.movie(id: "2", "the godfather")

assert xmlString == xmlWriter.toString()