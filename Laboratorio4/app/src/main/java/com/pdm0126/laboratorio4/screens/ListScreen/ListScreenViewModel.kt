package com.pdm0126.laboratorio4.screens.ListScreen

import androidx.lifecycle.ViewModel
import com.pdm0126.laboratorio4.models.Task
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class GeneralViewModel: ViewModel() {
  private val _tasks = MutableStateFlow<MutableList<Task>>(mutableListOf())
  val tasks = _tasks.asStateFlow()

  fun addTask(task: Task) {
    _tasks.value = _tasks.value.toMutableList().apply { add(task) }
  }
}