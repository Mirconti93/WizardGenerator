package com.example.wizardgenerator.presentation

import androidx.lifecycle.ViewModel
import com.example.wizardgenerator.data.models.repository.WizardsRepository
import com.example.wizardgenerator.domain.repository.WizardsRepositoryImpl
import com.gridspertise.ami.surftutor.data.models.AbstractState
import com.gridspertise.ami.surftutor.data.models.AslWizard
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(): ViewModel() {

    var wizardToEdit: AslWizard? = null
    var stateToEdit: AbstractState? = null

    @Inject lateinit var repository: WizardsRepository

    fun isWizardListEmpty(): Boolean {
        return repository.getWizardList().isEmpty()
    }

    fun addWizard(aslWizard: AslWizard) {
        repository.addWizard(aslWizard)
    }

    fun getWizards() : List<AslWizard> {
        return repository.getWizardList()
    }

    fun addStateToWizard(state: AbstractState, idWizard: String) {
        repository.addStateToWizard(state, idWizard)
    }


}