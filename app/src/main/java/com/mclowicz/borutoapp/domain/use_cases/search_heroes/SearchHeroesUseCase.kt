package com.mclowicz.borutoapp.domain.use_cases.search_heroes

import androidx.paging.PagingData
import com.mclowicz.borutoapp.data.repository.Repository
import com.mclowicz.borutoapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class SearchHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke(query: String): Flow<PagingData<Hero>> {
        return repository.searchHeroes(query = query)
    }
}