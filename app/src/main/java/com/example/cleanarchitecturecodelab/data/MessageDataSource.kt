package com.example.cleanarchitecturecodelab.data

import com.example.cleanarchitecturecodelab.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) =
        MessageEntity("Hello $name! Welcome to Clean Architecture")
}