package com.example.good

import com.google.gson.annotations.SerializedName

data class Response (

    @SerializedName("Q_text")
    val Q_text: String,

    @SerializedName("A_text")
    val A_text: String

    )