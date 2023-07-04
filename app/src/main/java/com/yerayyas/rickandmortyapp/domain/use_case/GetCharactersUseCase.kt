package com.yerayyas.rickandmortyapp.domain.use_case

import com.yerayyas.rickandmortyapp.data.Result
import com.yerayyas.rickandmortyapp.domain.model.Characters
import com.yerayyas.rickandmortyapp.domain.repositories.CharacterRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(
    private val repository: CharacterRepository
) {
    operator fun invoke(page:Int): Flow<Result<List<Characters>>>{
        return repository.getCharacters(page)
    }
}