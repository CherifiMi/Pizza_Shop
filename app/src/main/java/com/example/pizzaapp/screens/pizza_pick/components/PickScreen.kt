package com.example.pizzaapp.screens.pizza_pick.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.pizzaapp.screens.pizza_pick.PickViewModel


@Composable
fun PickScreen(
    viewModel: PickViewModel = hiltViewModel()
) {

    Greeting(viewModel.test)
    //Log.d("TESTAPI", viewModel.hi)
}

@Composable
fun Greeting(name: String) {
    Text(text = name)
}