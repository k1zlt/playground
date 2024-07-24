package com.example.basiccryptocurrencyapp.domain.repository

import com.example.basiccryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.example.basiccryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}