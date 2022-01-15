package com.mclowicz.borutoapp.navigation

import android.util.Log
import com.mclowicz.borutoapp.util.Constants.DETAILS_ARGUMENT_ID

sealed class Screen(val route: String) {
    object Splash: Screen("splash_screen")
    object Welcome: Screen("welcome_screen")
    object Home: Screen("home_screen")
    object Details: Screen("details_screen/{$DETAILS_ARGUMENT_ID}") {
        fun passHeroId(heroId: Int): String {
            Log.e("xxx", "$heroId")
            return "details_screen/$heroId"
        }
    }
    object Search: Screen("search_screen")
}