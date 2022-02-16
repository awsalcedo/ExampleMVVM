package asalcedo.com.examplemvvm.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import asalcedo.com.examplemvvm.data.model.QuoteModel
import asalcedo.com.examplemvvm.data.model.QuoteProvider
import asalcedo.com.examplemvvm.domain.GetQuotesUseCase
import kotlinx.coroutines.launch

/****
 * Project: ExampleMVVM
 * From: asalcedo.com.examplemvvm.ui.viewmodel
 * Created by Alex Salcedo Silva on 14/2/22 at 23:18
 * All rights reserve 2022.
 ***/
class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()
    val isLoading = MutableLiveData<Boolean>()

    val getQuotesUseCase = GetQuotesUseCase()

    fun onCreate() {
        //Llamada al usecase
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getQuotesUseCase()

            if (!result.isNullOrEmpty()) {
                quoteModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }

    fun randomQuote() {
        isLoading.postValue(true)



        isLoading.postValue(false)
    }


}