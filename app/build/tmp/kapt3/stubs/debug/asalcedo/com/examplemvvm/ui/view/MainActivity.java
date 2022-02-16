package asalcedo.com.examplemvvm.ui.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.lifecycle.Observer;
import asalcedo.com.examplemvvm.databinding.ActivityMainBinding;
import asalcedo.com.examplemvvm.ui.viewmodel.QuoteViewModel;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lasalcedo/com/examplemvvm/ui/view/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lasalcedo/com/examplemvvm/databinding/ActivityMainBinding;", "quoteViewModel", "Lasalcedo/com/examplemvvm/ui/viewmodel/QuoteViewModel;", "getQuoteViewModel", "()Lasalcedo/com/examplemvvm/ui/viewmodel/QuoteViewModel;", "quoteViewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private asalcedo.com.examplemvvm.databinding.ActivityMainBinding binding;
    private final kotlin.Lazy quoteViewModel$delegate = null;
    
    public MainActivity() {
        super();
    }
    
    private final asalcedo.com.examplemvvm.ui.viewmodel.QuoteViewModel getQuoteViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}