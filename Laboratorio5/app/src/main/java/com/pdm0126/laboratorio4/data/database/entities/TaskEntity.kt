package com.pdm0126.laboratorio4.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.pdm0126.laboratorio4.data.models.Task
import java.util.Date

@Entity(tableName = "tasks")
data class TaskEntity(
  @PrimaryKey val id: Int,
  val title: String,
  val description: String,
  val endDate: Date = Date(),
  val isCompleted: Boolean = false
)

fun TaskEntity.toModel(): Task {
  return Task(
    id = id,
    title = title,
    description = description,
    endDate = endDate,
    isCompleted = isCompleted
  )
}

fun Task.toEntity(): TaskEntity {
  return TaskEntity(
    id = id,
    title = title,
    description = description,
    endDate = endDate,
    isCompleted = isCompleted
  )
}