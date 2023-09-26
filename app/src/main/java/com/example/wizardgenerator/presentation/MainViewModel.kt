package com.example.wizardgenerator.presentation

import androidx.lifecycle.ViewModel
import com.gridspertise.ami.surftutor.data.models.AbstractState
import com.gridspertise.ami.surftutor.data.models.AslWizard
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(): ViewModel() {

    var wizardToEdit: AslWizard? = null
    var stateToEdit: AbstractState? = null

}