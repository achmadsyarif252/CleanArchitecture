package com.example.cleanarchitecturecodelab.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}