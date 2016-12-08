package meeting2.ex6

def dependenciesText = '''
    <dependencies>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate</artifactId>
            <version>1.0</version>
        </dependency>
        <dependency attr="attrValue">
            <groupId>log4j</groupId>
            <artifactId>log4j</artifactId>
            <version>1.22</version>
        </dependency>
        <dependency>
            <groupId>org.redis</groupId>
            <artifactId>jedis</artifactId>
            <version>2.0</version>
        </dependency>
    </dependencies>
'''

def dependencies = new XmlSlurper().parseText(dependenciesText)
assert dependencies.dependency.size() == 3
assert dependencies.dependency[0].groupId == "org.hibernate"
assert dependencies.dependency[1].@attr == "attrValue"


// find dependencies with groupId starting with org
def response = dependencies.'**'.findAll { node ->
    node.groupId.text().startsWith('org')
}


assert response.size() == 2
assert response[0].groupId.text() == 'org.hibernate'
assert response[1].groupId.text() == 'org.redis'


