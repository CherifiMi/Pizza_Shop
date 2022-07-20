package com.example.pizzaapp.di

import com.example.pizzaapp.data.remote.PizzaApi
import com.example.pizzaapp.data.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRepository(api: PizzaApi): Repository{
        return Repository(api)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases{
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            insertNote = InsertNote(repository),
            getNote = GetNote(repository)
        )
    }

    /*@Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabas{
        return Room.databaseBuilder(
            app,
            NoteDatabas::class.java,
            NoteDatabas.DATABSE_NAME
        ).build()
    }



    */

}