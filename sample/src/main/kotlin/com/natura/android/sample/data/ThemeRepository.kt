package com.natura.android.sample.data

import android.content.Context
import android.content.SharedPreferences
import com.natura.android.sample.R

class ThemeRepository(context: Context) {

    private val appContext = context.applicationContext

    val sharedPreferences: SharedPreferences
        get() {
            return appContext.getSharedPreferences("themes", Context.MODE_PRIVATE)
        }

    fun saveChosenTheme(brandName: String) {
        sharedPreferences
            .edit()
            .putString("theme", brandName)
            .apply()
    }

    fun getChosenBrand() = sharedPreferences.getString("theme", "natura")

    fun getChosenTheme(): Int {
        return when (sharedPreferences.getString("theme", "natura")) {
            "natura" -> R.style.Theme_Natura_Light
            "avon" -> R.style.Theme_Avon_Light
            "aesop" -> R.style.Theme_Aesop_Light
            else -> R.style.Theme_TheBodyShop_Light
        }
    }

    fun getChosenDarkTheme(): Int {
        return when (sharedPreferences.getString("theme", "natura")) {
            "natura" -> R.style.Theme_Natura_Dark
            "avon" -> R.style.Theme_Avon_Dark
            "aesop" -> R.style.Theme_Aesop_Dark
            else -> R.style.Theme_TheBodyShop_Dark
        }
    }

    fun getChosenThemeWithNoActionBar(): Int {
        return when (sharedPreferences.getString("theme", "natura")) {
            "natura" -> R.style.Theme_Natura_Light_NoActionBar
            "avon" -> R.style.Theme_Avon_Light_NoActionBar
            "aesop" -> R.style.Theme_Aesop_Light_NoActionBar
            else -> R.style.Theme_TheBodyShop_Light_NoActionBar
        }
    }

    fun getChosenDarkThemeWithNoActionBar(): Int {
        return when (sharedPreferences.getString("theme", "natura")) {
            "natura" -> R.style.Theme_Natura_Dark_NoActionBar
            "avon" -> R.style.Theme_Avon_Dark_NoActionBar
            "aesop" -> R.style.Theme_Aesop_Dark_NoActionBar
            else -> R.style.Theme_TheBodyShop_Dark_NoActionBar
        }
    }
}
