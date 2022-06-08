package io.jyryuitpro.aop.part3.chapter07

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("/v3/40062d8e-ae8a-4978-a52b-21eeac224daf")
    fun getHouseList(): Call<HouseDto>
}