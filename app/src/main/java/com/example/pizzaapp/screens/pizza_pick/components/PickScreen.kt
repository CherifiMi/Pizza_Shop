package com.example.pizzaapp.screens.pizza_pick.components

import android.util.Log
import androidx.compose.runtime.Composable
import com.example.pizzaapp.screens.pizza_pick.PickViewModel
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun PickScreen (
    viewModel: PickViewModel = hiltViewModel()
){
    Log.d("TESTAPI", viewModel.data.toString())
}