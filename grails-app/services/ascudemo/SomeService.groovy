// grails-app/services/ascudemo/SomeService.groovy
package ascudemo

import ascudemo.helpers.FirstGroovyClass
import ascudemo.helpers.SecondGroovyClass
import ascudemo.helpers.ThirdGroovyClass

class SomeService {

    FirstGroovyClass firstGroovyBean
    SecondGroovyClass secondGroovyBean
    ThirdGroovyClass thirdGroovyBean

    def logSomeInfo() {
        firstGroovyBean.logSomeInfo()
        secondGroovyBean.logSomeInfo()
        thirdGroovyBean.logSomeInfo()
    }
}
