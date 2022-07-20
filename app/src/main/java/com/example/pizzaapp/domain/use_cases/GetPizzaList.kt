package com.example.pizzaapp.domain.use_cases

import com.example.pizzaapp.data.repository.Repository
import com.example.pizzaapp.domain.model.PizzaList

class GetPizzaList (
    private val repository: Repository
){
    suspend operator fun invoke(): PizzaList?{
        return repository.getPizzaList().body()
    }
}