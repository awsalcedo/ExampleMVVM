package asalcedo.com.examplemvvm.data.database.entities

import androidx.room.Database
import androidx.room.RoomDatabase
import asalcedo.com.examplemvvm.data.database.entities.dao.QuoteDao

@Database(entities = [QuoteEntity::class], version = 1)
abstract class QuoteDatabase : RoomDatabase() {
    abstract fun getQuoteDao(): QuoteDao
}