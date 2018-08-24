// grails-app/conf/spring/resources.groovy
import ascudemo.helpers.FirstGroovyClass
import ascudemo.helpers.SecondGroovyClass
import ascudemo.helpers.ThirdGroovyClass

beans = {
    // demonstrates one approach
    firstGroovyBean(FirstGroovyClass) { bean ->
        bean.autowire = 'byName'
    }

    // demonstrates another approach
    secondGroovyBean(SecondGroovyClass) { bean ->
        bean.autowire = 'byName'
    }

    // demonstrates a third approach
    thirdGroovyBean ThirdGroovyClass
}
