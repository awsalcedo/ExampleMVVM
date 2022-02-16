package asalcedo.com.examplemvvm.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/****
 * Project: ExampleMVVM
 * From: asalcedo.com.examplemvvm.core
 * Created by Alex Salcedo Silva on 15/2/22 at 17:31
 * All rights reserve 2022.
 ***/
object RetrofitHelper {
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://drawsomething-59328-default-rtdb.europe-west1.firebasedatabase.app")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}