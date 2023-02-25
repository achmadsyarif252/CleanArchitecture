package com.example.cleanarchitecturecodelab.data

import com.example.cleanarchitecturecodelab.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}