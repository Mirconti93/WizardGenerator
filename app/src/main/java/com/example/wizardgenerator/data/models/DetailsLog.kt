package com.gridspertise.ami.surftutor.data.models

data class DetailsLog(
    val timeStamp: String,
    val dhCommand: String,
    val outputRaw: String,
    val outputDecoded: String,
    val sonda: String,
    val ack: String,
    val error: String
)
