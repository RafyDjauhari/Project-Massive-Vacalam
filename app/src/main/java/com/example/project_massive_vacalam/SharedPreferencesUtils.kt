package com.example.project_massive_vacalam

import android.content.Context
import android.content.SharedPreferences

object SharedPreferencesUtils {
    private const val PREFS_FILE_NAME = "MyPrefs"
    private const val PREF_TOKEN = "token"
    private const val PREF_USER_ID = "id_user"

    private fun getSharedPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREFS_FILE_NAME, Context.MODE_PRIVATE)
    }

    fun saveTokenToPreferences(context: Context, token: String?) {
        val sharedPreferences = getSharedPreferences(context)
        val editor = sharedPreferences.edit()
        editor.putString(PREF_TOKEN, token)
        editor.apply()
    }

    fun saveUserIdToPreferences(context: Context, userId: String?) {
        val sharedPreferences = getSharedPreferences(context)
        val editor = sharedPreferences.edit()
        editor.putString(PREF_USER_ID, userId)
        editor.apply()
    }

    fun getTokenFromPreferences(context: Context): String? {
        val sharedPreferences = getSharedPreferences(context)
        return sharedPreferences.getString(PREF_TOKEN, null)
    }

    fun getUserIdFromPreferences(context: Context): String? {
        val sharedPreferences = getSharedPreferences(context)
        return sharedPreferences.getString(PREF_USER_ID, null)
    }
}
