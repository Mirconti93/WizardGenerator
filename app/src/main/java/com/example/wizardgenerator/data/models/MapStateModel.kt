package com.gridspertise.ami.surftutor.data.models

import com.example.wizardgenerator.commons.Constants
import com.example.wizardgenerator.commons.Constants.Companion.PARAM_CONDITION
import com.example.wizardgenerator.commons.Constants.Companion.PARAM_PARAMETERS
import com.google.gson.JsonArray
import com.google.gson.JsonObject


data class MapStateModel(
    override val id: String,
    override val type: String,
    // una lista di MapChoiceModel, il modello che rappresenta una delle ve vengono selezionate alla verifica della condizione definita nel parametro condition.
    val choices: List<MapChoiceModel>?,
    // viene passato il nome del metodo che verifica la condizione con cui selezionare un choice model. I valori possibili da inserire nel parametro condition si trovano tra le costanti della classe TaskHandler.kt
    val condition: String?,
    // eventuali parametri utili per verificare la condizione
    val parameters: JsonObject?
) : AbstractState() {
    override fun isFinalState(): Boolean {
        return false
    }

    // find the next value from the selected option
    override fun getNext(selector: Any?): String? {
        choices?.forEach {
            if (selector is Boolean? && it.selector.equals(selector)) {
                return it.next
            }
        }
        return null
    }

    override fun resultPath(): String? {
        return null
    }

    override fun outputPath(): String? {
        return null
    }

    override fun parameters(): JsonObject? {
        return parameters
    }

    override fun stayOnScreen(): Boolean {
        return true
    }

    override fun toJsonObject(): JsonObject {
        val jsonObject = JsonObject()
        jsonObject.addProperty(Constants.PARAM_ID, id)
        jsonObject.addProperty(Constants.PARAM_TYPE, type)
        val jsonArray = JsonArray()
        choices?.forEach { jsonArray.add(it.toJsonObject()) }
        jsonObject.add(Constants.PARAM_CHOICES, jsonArray)
        jsonObject.addProperty(PARAM_CONDITION, condition)
        jsonObject.add(PARAM_PARAMETERS, parameters)
        return jsonObject
    }
}
