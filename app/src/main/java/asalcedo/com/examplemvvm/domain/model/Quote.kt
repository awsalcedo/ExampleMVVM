package asalcedo.com.examplemvvm.domain.model

import asalcedo.com.examplemvvm.data.database.entities.QuoteEntity
import asalcedo.com.examplemvvm.data.model.QuoteModel

/*
Modelo de datos con el cual la capa de dominio y ui va a trabajar
 */
data class Quote(val quote: String, val author: String)

fun QuoteModel.toDomain() = Quote(quote, author)
fun QuoteEntity.toDomain() = Quote(quote, author)


