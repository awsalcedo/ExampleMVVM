package asalcedo.com.examplemvvm.domain

import asalcedo.com.examplemvvm.data.QuoteRepository
import asalcedo.com.examplemvvm.domain.model.QuoteItem
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.RelaxedMockK
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

/****
 * Project: ExampleMVVM
 * From: asalcedo.com.examplemvvm.domain
 * Created by Alex Salcedo Silva on 18/2/22 at 21:42
 * All rights reserve 2022.
 */
class GetQuotesUseCaseTest {

    @RelaxedMockK
    private lateinit var repository: QuoteRepository

    lateinit var getQuotesUseCase: GetQuotesUseCase

    @Before
    fun onBefore() {
        //Inicializar la libreria de Mock
        MockKAnnotations.init(this)
        getQuotesUseCase = GetQuotesUseCase(repository)
    }

    @Test
    fun `when the api doesnt return anything then get values from database`() = runBlocking {
        //Given
        // si no tuviera coroutines se debe usar every, tener en cuenta que es returns
        coEvery { repository.getAllQuotesFromApi() } returns emptyList()

        //When
        getQuotesUseCase()

        //Then
        coVerify(exactly = 1) { repository.getQuotesFromDatabase() }
    }

    @Test
    fun `when the api return something then get values from api`() = runBlocking {
        //Given
        val quoteList = listOf(QuoteItem("Android Developer", "Alex Salcedo"))
        coEvery { repository.getAllQuotesFromApi() } returns quoteList

        //When
        val response = getQuotesUseCase()

        //Then
        coVerify(exactly = 1) { repository.clearQuotes() }
        coVerify(exactly = 1) { repository.insertQuotes(any()) }

        //Verificamos que no se llame a repository.getQuotesFromDatabase()
        coVerify(exactly = 0) { repository.getQuotesFromDatabase() }
        assert(quoteList == response)
    }
}