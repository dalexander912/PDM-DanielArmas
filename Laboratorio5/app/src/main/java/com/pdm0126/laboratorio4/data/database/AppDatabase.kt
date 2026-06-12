package com.pdm0126.laboratorio4.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.pdm0126.laboratorio4.data.database.dao.TaskDao
import com.pdm0126.laboratorio4.data.models.Task

@Database(entities = [Task::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

  abstract fun taskDao(): TaskDao

  companion object {
    @Volatile
    private var INSTANCE: AppDatabase? = null

    fun getDatabase(context: Context): AppDatabase {
      return INSTANCE ?: synchronized(this) {
        Room.databaseBuilder(
          context = context.applicationContext,
          klass = AppDatabase::class.java,
          name = "AppDatabase"
        )
          .fallbackToDestructiveMigration(false)
          .build()
          .also { INSTANCE = it }
      }
    }
  }
}