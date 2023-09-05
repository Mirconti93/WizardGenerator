package com.gridspertise.ami.surftutor.data.models

import com.google.gson.JsonObject

data class MapStateModel(
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
}
