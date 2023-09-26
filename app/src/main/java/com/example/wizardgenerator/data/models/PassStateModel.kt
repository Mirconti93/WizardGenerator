package com.gridspertise.ami.surftutor.data.models

import com.example.wizardgenerator.commons.Constants
import com.google.gson.JsonArray
import com.google.gson.JsonObject

data class PassStateModel(
    override val id: String,
    override val type: String,
    val next: String?,
    // è un identificatore con cui accedere al risultato di un operazione di uno stato precedente e viene mostrato nella schermata
    val outputPath: String?,
    // una lista di ResultModel rapperesnta un risultato da visualizzare e/o inviare al modulo chiamante
    val results: List<ResultModel>?
) : AbstractState() {
    override fun isFinalState(): Boolean {
        return next == null
    }
    override fun getNext(result: Any?): String? {
        return next
    }

    override fun outputPath(): String? {
        return outputPath
    }
    override fun resultPath(): String? {
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
        jsonObject.addProperty(Constants.PARAM_OUTPUT_PATH, outputPath)
        jsonObject.addProperty(Constants.PARAM_NEXT, outputPath)
        val jsonArray = JsonArray()
        results?.forEach { jsonArray.add(it.toJsonObject()) }
        jsonObject.add(Constants.PARAM_CHOICES, jsonArray)
        return jsonObject
    }
}
