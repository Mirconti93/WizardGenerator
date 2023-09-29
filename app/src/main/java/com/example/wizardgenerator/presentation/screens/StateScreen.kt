package com.example.wizardgenerator.presentation.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.wizardgenerator.R
import com.example.wizardgenerator.WizardApplication
import com.example.wizardgenerator.presentation.MainViewModel

@Composable
fun StateScreen() {
    val mainViewModel: MainViewModel = hiltViewModel()

    Text(WizardApplication.instance.getString(R.string.edit_wizard))
    LazyColumn {
        items(mainViewModel.repository.getWizards()) {
            WizardCard(it)
        }
    }
}

