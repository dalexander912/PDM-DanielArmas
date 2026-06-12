package com.pdm0126.laboratorio4.data

import android.content.Context
import com.pdm0126.laboratorio4.data.database.AppDatabase
import com.pdm0126.laboratorio4.data.database.repository.TaskRepository

class AppProvider(context: Context) {

  private val appDatabase = AppDatabase.getDatabase(context)
  private val taskDao = appDatabase.taskDao()

  private val taskRepository: TaskRepository =
    TaskRepository(taskDao)

  fun provideTaskRepository(): TaskRepository {
    return taskRepository
  }
}