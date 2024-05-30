package com.journaldev.maproutebetweenmarkers.data.remote

import com.journaldev.maproutebetweenmarkers.data.local.DirectionsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface DirectionsApiService {
    @GET
    fun getDirections(@Url url: String): Call<DirectionsResponse>
}