package com.spider.iexcrawler.repository

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class CompanyRepository(
        private val jdbcTemplate: JdbcTemplate
)