package asalcedo.com.examplemvvm.data;

import asalcedo.com.examplemvvm.data.database.entities.QuoteEntity;
import asalcedo.com.examplemvvm.data.database.entities.dao.QuoteDao;
import asalcedo.com.examplemvvm.data.network.QuoteService;
import asalcedo.com.examplemvvm.domain.model.QuoteItem;
import javax.inject.Inject;

/**
 * **
 * Project: ExampleMVVM
 * From: asalcedo.com.examplemvvm.data
 * Created by Alex Salcedo Silva on 15/2/22 at 21:46
 * All rights reserve 2022.
 * Clase encargada de gestionar si accedemos a la parte de network o de database o a cualquier
 * fuente de datos y a esta es a la que accedería desde la capa de domain
 * El use case decide de donde va a tomar la data
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lasalcedo/com/examplemvvm/data/QuoteRepository;", "", "api", "Lasalcedo/com/examplemvvm/data/network/QuoteService;", "quoteDao", "Lasalcedo/com/examplemvvm/data/database/entities/dao/QuoteDao;", "(Lasalcedo/com/examplemvvm/data/network/QuoteService;Lasalcedo/com/examplemvvm/data/database/entities/dao/QuoteDao;)V", "clearQuotes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllQuotesFromApi", "", "Lasalcedo/com/examplemvvm/domain/model/QuoteItem;", "getQuotesFromDatabase", "insertQuotes", "quotes", "Lasalcedo/com/examplemvvm/data/database/entities/QuoteEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class QuoteRepository {
    private final asalcedo.com.examplemvvm.data.network.QuoteService api = null;
    private final asalcedo.com.examplemvvm.data.database.entities.dao.QuoteDao quoteDao = null;
    
    @javax.inject.Inject()
    public QuoteRepository(@org.jetbrains.annotations.NotNull()
    asalcedo.com.examplemvvm.data.network.QuoteService api, @org.jetbrains.annotations.NotNull()
    asalcedo.com.examplemvvm.data.database.entities.dao.QuoteDao quoteDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllQuotesFromApi(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<asalcedo.com.examplemvvm.domain.model.QuoteItem>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getQuotesFromDatabase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<asalcedo.com.examplemvvm.domain.model.QuoteItem>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertQuotes(@org.jetbrains.annotations.NotNull()
    java.util.List<asalcedo.com.examplemvvm.data.database.entities.QuoteEntity> quotes, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object clearQuotes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}