package com.example.cleanarchitecturecodelab.domain

class MessageInteractor(private val messageRepository: IMessageRepository) : MessageUsecase {
    override fun getMessage(name: String): MessageEntity {
        return messageRepository.getWelcomeMessage(name)
    }

}