package com.example.smarttrade.di

import com.example.smarttrade.auth.data.remote.UserApi
import com.example.smarttrade.auth.data.repository.UserRepositoryImpl
import com.example.smarttrade.auth.domain.repository.UserRepository
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideUserRepository(userApi: UserApi): UserRepository {
        return UserRepositoryImpl(userApi)
    }

    @Provides
    @Singleton
    fun provideGsonInstance(): Gson {
        return Gson()
    }
}