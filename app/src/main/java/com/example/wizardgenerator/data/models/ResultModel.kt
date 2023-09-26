package com.gridspertise.ami.surftutor.data.models

import com.example.wizardgenerator.commons.Constants
import com.google.gson.JsonObject

data class ResultModel(
    val label: String?,
    val outputPath: String?,
    val send: Boolean?,
    val show: Boolean?,
    val sendKey: String?,
) {
    fun toJsonObject(): JsonObject {
        return JsonObject().also {
            it.addProperty(Constants.PARAM_LABEL, label)
            it.addProperty(Constants.PARAM_SEND, send)
            it.addProperty(Constants.PARAM_SHOW, show)
            it.addProperty(Constants.PARAM_SEND_KEY, sendKey)
        }
    }
}
