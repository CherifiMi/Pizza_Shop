package com.example.pizzaapp.screens.pizza_pick

import androidx.lifecycle.ViewModel
import com.example.pizzaapp.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@HiltViewModel
class PickViewModel @Inject constructor(

): ViewModel()
{
    var hi = "hi"

    //var data = flow {
    //    emit(repository.getPizzaList().toString())
    //}
}