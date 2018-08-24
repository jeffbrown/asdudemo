// grails-app/controllers/ascudemo/DemoController.groovy
package ascudemo

class DemoController {

    SomeService someService

    def index() {
        someService.logSomeInfo()
        render 'Success'
    }
}
