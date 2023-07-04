package com.yerayyas.rickandmortyapp.data.data_source.remote.dto


import com.google.gson.annotations.SerializedName
import com.yerayyas.rickandmortyapp.domain.model.Character

data class CharacterDto(
    @SerializedName("created")
    val created: String,
    @SerializedName("episode")
    val episode: List<String>,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("location")
    val location: Location,
    @SerializedName("name")
    val name: String,
    @SerializedName("origin")
    val origin: Origin,
    @SerializedName("species")
    val species: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)

fun CharacterDto.toCharacter(): Character{
    return Character(
        id = id,
        name = name,
        status = status,
        specie = species,
        origin = origin,
        gender = gender,
        location = location,
        image = image
    )
}