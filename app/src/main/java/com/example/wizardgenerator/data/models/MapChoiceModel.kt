package com.gridspertise.ami.surftutor.data.models

import com.example.wizardgenerator.commons.Constants
import com.google.gson.JsonObject

data class MapChoiceModel(
    val selector: Boolean,
    val next: String?,
) {
    fun toJsonObject(): JsonObject {
        return JsonObject().also {
            it.addProperty(Constants.PARAM_SELECTOR, selector)
            it.addProperty(Constants.PARAM_NEXT, next)
        }
    }
}
