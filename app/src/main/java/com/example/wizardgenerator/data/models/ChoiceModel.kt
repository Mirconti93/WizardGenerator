package com.gridspertise.ami.surftutor.data.models

import com.example.wizardgenerator.commons.Constants.Companion.PARAM_NEXT
import com.example.wizardgenerator.commons.Constants.Companion.PARAM_STRING_MATCHES
import com.example.wizardgenerator.commons.Constants.Companion.PARAM_VARIABLE
import com.google.gson.JsonObject


data class ChoiceModel(
    val variable: String?,
    val stringMatches: String?,
    val next: String?,
) {
    fun toJsonObject(): JsonObject {
        return JsonObject().also {
            it.addProperty(PARAM_VARIABLE, variable)
            it.addProperty(PARAM_STRING_MATCHES, stringMatches)
            it.addProperty(PARAM_NEXT, next)
        }
    }
}
