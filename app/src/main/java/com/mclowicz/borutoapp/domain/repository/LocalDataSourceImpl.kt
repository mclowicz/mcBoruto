package com.mclowicz.borutoapp.domain.repository

import com.mclowicz.borutoapp.data.local.BorutoDatabase
import com.mclowicz.borutoapp.domain.model.Hero

class LocalDataSourceImpl(
    borutoDatabase: BorutoDatabase
): LocalDataSource {

    private val heroDao = borutoDatabase.heroDao()

    override suspend fun getSelectedHero(heroId: Int): Hero {
        return heroDao.getSelectedHero(heroId = heroId)
    }
}