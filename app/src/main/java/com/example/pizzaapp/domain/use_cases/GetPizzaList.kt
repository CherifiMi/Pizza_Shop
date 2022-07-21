package com.example.pizzaapp.domain.use_cases

import com.example.pizzaapp.data.repository.Repository
import com.example.pizzaapp.data.util.NetworkResult
import com.example.pizzaapp.domain.model.PizzaList
import com.example.pizzaapp.domain.repository.PizzaRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import retrofit2.Response
import java.io.IOException
import javax.inject.Inject

class GetPizzaList @Inject constructor(
    private val repository: PizzaRepository
){
    operator fun invoke(): Flow<NetworkResult<PizzaList>> = flow {
        try {
            emit(NetworkResult.Loading<PizzaList>())
            val pizzaList = repository.getPizzaList()
            emit(NetworkResult.Success<PizzaList>(pizzaList))
        }catch (e: HttpException){
            emit(NetworkResult.Error<PizzaList>(e.localizedMessage ?: "somthin happend"))
        }catch (e: IOException){
            emit(NetworkResult.Error<PizzaList>("cant get to server"))
        }
    }

}