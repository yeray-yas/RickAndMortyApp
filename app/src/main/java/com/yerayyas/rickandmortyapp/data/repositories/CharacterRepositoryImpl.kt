package com.yerayyas.rickandmortyapp.data.repositories

import android.net.http.HttpException
import android.os.Build
import androidx.annotation.RequiresExtension
import com.yerayyas.rickandmortyapp.data.Result
import com.yerayyas.rickandmortyapp.data.data_source.remote.RickAndMortyApi
import com.yerayyas.rickandmortyapp.data.data_source.remote.dto.toCharacter
import com.yerayyas.rickandmortyapp.data.data_source.remote.dto.toListCharacters
import com.yerayyas.rickandmortyapp.domain.model.Character
import com.yerayyas.rickandmortyapp.domain.model.Characters
import com.yerayyas.rickandmortyapp.domain.repositories.CharacterRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(
    private val api: RickAndMortyApi
): CharacterRepository{

    @RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
    override fun getCharacters(page: Int): Flow<Result<List<Characters>>> = flow{
        emit(Result.Loading())
        try {
            val response = api.getCharacters(page).toListCharacters()
            emit(Result.Success(response))
        }catch (e: HttpException){
            emit(Result.Error(
                message = "Oops, something went wrong",
                data = null
            ))
        }catch (e: IOException){
            emit(Result.Error(
                message = "Couldn't reach server, check your internet connection",
                data = null
            ))
        }
    }

    override suspend fun getCharacter(id: Int): Result<Character> {
        val response = try {
            api.getCharacter(id)
        }catch (e:Exception){
            return Result.Error("An unknown error ocurred")
        }
        return Result.Success(response.toCharacter())
    }


}