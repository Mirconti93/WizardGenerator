package com.gridspertise.ami.surftutor.data.models

data class AslWizard(
    val id: String,
    // titolo per UI
    val title: String,
    // breve descrizione
    val comment: String?,
    // il primo stato da eseguire nel flusso
    val startAt: String,
    // indica se il wizard richiede altri input in ingresso o si può eseguire standalone
    val inputRequired: Boolean?,
    // una mappa che salva tutti gli stati a cui è possibile accedere attraverso l'id (per utilità)
    var statesMap: HashMap<String, AbstractState?>?

)
