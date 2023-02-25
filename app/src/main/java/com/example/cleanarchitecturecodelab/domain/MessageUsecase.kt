package com.example.cleanarchitecturecodelab.domain

interface MessageUsecase {
    fun getMessage(name: String): MessageEntity
}