package asalcedo.com.examplemvvm.data.network;

import asalcedo.com.examplemvvm.core.RetrofitHelper;
import asalcedo.com.examplemvvm.data.model.QuoteModel;
import kotlinx.coroutines.Dispatchers;
import retrofit2.Response;
import javax.inject.Inject;

/**
 * **
 * Project: ExampleMVVM
 * From: asalcedo.com.examplemvvm.data.network
 * Created by Alex Salcedo Silva on 15/2/22 at 21:39
 * All rights reserve 2022.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lasalcedo/com/examplemvvm/data/network/QuoteService;", "", "api", "Lasalcedo/com/examplemvvm/data/network/QuoteApiClient;", "(Lasalcedo/com/examplemvvm/data/network/QuoteApiClient;)V", "getQuotes", "", "Lasalcedo/com/examplemvvm/data/model/QuoteModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class QuoteService {
    private final asalcedo.com.examplemvvm.data.network.QuoteApiClient api = null;
    
    @javax.inject.Inject()
    public QuoteService(@org.jetbrains.annotations.NotNull()
    asalcedo.com.examplemvvm.data.network.QuoteApiClient api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getQuotes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<asalcedo.com.examplemvvm.data.model.QuoteModel>> continuation) {
        return null;
    }
}