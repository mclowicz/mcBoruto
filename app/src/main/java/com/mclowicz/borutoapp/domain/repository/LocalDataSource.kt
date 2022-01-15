package com.mclowicz.borutoapp.domain.repository

import com.mclowicz.borutoapp.domain.model.Hero

interface LocalDataSource {
    suspend fun getSelectedHero(heroId: Int): Hero
}