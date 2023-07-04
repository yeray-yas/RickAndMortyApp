package com.yerayyas.rickandmortyapp.data.data_source.remote.dto


import com.google.gson.annotations.SerializedName
import com.yerayyas.rickandmortyapp.domain.model.Characters

data class CharactersDto(
    @SerializedName("info")
    val info: Info,
    @SerializedName("results")
    val results: List<Result>
)

fun CharactersDto.toListCharacters(): List<Characters> {
    val resultEntries = results.mapIndexed { _, entries ->
        Characters(
            id = entries.id,
            name = entries.name,
            specie = entries.species,
            image = entries.image
        )
    }
    return resultEntries
}