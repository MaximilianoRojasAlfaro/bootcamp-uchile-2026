package cl.uchile.dcc.mobile.helloworld.ui

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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import cl.uchile.dcc.mobile.helloworld.ui.theme.HelloWorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloWorldTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HelloWorld(
                        name = "World",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        // Nada en particular, solo lo que está por defecto
    }

    override fun onResume() {
        super.onResume()
        // Nada en particular, solo lo que está por defecto
    }

    override fun onPause() {
        super.onPause()
        // Nada en particular, solo lo que está por defecto
    }

    override fun onStop() {
        super.onStop()
        // Nada en particular, solo lo que está por defecto
    }

    override fun onRestart() {
        super.onRestart()
        // Nada en particular, solo lo que está por defecto
    }

    override fun onDestroy() {
        super.onDestroy()
        // Nada en particular, solo lo que está por defecto
    }
}

@Composable
fun HelloWorld(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier.fillMaxSize(),
        textAlign = TextAlign.Center,
        fontFamily = FontFamily.Serif
    )
}

@Preview(showBackground = true)
@Composable
fun HelloWorldPreview() {
    HelloWorldTheme {
        HelloWorld("World")
    }
}