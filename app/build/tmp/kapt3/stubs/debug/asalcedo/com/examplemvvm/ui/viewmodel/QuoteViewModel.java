package asalcedo.com.examplemvvm.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import asalcedo.com.examplemvvm.domain.GetQuotesUseCase;
import asalcedo.com.examplemvvm.domain.GetRandomQuoteUseCase;
import asalcedo.com.examplemvvm.domain.model.QuoteItem;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

/**
 * **
 * Project: ExampleMVVM
 * From: asalcedo.com.examplemvvm.ui.viewmodel
 * Created by Alex Salcedo Silva on 14/2/22 at 23:18
 * All rights reserve 2022.
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lasalcedo/com/examplemvvm/ui/viewmodel/QuoteViewModel;", "Landroidx/lifecycle/ViewModel;", "getQuotesUseCase", "Lasalcedo/com/examplemvvm/domain/GetQuotesUseCase;", "getRandomQuoteUseCase", "Lasalcedo/com/examplemvvm/domain/GetRandomQuoteUseCase;", "(Lasalcedo/com/examplemvvm/domain/GetQuotesUseCase;Lasalcedo/com/examplemvvm/domain/GetRandomQuoteUseCase;)V", "isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "()Landroidx/lifecycle/MutableLiveData;", "quoteModel", "Lasalcedo/com/examplemvvm/domain/model/QuoteItem;", "getQuoteModel", "onCreate", "", "randomQuote", "app_debug"})
public final class QuoteViewModel extends androidx.lifecycle.ViewModel {
    private final asalcedo.com.examplemvvm.domain.GetQuotesUseCase getQuotesUseCase = null;
    private final asalcedo.com.examplemvvm.domain.GetRandomQuoteUseCase getRandomQuoteUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<asalcedo.com.examplemvvm.domain.model.QuoteItem> quoteModel = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading = null;
    
    @javax.inject.Inject()
    public QuoteViewModel(@org.jetbrains.annotations.NotNull()
    asalcedo.com.examplemvvm.domain.GetQuotesUseCase getQuotesUseCase, @org.jetbrains.annotations.NotNull()
    asalcedo.com.examplemvvm.domain.GetRandomQuoteUseCase getRandomQuoteUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<asalcedo.com.examplemvvm.domain.model.QuoteItem> getQuoteModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void onCreate() {
    }
    
    public final void randomQuote() {
    }
}