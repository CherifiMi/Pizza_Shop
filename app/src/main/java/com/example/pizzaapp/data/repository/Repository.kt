package com.example.pizzaapp.data.repository

import com.example.pizzaapp.data.remote.PizzaApi
import com.example.pizzaapp.domain.model.PizzaList
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(private val pizzaApi: PizzaApi) {
    suspend fun getPizzaList() : Response<PizzaList> {
        return pizzaApi.getPizzaList()
    }
}