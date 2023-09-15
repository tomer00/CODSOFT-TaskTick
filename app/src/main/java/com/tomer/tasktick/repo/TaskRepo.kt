package com.tomer.tasktick.repo

import com.tomer.tasktick.modals.Task
import kotlinx.coroutines.flow.Flow

interface TaskRepo {
    suspend fun getAllTasks(): List<Task>
}