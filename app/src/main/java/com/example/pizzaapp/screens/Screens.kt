package com.example.pizzaapp.screens

sealed class Screens(val route: String){
    object PickScreen: Screens("pick_screen")
    object PayScreen: Screens("pay_screen")
}
