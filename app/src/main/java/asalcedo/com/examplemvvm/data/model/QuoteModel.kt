package asalcedo.com.examplemvvm.data.model

import com.google.gson.annotations.SerializedName

/****
 * Project: ExampleMVVM
 * From: asalcedo.com.examplemvvm.data.model
 * Created by Alex Salcedo Silva on 14/2/22 at 23:07
 * All rights reserve 2022.
 ***/
data class QuoteModel(
    @SerializedName("quote") val quote: String,
    @SerializedName("author") val author: String
)
