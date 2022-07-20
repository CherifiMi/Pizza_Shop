package com.example.pizzaapp.screens.pizza_pick

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.pizzaapp.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@HiltViewModel
class PickViewModel @Inject constructor(
    private val repository: Repository,
    application: Application
): AndroidViewModel(application)
{
    var data = flow {
        emit(repository.getPizzaList().toString())
    }
}