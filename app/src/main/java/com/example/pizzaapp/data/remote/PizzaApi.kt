package com.example.pizzaapp.data.remote

import com.example.pizzaapp.domain.model.PizzaList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT

interface PizzaApi {

    @POST("/orders")
    suspend fun postOrder()

    @GET("/pizzas")
    suspend fun getPizzaList():PizzaList
}