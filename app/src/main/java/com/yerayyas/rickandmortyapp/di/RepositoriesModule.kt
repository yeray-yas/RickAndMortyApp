package com.yerayyas.rickandmortyapp.di

import com.yerayyas.rickandmortyapp.data.repositories.CharacterRepositoryImpl
import com.yerayyas.rickandmortyapp.domain.repositories.CharacterRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoriesModule {

    @Binds
    abstract fun bindCharacterRepository(impl: CharacterRepositoryImpl): CharacterRepository
}