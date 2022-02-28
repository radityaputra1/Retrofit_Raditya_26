package com.example.retrofit_raditya_26.api

import com.example.retrofit_raditya_26.model.IndonesiaResponse
import com.example.retrofit_raditya_26.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET
interface Api{
    @GET ("casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET ("casenumberprovince.json")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}