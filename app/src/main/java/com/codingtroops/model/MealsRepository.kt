package com.codingtroops.model

import com.codingtroops.model.api.MealsWebService
import com.codingtroops.model.response.MealsCategoriesResponse

class MealsRepository(private val webService: MealsWebService = MealsWebService()) {
    fun getMeals(): MealsCategoriesResponse? {
        return webService.getMeals().execute().body() // Bad practice
    }
}