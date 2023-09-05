package com.gridspertise.ami.surftutor.data.models

data class ResultSaved(val value: String, val outputText: String, val isOk: Boolean?) {
    constructor(value: String) : this(value, value, true)
    constructor(value: String, outputText: String) : this(value, outputText, true)
    constructor(value: String, isOk: Boolean?) : this(value, value, isOk)
}
