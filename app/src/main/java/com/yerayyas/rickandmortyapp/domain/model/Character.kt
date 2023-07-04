package com.yerayyas.rickandmortyapp.domain.model

import com.google.gson.annotations.SerializedName
import com.yerayyas.rickandmortyapp.data.data_source.remote.dto.Location
import com.yerayyas.rickandmortyapp.data.data_source.remote.dto.Origin


data class Character(
    @SerializedName("id")
    val id:Int,
    @SerializedName("name")
    val name:String,
    @SerializedName("status")
    val status:String,
    @SerializedName("specie")
    val specie: String,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("origin")
    val origin: Origin,
    @SerializedName("location")
    val location:Location,
    @SerializedName("image")
    val image:String
)
