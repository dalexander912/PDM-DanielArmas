package com.pdm0126.laboratorio4.screens.ListScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import com.pdm0126.laboratorio4.Lab5Application
import com.pdm0126.laboratorio4.data.database.repository.TaskRepository
import com.pdm0126.laboratorio4.data.models.Task
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class TasksViewModel(
  private val taskRepository: TaskRepository
) : ViewModel() {

  val tasks: StateFlow<List<Task>> =
    taskRepository.getTasks()
      .stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5_000),
        initialValue = emptyList()
      )

  fun addTask(task: Task) {
    viewModelScope.launch {
      taskRepository.addTask(task)
    }
  }

  companion object {
    val Factory = viewModelFactory {
      initializer {
        val app = this[APPLICATION_KEY] as Lab5Application
        TasksViewModel(app.appProvider.provideTaskRepository())
      }
    }
  }
}