package com.gridspertise.ami.surftutor.data.models

import com.google.gson.JsonObject

class FailStateModel(
    override val type: String,
    val cause: String?,
    val error: String?
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
        return cause
    }

    override fun parameters(): JsonObject? {
        return null
    }

    override fun stayOnScreen(): Boolean {
        return false
    }
}
