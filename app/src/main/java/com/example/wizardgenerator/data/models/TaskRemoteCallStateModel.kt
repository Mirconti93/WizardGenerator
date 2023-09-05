package com.gridspertise.ami.surftutor.data.models

import com.google.gson.JsonObject

data class TaskRemoteCallStateModel(
    override val type: String,
    // l'id del prossimo stato
    val next: String?,
    // viene passata l'api da chiamare alla surf lib. Il valore deve contenere solo l'ultima parte dell'endpoint (es "GET_RF_PINGER")
    val resource: String?,
    // è un identificatore con cui accedere al risultato di un operazione nella mappa dei risultati salvati e viene mostrato nella schermata
    val outputPath: String?,
    // è un identificatore con cui salvare il riusltato delle chiamate+
    val resultPath: String,
    // eventuali parametri da passare alla richiesta
    val parameters: JsonObject?,
    // una lista di CatchModel. Il CatchModel viene usato per gestire uno specifico errore. Se non è presente l'errore specifico viene preso il primo della lista, con un messaggio generico.
    val catch: List<CatchModel>,
    // una possibile etichetta con cui salvare un risultato
    val resultLabel: String?,
    // indica se bisogna eseguire le operazione dello stato nella stessa schermata o in una nuova
    val sameRoute: Boolean?
) : AbstractState() {
    override fun isFinalState(): Boolean {
        return false
    }
    override fun getNext(result: Any?): String? {
        return next
    }
    override fun resultPath(): String? {
        return resultPath
    }

    override fun outputPath(): String? {
        return outputPath
    }

    override fun parameters(): JsonObject? {
        return parameters
    }

    override fun stayOnScreen(): Boolean {
        return sameRoute == true
    }
}
