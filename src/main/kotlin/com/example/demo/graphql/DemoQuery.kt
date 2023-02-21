package com.example.demo

import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component

@Component
class DemoQuery : Query {
    fun hello(): String {
        return "Hello World!"
    }
}
