// src/main/groovy/ascudemo/FirstGroovyClass.groovy
package ascudemo.helpers

import groovy.sql.Sql
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.InitializingBean

import javax.sql.DataSource

@Slf4j
class FirstGroovyClass implements InitializingBean {
    DataSource dataSource
    Sql sql

    void logSomeInfo() {
        // both have been initialized
        log.debug "dataSource: ${dataSource}"
        log.debug "sql: ${sql}"
    }

    @Override
    void afterPropertiesSet() throws Exception {
        sql = new Sql(dataSource)
    }
}
