package com.example.basiccryptocurrencyapp.domain.model

data class Coin(
    val id: String,
//    @SerializedName("is_active")
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)