package asalcedo.com.examplemvvm.domain

import asalcedo.com.examplemvvm.data.model.QuoteModel
import asalcedo.com.examplemvvm.data.model.QuoteProvider

/****
 * Project: ExampleMVVM
 * From: asalcedo.com.examplemvvm.domain
 * Created by Alex Salcedo Silva on 15/2/22 at 22:49
 * All rights reserve 2022.
 ***/
class GetRandomQuoteUseCase {

    operator fun invoke(): QuoteModel? {
        val quotes = QuoteProvider.quotes
        if (!quotes.isNullOrEmpty()) {
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}