// Generated by Dagger (https://dagger.dev).
package asalcedo.com.examplemvvm.ui.viewmodel;

import asalcedo.com.examplemvvm.domain.GetQuotesUseCase;
import asalcedo.com.examplemvvm.domain.GetRandomQuoteUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class QuoteViewModel_Factory implements Factory<QuoteViewModel> {
  private final Provider<GetQuotesUseCase> getQuotesUseCaseProvider;

  private final Provider<GetRandomQuoteUseCase> getRandomQuoteUseCaseProvider;

  public QuoteViewModel_Factory(Provider<GetQuotesUseCase> getQuotesUseCaseProvider,
      Provider<GetRandomQuoteUseCase> getRandomQuoteUseCaseProvider) {
    this.getQuotesUseCaseProvider = getQuotesUseCaseProvider;
    this.getRandomQuoteUseCaseProvider = getRandomQuoteUseCaseProvider;
  }

  @Override
  public QuoteViewModel get() {
    return newInstance(getQuotesUseCaseProvider.get(), getRandomQuoteUseCaseProvider.get());
  }

  public static QuoteViewModel_Factory create(Provider<GetQuotesUseCase> getQuotesUseCaseProvider,
      Provider<GetRandomQuoteUseCase> getRandomQuoteUseCaseProvider) {
    return new QuoteViewModel_Factory(getQuotesUseCaseProvider, getRandomQuoteUseCaseProvider);
  }

  public static QuoteViewModel newInstance(GetQuotesUseCase getQuotesUseCase,
      GetRandomQuoteUseCase getRandomQuoteUseCase) {
    return new QuoteViewModel(getQuotesUseCase, getRandomQuoteUseCase);
  }
}