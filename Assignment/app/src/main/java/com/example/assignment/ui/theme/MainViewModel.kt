package com.example.assignment.ui

import androidx.lifecycle.ViewModel
import com.example.assignment.domain.model.User
import com.example.assignment.domain.usecase.GetUsersUseCase
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getUsersUseCase: GetUsersUseCase
) : ViewModel() {
    val users: List<User> = getUsersUseCase.execute()
}