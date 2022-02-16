package asalcedo.com.examplemvvm.data.network

import asalcedo.com.examplemvvm.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

/****
 * Project: ExampleMVVM
 * From: asalcedo.com.examplemvvm.data.network
 * Created by Alex Salcedo Silva on 15/2/22 at 21:35
 * All rights reserve 2022.
 ***/
interface QuoteApiClient {
    @GET("/.json")
    suspend fun getAllQuotes(): Response<List<QuoteModel>>
}