package com.example.cleanarchitecturecodelab.data

import com.example.cleanarchitecturecodelab.domain.IMessageRepository
import com.example.cleanarchitecturecodelab.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}