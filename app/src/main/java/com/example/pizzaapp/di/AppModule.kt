package com.example.pizzaapp.di

import com.example.pizzaapp.data.remote.PizzaApi
import com.example.pizzaapp.data.repository.Repository
import com.example.pizzaapp.data.util.Constants.Companion.BASE_URL
import com.example.pizzaapp.domain.repository.PizzaRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePizzaApi(): PizzaApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PizzaApi::class.java)
    }

    @Provides
    @Singleton
    fun provideRepository(api: PizzaApi): PizzaRepository {
        return Repository(api)
    }

}