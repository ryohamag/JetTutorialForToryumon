package com.websarva.wings.jettutorialfortoryumon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.websarva.wings.jettutorialfortoryumon.components.DetailScreen
import com.websarva.wings.jettutorialfortoryumon.components.MainScreen
import com.websarva.wings.jettutorialfortoryumon.ui.theme.JetTutorialForToryumonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetTutorialForToryumonTheme {
                val navController = rememberNavController() //NavControllerのインスタンスを生成(とりあえず必要)
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    //遷移先を管理
                    NavHost(navController = navController, startDestination = "MainScreen") {
                        //MainScreenを表示する
                        composable(route = "MainScreen") {
                            MainScreen(navController, innerPadding)
                        }
                        //DetailScreenが指定された場合は、DetailScreen()を呼び出す
                        composable(route = "DetailScreen") {
                            DetailScreen()
                        }
                    }
                }
            }
        }
    }
}