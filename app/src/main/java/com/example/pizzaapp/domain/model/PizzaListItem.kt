package com.example.pizzaapp.domain.model


import com.google.gson.annotations.SerializedName

data class PizzaListItem(
    @SerializedName("dec")
    val dec: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("ing")
    val ing: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("pic_url")
    val picUrl: String,
    @SerializedName("prices")
    val prices: String,
    @SerializedName("rating")
    val rating: Double
)