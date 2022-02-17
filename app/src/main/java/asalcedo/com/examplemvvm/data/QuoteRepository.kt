package asalcedo.com.examplemvvm.data

import asalcedo.com.examplemvvm.data.model.QuoteModel
import asalcedo.com.examplemvvm.data.model.QuoteProvider
import asalcedo.com.examplemvvm.data.network.QuoteService
import javax.inject.Inject

/****
 * Project: ExampleMVVM
 * From: asalcedo.com.examplemvvm.data
 * Created by Alex Salcedo Silva on 15/2/22 at 21:46
 * All rights reserve 2022.
 * Clase encargada de gestionar si accedemos a la parte de network o de database o a cualquier
 * fuente de datos y a esta es a la que accedería desde la capa de domain
 ***/
class QuoteRepository @Inject constructor(
    private val api: QuoteService,
    private val quoteProvider: QuoteProvider
) {
    suspend fun getAllQuotes(): List<QuoteModel> {
        val response = api.getQuotes()
        quoteProvider.quotes = response
        return response
    }
}