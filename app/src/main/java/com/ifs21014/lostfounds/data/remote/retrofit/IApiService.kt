package com.ifs21014.lostfounds.data.remote.retrofit

import com.ifs21014.lostfounds.data.remote.response.*
import retrofit2.http.DELETE
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface IApiService {
    @FormUrlEncoded
    @POST("auth/register")
    suspend fun register(
        @Field("name") name: String,
        @Field("email") email: String,
        @Field("password") password: String
    ): DelcomResponse

    @FormUrlEncoded
    @POST("auth/login")
    suspend fun login(
        @Field("email") email: String,
        @Field("password") password: String
    ): DelcomLoginResponse

    @GET("users/me")
    suspend fun getMe(): DelcomUserResponse

    @FormUrlEncoded
    @POST("lost-founds")
    suspend fun postLostFound(
        @Field("title") title: String,
        @Field("description") description: String
    ): DelcomAddLostFoundResponse

    @FormUrlEncoded
    @PUT("lost-founds/{id}")
    suspend fun putLostFound(
        @Path("id") id: Int,
        @Field("title") title: String,
        @Field("description") description: String,
        @Field("is_finished") isFinished: Int
    ): DelcomResponse

    @GET("lost-founds")
    suspend fun getLostFounds(
        @Query("is_finished") isFinished: Int?
    ): DelcomLostFoundsResponse

    @GET("lost-founds/{id}")
    suspend fun getLostFound(
        @Path("id") id: Int
    ): DelcomLostFoundResponse

    @DELETE("lost-founds/{id}")
    suspend fun deleteLostFound(
        @Path("id") id: Int
    ): DelcomResponse
}
