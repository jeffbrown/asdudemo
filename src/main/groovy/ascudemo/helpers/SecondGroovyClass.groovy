// src/main/groovy/ascudemo/SecondGroovyClass.groovy
package ascudemo.helpers

import groovy.sql.Sql
import groovy.util.logging.Slf4j

import javax.annotation.PostConstruct
import javax.sql.DataSource

@Slf4j
class SecondGroovyClass {
    DataSource dataSource
    Sql sql

    void logSomeInfo() {
        // both have been initialized
        log.debug "dataSource: ${dataSource}"
        log.debug "sql: ${sql}"
    }

    @PostConstruct
    void initSql() throws Exception {
        sql = new Sql(dataSource)
    }
}
