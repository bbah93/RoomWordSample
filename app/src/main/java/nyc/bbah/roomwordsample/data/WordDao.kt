package nyc.bbah.roomwordsample.data

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query


@Dao
interface WordDao {

    @Insert //Method to insert one word
    fun insert(word: Word)

    //Delete all entities from this table
    @Query("DELETE FROM word_table")
    fun deleteAll()


    @Query("SELECT * from word_table ORDER BY word ASC")
    fun getAllWords(): LiveData<List<Word>> //Function returns a List Object wrapped in a Live Data object


}