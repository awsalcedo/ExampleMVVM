package asalcedo.com.examplemvvm.data.network

import asalcedo.com.examplemvvm.core.RetrofitHelper
import asalcedo.com.examplemvvm.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import retrofit2.create
import javax.inject.Inject

/****
 * Project: ExampleMVVM
 * From: asalcedo.com.examplemvvm.data.network
 * Created by Alex Salcedo Silva on 15/2/22 at 21:39
 * All rights reserve 2022.
 ***/
class QuoteService @Inject constructor(private val api: QuoteApiClient) {

    suspend fun getQuotes(): List<QuoteModel> {
        return withContext(Dispatchers.IO) {
            val response: Response<List<QuoteModel>> =
                api.getAllQuotes()
            response.body() ?: emptyList()
        }

    }
}