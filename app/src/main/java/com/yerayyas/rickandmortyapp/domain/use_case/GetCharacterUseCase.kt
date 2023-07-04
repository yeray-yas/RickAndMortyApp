package com.yerayyas.rickandmortyapp.domain.use_case

import com.yerayyas.rickandmortyapp.data.Result
import com.yerayyas.rickandmortyapp.domain.model.Character
import com.yerayyas.rickandmortyapp.domain.repositories.CharacterRepository
import javax.inject.Inject

class GetCharacterUseCase @Inject constructor(
    private val repository: CharacterRepository
) {
    suspend operator fun invoke(id: Int): Result<Character>{
        return repository.getCharacter(id)
    }
}