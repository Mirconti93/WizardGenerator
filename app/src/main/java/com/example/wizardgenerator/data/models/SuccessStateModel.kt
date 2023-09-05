package com.gridspertise.ami.surftutor.data.models

import com.google.gson.JsonObject

class SuccessStateModel(
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
}
