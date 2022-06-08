package io.jyryuitpro.aop.part3.chapter07

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("/v3/e843a6d2-0da8-41ce-8cea-2a8bece95f48")
    fun getHouseList(): Call<HouseDto>
}