package asalcedo.com.examplemvvm.domain

import asalcedo.com.examplemvvm.data.QuoteRepository
import asalcedo.com.examplemvvm.domain.model.QuoteItem
import javax.inject.Inject

/****
 * Project: ExampleMVVM
 * From: asalcedo.com.examplemvvm.domain
 * Created by Alex Salcedo Silva on 15/2/22 at 22:49
 * All rights reserve 2022.
 ***/
class GetRandomQuoteUseCase @Inject constructor(private val repository: QuoteRepository) {

    suspend operator fun invoke(): QuoteItem? {
        val quotes = repository.getQuotesFromDatabase()
        if (!quotes.isNullOrEmpty()) {
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}