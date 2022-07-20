package com.example.pizzaapp.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    /*@Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabas{
        return Room.databaseBuilder(
            app,
            NoteDatabas::class.java,
            NoteDatabas.DATABSE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabas): NoteRepository{
        return NoteRepositoryImp(db.noteDao)
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
    }*/

}