package com.mclowicz.borutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.mclowicz.borutoapp.data.local.dao.HeroDao
import com.mclowicz.borutoapp.data.local.dao.HeroRemoteKeysDao
import com.mclowicz.borutoapp.domain.model.Hero
import com.mclowicz.borutoapp.domain.model.HeroRemoteKeys

@Database(entities = [Hero::class, HeroRemoteKeys::class], version = 2)
@TypeConverters(DatabaseConverter::class)
abstract class BorutoDatabase : RoomDatabase() {

    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKeysDao(): HeroRemoteKeysDao
}