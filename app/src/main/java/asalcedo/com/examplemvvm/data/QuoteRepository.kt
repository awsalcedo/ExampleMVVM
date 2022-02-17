package asalcedo.com.examplemvvm.data

import asalcedo.com.examplemvvm.data.database.entities.dao.QuoteDao
import asalcedo.com.examplemvvm.data.network.QuoteService
import asalcedo.com.examplemvvm.domain.model.Quote
import asalcedo.com.examplemvvm.domain.model.toDomain
import javax.inject.Inject

/****
 * Project: ExampleMVVM
 * From: asalcedo.com.examplemvvm.data
 * Created by Alex Salcedo Silva on 15/2/22 at 21:46
 * All rights reserve 2022.
 * Clase encargada de gestionar si accedemos a la parte de network o de database o a cualquier
 * fuente de datos y a esta es a la que accedería desde la capa de domain
 * El use case decide de donde va a tomar la data
 ***/
class QuoteRepository @Inject constructor(
    private val api: QuoteService,
    private val quoteDao: QuoteDao
) {
    //Recupera las citas de internet y las devuelve al dominio
    suspend fun getAllQuotesFromApi(): List<Quote> {
        val response = api.getQuotes()
        return response.map { it.toDomain() } // hace uso del mapper
    }

    suspend fun getQuotesFromDatabase(): List<Quote> {
        val response = quoteDao.getAllQuotes()
        return response.map { it.toDomain() }
    }
}