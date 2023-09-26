package com.gridspertise.ami.surftutor.data.models
import com.google.gson.JsonObject
import kotlinx.serialization.Serializable

@Serializable
abstract class AbstractState {
    abstract val id: String
    // il tipo di stato, in base al quale si possono gestire diverse implementazioni e hanno differenti parametri aggiuntivi.
    abstract val type: String
    val title: String? = null
    val description: String? = null
    val image: String? = null

    // restituisce true se è uno stato che conclude il flusso, false altrimenti
    abstract fun isFinalState(): Boolean

    // restituisce l'id del prossimo stato. @param selector serve se il next id viene ricavato da una selezione
    abstract fun getNext(selector: Any?): String?

    // ritorna l'identificatore con cui salvare un risultato di un tas
    abstract fun resultPath(): String?

    // ritorna l'id con cui è stato salvato un risultato da mostrare
    abstract fun outputPath(): String?

    // un JsonObject contenente i parametri eventualmente richiesti per eseguire una particolare attività in questo stato
    abstract fun parameters(): JsonObject?

    // indica se bisogna eseguire le operazione dello stato nella stessa schermata
    abstract fun stayOnScreen(): Boolean

    abstract fun toJsonObject(): JsonObject
}
