package com.example.assignment.di

import com.example.assignment.data.repository.UserRepositoryImpl
import com.example.assignment.domain.repository.UserRepository
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {
    @Binds
    abstract fun bindUserRepository(impl: UserRepositoryImpl): UserRepository
}