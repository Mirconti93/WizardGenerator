package com.gridspertise.ami.surftutor.data.models

import com.google.gson.JsonObject

data class WaitStateModel(
    override val id: String,
    override val type: String,
    val next: String?,
    val seconds: String?,
    val secondsPath: String?,
    val timestamp: String?,
    val timestampPath: String?,
) : AbstractState() {
    override fun isFinalState(): Boolean {
        return false
    }
    override fun getNext(result: Any?): String? {
        return next
    }
    override fun resultPath(): String? {
        return null
    }

    override fun outputPath(): String? {
        return timestampPath
    }

    override fun parameters(): JsonObject? {
        return null
    }

    override fun stayOnScreen(): Boolean {
        return true
    }

    override fun toJsonObject(): JsonObject {
        TODO("Not yet implemented")
    }
}
