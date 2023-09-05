package com.gridspertise.ami.surftutor.data.models

import com.google.gson.JsonObject

class ChoiceStateModel(
    override val type: String,
    // una lista di ChoiceModel, il modello che rappresenta una delle opzioni in cui l'utente seleziona il feedback ottenuto.
    val choices: List<ChoiceModel>?,
    val resultPath: String

) : AbstractState() {
    override fun isFinalState(): Boolean {
        return false
    }

    // find the next value from the selected option
    override fun getNext(result: Any?): String? {
        choices?.forEach {
            if (result is String && result.equals(it.variable)) {
                return it.next
            }
        }
        return null
    }

    override fun resultPath(): String? {
        return resultPath
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
}
