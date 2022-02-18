package asalcedo.com.examplemvvm.domain

import asalcedo.com.examplemvvm.data.QuoteRepository
import asalcedo.com.examplemvvm.data.database.entities.toDatabase
import asalcedo.com.examplemvvm.domain.model.QuoteItem
import javax.inject.Inject

/****
 * Project: ExampleMVVM
 * From: asalcedo.com.examplemvvm.domain
 * Created by Alex Salcedo Silva on 15/2/22 at 22:10
 * All rights reserve 2022.
 ***/

class GetQuotesUseCase @Inject constructor(private val repository: QuoteRepository) {

    suspend operator fun invoke(): List<QuoteItem> {
        val quotes = repository.getAllQuotesFromApi()
        return if (quotes.isNotEmpty()) {
            repository.clearQuotes()
            repository.insertQuotes(quotes.map { it.toDatabase() })
            // retorne la última linea
            quotes
        } else {
            repository.getQuotesFromDatabase()
        }
    }
}