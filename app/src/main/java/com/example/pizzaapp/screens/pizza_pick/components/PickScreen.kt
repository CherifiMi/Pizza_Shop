package com.example.pizzaapp.screens.pizza_pick.components

import android.util.Log
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.pizzaapp.screens.pizza_pick.PickViewModel
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun PickScreen(viewModel: PickViewModel) {

    Greeting("hillo")
    Log.d("TESTAPI", viewModel.hi)
}

@Composable
fun Greeting(name: String) {
    Text(text = name)
}