package com.example.pizzaapp.domain.repository

import com.example.pizzaapp.domain.model.PizzaList

interface PizzaRepository {
    suspend fun getPizzaList(): PizzaList
}