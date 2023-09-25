package com.mircontapp.sportalbum.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavigationItem(var route: String, var title: String) {
    object WizardsList : NavigationItem("wizards_list", "Wizards List")
    object WizardEdit : NavigationItem("wizard_edit", "Wizard Edit")
    object StateEdit : NavigationItem("state_edit", "State Edit")
}
