package io.mazaryn.data.model 

import java.time.LocalDate
import java.time.LocalDateTime
data class Post(
    val id: String? = null,
    var content: String? = null,
    var author: String = null,
    var comments: String = null,
    var dateCreated: LocalDateTime,
    var dateUpdated: LocalDateTime
)