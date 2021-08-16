package com.codingtroops.mealzapp.ui.meals

import androidx.lifecycle.ViewModel
import com.codingtroops.model.MealsRepository
import com.codingtroops.model.response.MealResponse


class MealsCategoriesViewModel (private val repository: MealsRepository = MealsRepository()): ViewModel() {
    suspend fun getMeals(): List<MealResponse> {
        return repository.getMeals().categories
    }
}