// grails-app/controllers/ascudemo/DemoController.groovy
package ascudemo

import ascudemo.helpers.FirstGroovyClass
import ascudemo.helpers.SecondGroovyClass
import ascudemo.helpers.ThirdGroovyClass

class DemoController {

    FirstGroovyClass firstGroovyBean
    SecondGroovyClass secondGroovyBean
    ThirdGroovyClass thirdGroovyBean

    def index() {
        firstGroovyBean.logSomeInfo()
        secondGroovyBean.logSomeInfo()
        thirdGroovyBean.logSomeInfo()
        render 'Success'
    }
}
