package com.example.pizzaapp.screens.pizza_pick

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pizzaapp.data.util.NetworkResult
import com.example.pizzaapp.domain.use_cases.GetPizzaListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class PickViewModel @Inject constructor(
    private val getPizzaListUseCase: GetPizzaListUseCase
) : ViewModel() {

    val test = "fuck you"

    init {
        getPizzaList()
    }

    private fun getPizzaList() {
        getPizzaListUseCase().onEach {
            when (it) {
                is NetworkResult.Loading -> {
                    Log.d("TESTAPI", "loading")
                }
                is NetworkResult.Success -> {
                    Log.d("TESTAPI", it.data.toString())
                }
                is NetworkResult.Error -> {
                    Log.d("TESTAPI", "error")
                }

            }
        }.launchIn(viewModelScope)
    }

}