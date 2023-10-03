package com.example.wizardgenerator.presentation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.wizardgenerator.R
import com.example.wizardgenerator.WizardApplication
import com.example.wizardgenerator.presentation.MainViewModel
import com.gridspertise.ami.surftutor.data.models.AslWizard

@Composable
fun WizardListScreen() {
    val mainViewModel: MainViewModel = hiltViewModel()
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(WizardApplication.instance.getString(R.string.wizard_list))

        if (mainViewModel.isWizardListEmpty()) {
            Text(WizardApplication.instance.getString(R.string.wizard_empty),
                modifier = Modifier
                .fillMaxWidth()
            )
        } else {
            LazyColumn {
                items(mainViewModel.getWizards()) {
                    WizardCard(it)
                }
            }
        }
    }


}


fun WizardCard(wizard: AslWizard) {

}