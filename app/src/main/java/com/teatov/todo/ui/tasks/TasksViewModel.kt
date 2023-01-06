package com.teatov.todo.ui.tasks

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.teatov.todo.data.TaskDao


class TasksViewModel @ViewModelInject constructor(
    private val taskDao: TaskDao
) : ViewModel()