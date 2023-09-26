package com.example.wizardgenerator.data.models.repository

import com.gridspertise.ami.surftutor.data.models.AbstractState
import com.gridspertise.ami.surftutor.data.models.AslWizard

interface WizardsRepository {

    fun getWizards(): List<AslWizard>
    fun addWizard(aslWizard: AslWizard)

    fun addStateToWizard(state: AbstractState, idWizard: String)

}