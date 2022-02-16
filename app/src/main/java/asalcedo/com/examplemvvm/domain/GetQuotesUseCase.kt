package asalcedo.com.examplemvvm.domain

import asalcedo.com.examplemvvm.data.QuoteRepository
import asalcedo.com.examplemvvm.data.model.QuoteModel

/****
 * Project: ExampleMVVM
 * From: asalcedo.com.examplemvvm.domain
 * Created by Alex Salcedo Silva on 15/2/22 at 22:10
 * All rights reserve 2022.
 ***/
class GetQuotesUseCase {
    private val repository = QuoteRepository()

    suspend operator fun invoke(): List<QuoteModel>? = repository.getAllQuotes()
}