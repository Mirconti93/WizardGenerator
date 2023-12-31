package com.mircontapp.sportalbum.presentation.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.example.wizardgenerator.presentation.theme.DarkGreen
import com.example.wizardgenerator.presentation.theme.Green
import com.example.wizardgenerator.presentation.theme.OrangeYellowD
import com.example.wizardgenerator.presentation.theme.Yellow

private val DarkColorScheme = darkColorScheme(
    background = DarkGreen,
    surface = Green,
    primary = Green,
    secondary = OrangeYellowD,
    tertiary = Yellow,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onPrimaryContainer = Color.White,
    onSurface = Color.White,
    onBackground = Color.White
)

private val LightColorScheme = lightColorScheme(
    surface = Green,
    primary = Green,
    secondary = OrangeYellowD,
    tertiary = Yellow,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
)

@Composable
fun WizardTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )


}