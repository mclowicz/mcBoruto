package com.mclowicz.borutoapp.di

import android.content.Context
import com.mclowicz.borutoapp.data.repository.DataStoreOperationsImpl
import com.mclowicz.borutoapp.data.repository.Repository
import com.mclowicz.borutoapp.domain.repository.DataStorOperations
import com.mclowicz.borutoapp.domain.use_cases.UseCases
import com.mclowicz.borutoapp.domain.use_cases.get_all_heroes.GetAllHeroesUseCase
import com.mclowicz.borutoapp.domain.use_cases.get_selected_hero.GetSelectedHeroUseCase
import com.mclowicz.borutoapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import com.mclowicz.borutoapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase
import com.mclowicz.borutoapp.domain.use_cases.search_heroes.SearchHeroesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideDataStoreOperations(
        @ApplicationContext context: Context
    ): DataStorOperations {
        return DataStoreOperationsImpl(context = context)
    }

    @Provides
    @Singleton
    fun provideUseCases(repository: Repository): UseCases {
        return UseCases(
            saveOnBoardingUseCase = SaveOnBoardingUseCase(repository = repository),
            readOnBoardingUseCase = ReadOnBoardingUseCase(repository = repository),
            getAllHeroesUseCase = GetAllHeroesUseCase(repository = repository),
            searchHeroesUseCase = SearchHeroesUseCase(repository = repository),
            getSelectedHeroUseCase = GetSelectedHeroUseCase(repository = repository)
        )
    }
}