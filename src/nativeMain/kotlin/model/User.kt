
class User {
    private var id: Int
    private var username: String =""
    private var email: String =""
    private var password: String =""

    constructor(
        id: Int, username: String, email: String, password: String
    )
    {
        this.id = id
        this.usename = username
        this.email = email
        this.password = password
    }

    // Getters and Setters
    fun getId(): Int {
        return id
    }
    fun setId(id: Int) {
        this.id = id
    }

    fun getUsername(): String {
        return username
    }
    fun setUsername(username: String) {
        this.username = username
    }
}