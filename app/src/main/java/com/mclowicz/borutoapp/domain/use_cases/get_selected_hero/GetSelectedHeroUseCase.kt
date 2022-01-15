package com.mclowicz.borutoapp.domain.use_cases.get_selected_hero

import com.mclowicz.borutoapp.data.repository.Repository
import com.mclowicz.borutoapp.domain.model.Hero

class GetSelectedHeroUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(heroId: Int): Hero {
        return repository.getSelectedHero(heroId = heroId)
    }
}