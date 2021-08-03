package com.codingtroops.model

import com.codingtroops.model.response.MealsCategoriesResponse

class MealsRepository {
    fun getMeals(): MealsCategoriesResponse = MealsCategoriesResponse(arrayListOf())
}