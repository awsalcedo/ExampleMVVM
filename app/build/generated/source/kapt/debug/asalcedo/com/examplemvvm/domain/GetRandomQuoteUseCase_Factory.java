// Generated by Dagger (https://dagger.dev).
package asalcedo.com.examplemvvm.domain;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetRandomQuoteUseCase_Factory implements Factory<GetRandomQuoteUseCase> {
  @Override
  public GetRandomQuoteUseCase get() {
    return newInstance();
  }

  public static GetRandomQuoteUseCase_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static GetRandomQuoteUseCase newInstance() {
    return new GetRandomQuoteUseCase();
  }

  private static final class InstanceHolder {
    private static final GetRandomQuoteUseCase_Factory INSTANCE = new GetRandomQuoteUseCase_Factory();
  }
}