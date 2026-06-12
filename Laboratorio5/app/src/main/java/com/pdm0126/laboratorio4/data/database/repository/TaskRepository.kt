package com.pdm0126.laboratorio4.data.database.repository

import com.pdm0126.laboratorio4.data.database.dao.TaskDao
import com.pdm0126.laboratorio4.data.database.entities.toEntity
import com.pdm0126.laboratorio4.data.database.entities.toModel
import com.pdm0126.laboratorio4.data.models.Task
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class TaskRepository (
  private val taskDao: TaskDao
) {
  fun getTasks(): Flow<List<Task>> {
    return taskDao.getAllTasks().map { tasks ->
      tasks.map { it.toModel() }
    }
  }

  suspend fun addTask(task: Task){
    taskDao.insertTask(task.toEntity())
  }
}