package com.example.pizzaapp.data.remote

import com.example.pizzaapp.domain.model.PizzaList
import retrofit2.Response
import retrofit2.http.GET

interface PizzaApi {

    @GET("/pizzas")
    suspend fun getPizzaList():PizzaList
}