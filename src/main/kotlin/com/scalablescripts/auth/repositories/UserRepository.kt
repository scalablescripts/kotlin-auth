package com.scalablescripts.auth.repositories

import com.scalablescripts.auth.models.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Int> {
    fun findByEmail(email:String): User?
}