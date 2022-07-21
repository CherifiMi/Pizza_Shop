package com.example.pizzaapp.data.repository

import com.example.pizzaapp.data.remote.PizzaApi
import com.example.pizzaapp.domain.model.PizzaList
import com.example.pizzaapp.domain.repository.PizzaRepository
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(private val pizzaApi: PizzaApi): PizzaRepository {

    override suspend fun getPizzaList(): PizzaList {
        return pizzaApi.getPizzaList()
    }
}