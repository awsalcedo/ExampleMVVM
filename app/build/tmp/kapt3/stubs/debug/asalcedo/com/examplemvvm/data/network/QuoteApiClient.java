package asalcedo.com.examplemvvm.data.network;

import asalcedo.com.examplemvvm.data.model.QuoteModel;
import retrofit2.Response;
import retrofit2.http.GET;

/**
 * **
 * Project: ExampleMVVM
 * From: asalcedo.com.examplemvvm.data.network
 * Created by Alex Salcedo Silva on 15/2/22 at 21:35
 * All rights reserve 2022.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lasalcedo/com/examplemvvm/data/network/QuoteApiClient;", "", "getAllQuotes", "Lretrofit2/Response;", "", "Lasalcedo/com/examplemvvm/data/model/QuoteModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface QuoteApiClient {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/.json")
    public abstract java.lang.Object getAllQuotes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<asalcedo.com.examplemvvm.data.model.QuoteModel>>> continuation);
}