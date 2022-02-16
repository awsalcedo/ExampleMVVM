package asalcedo.com.examplemvvm.data;

import asalcedo.com.examplemvvm.data.model.QuoteModel;
import asalcedo.com.examplemvvm.data.model.QuoteProvider;
import asalcedo.com.examplemvvm.data.network.QuoteService;

/**
 * **
 * Project: ExampleMVVM
 * From: asalcedo.com.examplemvvm.data
 * Created by Alex Salcedo Silva on 15/2/22 at 21:46
 * All rights reserve 2022.
 * Clase encargada de gestionar si accedemos a la parte de network o de database o a cualquier
 * fuente de datos y a esta es a la que accedería desde la capa de domain
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lasalcedo/com/examplemvvm/data/QuoteRepository;", "", "()V", "api", "Lasalcedo/com/examplemvvm/data/network/QuoteService;", "getAllQuotes", "", "Lasalcedo/com/examplemvvm/data/model/QuoteModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class QuoteRepository {
    private final asalcedo.com.examplemvvm.data.network.QuoteService api = null;
    
    public QuoteRepository() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllQuotes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<asalcedo.com.examplemvvm.data.model.QuoteModel>> continuation) {
        return null;
    }
}