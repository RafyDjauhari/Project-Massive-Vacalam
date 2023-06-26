package com.example.project_massive_vacalam

import retrofit2.Call
import retrofit2.http.GET

interface WisataApiService {
    @GET("wisatawan/wisata")
    fun getWisataList(): Call<List<Wisata>> // Wisata adalah model data untuk representasi JSON dari API
}
