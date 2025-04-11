package com.example.coincapapp.services

import com.example.coincapapp.models.Asset
import com.example.coincapapp.models.AssetsResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import javax.inject.Inject

class CoinCapApiService @Inject constructor(
    private val client: HttpClient //Extraer del constructor de dependencias
){
    suspend fun getAssets(): AssetsResponse{
        val response: HttpResponse = client.get( urlString = "https://rest.coincap.io/v3/assets?apiKey=31e2cf8b42bd1408e182ff1669ed6928cbedc89687c6c3d7d8d9bf733e01684b")
        return response.body()
    }
}