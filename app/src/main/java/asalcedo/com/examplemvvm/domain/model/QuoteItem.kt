package asalcedo.com.examplemvvm.domain.model

import asalcedo.com.examplemvvm.data.database.entities.QuoteEntity
import asalcedo.com.examplemvvm.data.model.QuoteModel

/*
Modelo de datos con el cual la capa de dominio y ui va a trabajar
 */
data class QuoteItem(val quote: String, val author: String)

fun QuoteModel.toDomain() = QuoteItem(quote, author)
fun QuoteEntity.toDomain() = QuoteItem(quote, author)


