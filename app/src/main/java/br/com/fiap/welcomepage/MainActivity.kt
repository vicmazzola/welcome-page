package br.com.fiap.welcomepage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.fiap.welcomepage.screens.DashboardScreen
import br.com.fiap.welcomepage.screens.HomeScreen
import br.com.fiap.welcomepage.screens.SkillsScreen
import br.com.fiap.welcomepage.ui.theme.WelcomePageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WelcomePageTheme {
                HomeScreen()
                DashboardScreen()
                SkillsScreen()
            }
        }
    }
}

