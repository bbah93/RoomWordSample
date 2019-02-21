package nyc.bbah.roomwordsample.data

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

//In this instance we are specifying the entity name.
//By default it is the class name
@Entity(tableName = "word_table")
data class Word(@PrimaryKey @ColumnInfo(name = "word")val word: String){


}