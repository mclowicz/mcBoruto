package com.mclowicz.borutoapp.domain.repository

import kotlinx.coroutines.flow.Flow

interface DataStorOperations {
    suspend fun saveOnBoardingState(completed: Boolean)
    fun readOnBoardingState(): Flow<Boolean>
}