package greeter

import spock.lang.Specification

class GreetingFormatterSpec2 extends Specification {

    def 'Creating a greeting 2'() {

        expect: 'The greeting to be correctly capitalized'
        GreetingFormatter.greeting('abcd') == 'Hello, Abcd'

    }
}
