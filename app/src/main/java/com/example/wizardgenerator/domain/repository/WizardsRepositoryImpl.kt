package com.example.wizardgenerator.domain.repository

import com.example.wizardgenerator.data.models.repository.WizardsRepository
import com.gridspertise.ami.surftutor.data.models.AbstractState
import com.gridspertise.ami.surftutor.data.models.AslWizard

class WizardsRepositoryImpl: WizardsRepository {
    var wizards: MutableList<AslWizard> = ArrayList()

    override fun getWizards(): List<AslWizard> {
        return wizards
    }
    override fun addWizard(aslWizard: AslWizard) {
        wizards.add(aslWizard)
    }

    override fun addStateToWizard(state: AbstractState, idWizard: String) {
        wizards.find { it.id == idWizard }.let { it?.statesMap?.put(state.id, state)}
    }
}