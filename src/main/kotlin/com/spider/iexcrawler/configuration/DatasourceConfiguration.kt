package com.spider.iexcrawler.configuration

import com.zaxxer.hikari.HikariDataSource
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.core.JdbcTemplate
import javax.sql.DataSource

@Configuration
class DatasourceConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "datasource")
    fun crawlerSource(): DataSource = HikariDataSource()

    @Bean
    fun jdbcTemplate(crawlerSource: DataSource): JdbcTemplate {
        return JdbcTemplate(crawlerSource, false)
    }
}