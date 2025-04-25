package com.websarva.wings.jettutorialfortoryumon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.websarva.wings.jettutorialfortoryumon.components.MainScreen
import com.websarva.wings.jettutorialfortoryumon.ui.theme.JetTutorialForToryumonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetTutorialForToryumonTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    MainScreen(innerPadding)
                }
            }
        }
    }
}