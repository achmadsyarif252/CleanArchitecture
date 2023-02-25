package com.example.cleanarchitecturecodelab.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.cleanarchitecturecodelab.di.Injection
import com.example.cleanarchitecturecodelab.domain.MessageUsecase

class MainViewModelFactory(
    private var messageUsecase: MessageUsecase
) : ViewModelProvider.NewInstanceFactory() {
    companion object {
        @Volatile
        private var instance: MainViewModelFactory? = null

        fun getInstance(): MainViewModelFactory = instance ?: synchronized(this) {
            instance ?: MainViewModelFactory(Injection.provideUseCase())
        }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MainViewModel::class.java) -> MainViewModel(messageUsecase) as T
            else -> throw IllegalArgumentException("Unknown ViewModel class " + modelClass.name)
        }
    }
}