package com.mircontapp.sportalbum.presentation.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun NavGraph (navController: NavHostController){

    NavHost(
        navController = navController,
        startDestination = NavigationItem.WizardsList.route)
    {
        composable(route = NavigationItem.WizardsList.route){
            Text(text = "")
        }
        composable(route = NavigationItem.WizardEdit.route){
            Text(text = "")
        }
        composable(route = NavigationItem.StateEdit.route){
            Text(text = "")
        }
    }
}