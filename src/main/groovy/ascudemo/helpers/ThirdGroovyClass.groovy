// src/main/groovy/ascudemo/SecondGroovyClass.groovy
package ascudemo.helpers

import groovy.sql.Sql
import groovy.util.logging.Slf4j
import org.springframework.beans.BeansException
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware

import javax.sql.DataSource

@Slf4j
class ThirdGroovyClass implements ApplicationContextAware {
    Sql sql

    void logSomeInfo() {
        // sql been initialized
        log.debug "sql: ${sql}"
    }

    @Override
    void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        DataSource dataSource = applicationContext.getBean('dataSource', DataSource)
        sql = new Sql(dataSource)
    }
}
