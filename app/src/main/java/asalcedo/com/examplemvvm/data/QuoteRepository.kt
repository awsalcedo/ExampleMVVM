package asalcedo.com.examplemvvm.data

import asalcedo.com.examplemvvm.data.model.QuoteModel
import asalcedo.com.examplemvvm.data.model.QuoteProvider
import asalcedo.com.examplemvvm.data.network.QuoteService

/****
 * Project: ExampleMVVM
 * From: asalcedo.com.examplemvvm.data
 * Created by Alex Salcedo Silva on 15/2/22 at 21:46
 * All rights reserve 2022.
 * Clase encargada de gestionar si accedemos a la parte de network o de database o a cualquier
 * fuente de datos
 ***/
class QuoteRepository {
    private val api = QuoteService()
    suspend fun getAllQuotes(): List<QuoteModel> {
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}