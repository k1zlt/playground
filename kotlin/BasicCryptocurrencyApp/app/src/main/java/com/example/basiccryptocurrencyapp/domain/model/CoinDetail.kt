package com.example.basiccryptocurrencyapp.domain.model

import com.example.basiccryptocurrencyapp.data.remote.dto.TeamMember

data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
//    @SerializedName("is_active")
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<TeamMember>
)