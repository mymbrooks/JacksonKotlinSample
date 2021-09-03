package com.example.jacksonkotlinsample

class UserModel {
    var id = 0
    var username: String? = null
    var realname: String? = null
    var password: String? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as UserModel

        if (id != other.id) return false
        if (username != other.username) return false
        if (realname != other.realname) return false
        if (password != other.password) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + (username?.hashCode() ?: 0)
        result = 31 * result + (realname?.hashCode() ?: 0)
        result = 31 * result + (password?.hashCode() ?: 0)

        return result
    }
}