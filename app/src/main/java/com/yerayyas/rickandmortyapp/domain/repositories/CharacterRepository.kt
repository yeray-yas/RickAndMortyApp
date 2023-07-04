package com.yerayyas.rickandmortyapp.domain.repositories


import com.yerayyas.rickandmortyapp.data.Result
import com.yerayyas.rickandmortyapp.domain.model.Character
import com.yerayyas.rickandmortyapp.domain.model.Characters
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {

    fun getCharacters(page:Int): Flow<Result<List<Characters>>>

    suspend fun getCharacter(id:Int): Result<Character>
}