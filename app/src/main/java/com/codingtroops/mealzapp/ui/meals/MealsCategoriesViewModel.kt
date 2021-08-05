package com.codingtroops.mealzapp.ui.meals

import androidx.lifecycle.ViewModel
import com.codingtroops.model.MealsRepository
import com.codingtroops.model.response.MealResponse
import com.codingtroops.model.response.MealsCategoriesResponse


class MealsCategoriesViewModel (private val repository: MealsRepository = MealsRepository()): ViewModel() {
    fun getMeals(successCallback: (response: MealsCategoriesResponse?) -> Unit) {
        repository.getMeals { response ->
            successCallback(response)
        }
    }
}