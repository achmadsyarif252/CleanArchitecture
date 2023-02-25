package com.example.cleanarchitecturecodelab.di

import com.example.cleanarchitecturecodelab.data.IMessageDataSource
import com.example.cleanarchitecturecodelab.data.MessageDataSource
import com.example.cleanarchitecturecodelab.data.MessageRepository
import com.example.cleanarchitecturecodelab.domain.IMessageRepository
import com.example.cleanarchitecturecodelab.domain.MessageInteractor
import com.example.cleanarchitecturecodelab.domain.MessageUsecase

object Injection {
    fun provideUseCase(): MessageUsecase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}