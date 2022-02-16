package asalcedo.com.examplemvvm.data.network

import asalcedo.com.examplemvvm.core.RetrofitHelper
import asalcedo.com.examplemvvm.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import retrofit2.create

/****
 * Project: ExampleMVVM
 * From: asalcedo.com.examplemvvm.data.network
 * Created by Alex Salcedo Silva on 15/2/22 at 21:39
 * All rights reserve 2022.
 ***/
class QuoteService {
    private val retrofit = RetrofitHelper.getRetrofit()
    suspend fun getQuotes(): List<QuoteModel> {
        return withContext(Dispatchers.IO) {
            val response: Response<List<QuoteModel>> =
                retrofit.create(QuoteApiClient::class.java).getAllQuotes()
            response.body() ?: emptyList()
        }

    }
}