package com.example.good

import retrofit2.Call
import retrofit2.http.*

interface Service {

    @GET("/app_faq/1")
    fun getq(): Call<Response>

    @GET("/app_faq/{page}")
    fun getpage(@Path("page")page: String):Call<Response>

    @FormUrlEncoded
    @POST("/app_faq/")
    fun getObject(@Field("idx")idx : String): Call<Response>

}