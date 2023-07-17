package io.mazaryn.data.model 

data class User(
    val id: String? = null,
    var username: String? = null,
    var email: String? = null,
    var password: String? = null,
    var follower: List<String>? = null,
    var following: List<String>? = null,
    var posts: List<Post> = null,
    var notif: List<String> = null
)