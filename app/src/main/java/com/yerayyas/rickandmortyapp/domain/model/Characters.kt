package com.yerayyas.rickandmortyapp.domain.model

import com.google.gson.annotations.SerializedName

data class Characters(
    @SerializedName("id")
    val id:Int,
    @SerializedName("name")
    val name:String,
    @SerializedName("specie")
    val specie: String,
    @SerializedName("image")
    val image:String
)
