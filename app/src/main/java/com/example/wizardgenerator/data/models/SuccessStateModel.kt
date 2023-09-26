package com.gridspertise.ami.surftutor.data.models

import com.example.wizardgenerator.commons.Constants
import com.google.gson.JsonArray
import com.google.gson.JsonObject

class SuccessStateModel(
    override val id: String,
    override val type: String,
    // una lista di ResultModel rapperesnta un risultato da visualizzare e/o inviare al modulo chiamante
    val results: List<ResultModel>?
) : AbstractState() {
    override fun isFinalState(): Boolean {
        return true
    }
    override fun getNext(result: Any?): String? {
        return null
    }
    override fun resultPath(): String? {
        return null
    }

    override fun outputPath(): String? {
        return null
    }

    override fun parameters(): JsonObject? {
        return null
    }

    override fun stayOnScreen(): Boolean {
        return false
    }

    override fun toJsonObject(): JsonObject {
        val jsonObject = JsonObject()
        jsonObject.addProperty(Constants.PARAM_ID, id)
        jsonObject.addProperty(Constants.PARAM_TYPE, type)
        val jsonArray = JsonArray()
        results?.forEach { jsonArray.add(it.toJsonObject()) }
        jsonObject.add(Constants.PARAM_CHOICES, jsonArray)
        return jsonObject
    }
}
