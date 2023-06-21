package com.example.project_massive_vacalam

data class LoginResponse(
    val token: String,
    val id_user: Int,
    val nama_user: String,
    val no_telepon: String,
    val email: String,
    val password: String,
    val role_userid_role_user: Int,
    val foto_profil: String?
)
