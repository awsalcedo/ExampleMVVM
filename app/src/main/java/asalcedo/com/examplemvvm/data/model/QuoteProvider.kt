package asalcedo.com.examplemvvm.data.model

import javax.inject.Inject
import javax.inject.Singleton

/****
 * Project: ExampleMVVM
 * From: asalcedo.com.examplemvvm.data.model
 * Created by Alex Salcedo Silva on 14/2/22 at 23:08
 * All rights reserve 2022.
 ***/
@Singleton
class QuoteProvider @Inject constructor() {
    var quotes: List<QuoteModel> = emptyList()
}