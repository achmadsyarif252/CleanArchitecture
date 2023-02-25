package com.example.cleanarchitecturecodelab.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cleanarchitecturecodelab.domain.MessageEntity
import com.example.cleanarchitecturecodelab.domain.MessageUsecase

class MainViewModel(private val messageUsecase: MessageUsecase) : ViewModel() {
    private val _message = MutableLiveData<MessageEntity>()
    val message: LiveData<MessageEntity> get() = _message

    fun setName(name: String) {
        _message.value = messageUsecase.getMessage(name)
    }
}