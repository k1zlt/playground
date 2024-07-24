package com.example.basiccryptocurrencyapp.presentation.coin_list

import com.example.basiccryptocurrencyapp.domain.model.Coin


data class CoinListState (
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)