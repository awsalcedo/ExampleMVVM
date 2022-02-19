package asalcedo.com.examplemvvm.domain

import asalcedo.com.examplemvvm.data.QuoteRepository
import asalcedo.com.examplemvvm.domain.model.QuoteItem
import io.mockk.MockKAnnotations
import io.mockk.MockKGateway
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.RelaxedMockK
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

/****
 * Project: ExampleMVVM
 * From: asalcedo.com.examplemvvm.domain
 * Created by Alex Salcedo Silva on 19/2/22 at 00:09
 * All rights reserve 2022.
 */
class GetRandomQuoteUseCaseTest{
    @RelaxedMockK
    private lateinit var repository: QuoteRepository

    lateinit var quoteRandomQuoteUseCase: GetRandomQuoteUseCase

    @Before
    fun onBefore(){
        //Iniciar la libreria de Mock
        MockKAnnotations.init(this)
        quoteRandomQuoteUseCase = GetRandomQuoteUseCase(repository)
    }

    @Test
    fun `when database is empty then return null` () = runBlocking {
        //Given
        coEvery{ repository.getQuotesFromDatabase() } returns emptyList()

        //When
        val response = quoteRandomQuoteUseCase()

        //Then
        assert(response == null)
    }

    @Test
    fun `when datbase is not empty then return quote`() = runBlocking {
        //Given
        val quoteList = listOf(QuoteItem("Java", "Alex Salcedo"))
        coEvery { repository.getQuotesFromDatabase() } returns  quoteList

        //When
        val response = quoteRandomQuoteUseCase()

        //Then
        assert(response == quoteList.first())
    }
}