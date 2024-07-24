package com.example.basiccryptocurrencyapp.presentation.coin_detail

import com.example.basiccryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState (
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)