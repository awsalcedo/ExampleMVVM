package asalcedo.com.examplemvvm.ui.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import asalcedo.com.examplemvvm.domain.GetQuotesUseCase
import asalcedo.com.examplemvvm.domain.GetRandomQuoteUseCase
import asalcedo.com.examplemvvm.domain.model.QuoteItem
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.RelaxedMockK
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.MockitoAnnotations


/****
 * Project: ExampleMVVM
 * From: asalcedo.com.examplemvvm.ui.viewmodel
 * Created by Alex Salcedo Silva on 20/2/22 at 19:27
 * All rights reserve 2022.
 */
@ExperimentalCoroutinesApi
class QuoteViewModelTest {

    @RelaxedMockK
    private lateinit var getQuotesUseCase: GetQuotesUseCase

    @RelaxedMockK
    private lateinit var getRandomQuoteUseCase: GetRandomQuoteUseCase

    private lateinit var quoteViewModel: QuoteViewModel

    //Para testear los liveData se crea una regla
    @get:Rule
    var rule: InstantTaskExecutorRule = InstantTaskExecutorRule()

    @Before
    fun onBefore() {
        MockKAnnotations.init(this)
        quoteViewModel = QuoteViewModel(getQuotesUseCase, getRandomQuoteUseCase)
        //Hay que cambiar el dispatcher porque no podemos emular la coroutine adaptada al test
        Dispatchers.setMain(Dispatchers.Unconfined)

    }

    @After
    fun onAfter() {
        Dispatchers.resetMain()
    }

    @Test
    fun `when viewmodel is created at the first time, get all quotes and set the first value`() =
        runTest {
            //Given
            val quoteList = listOf(
                QuoteItem("Hola", "Alex"), QuoteItem(
                    "Aprendiendo", "Testing Android"
                )
            )
            coEvery { getQuotesUseCase() } returns quoteList

            //When
            quoteViewModel.onCreate()

            //Then
            assert(quoteViewModel.quoteModel.value == quoteList.first())
        }

    @Test
    fun `when randomQuoteUseCase return a quote set on the livedata`() = runTest {
        //Give
        val quote = QuoteItem("Android Engineer", "Comming soom")
        coEvery { getRandomQuoteUseCase() } returns quote

        //When
        quoteViewModel.randomQuote()

        //Then
        assert(quoteViewModel.quoteModel.value == quote)
    }

    @Test
    fun `if randomQuoteUseCase return null keep the last value`() = runTest {
        //Given
        val quote = QuoteItem("Vamos a probar nulos", "Testing Android")
        quoteViewModel.quoteModel.value = quote
        coEvery { getRandomQuoteUseCase() } returns null

        //When
        quoteViewModel.randomQuote()

        //Then
        assert(quoteViewModel.quoteModel.value == quote)
    }
}