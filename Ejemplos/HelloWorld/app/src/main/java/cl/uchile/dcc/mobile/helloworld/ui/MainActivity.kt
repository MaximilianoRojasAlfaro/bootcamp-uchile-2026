package cl.uchile.dcc.mobile.helloworld.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cl.uchile.dcc.mobile.helloworld.R
import cl.uchile.dcc.mobile.helloworld.ui.theme.HelloWorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloWorldTheme {
                Scaffold(
                    topBar = {/* TODO */},
                    floatingActionButton = {/* TODO */},
                    bottomBar = {/* TODO */},
                    snackbarHost = {/* TODO */},
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
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
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxSize()
    ){
        Card(
            modifier = modifier
        ) {
            Text(
                text = "Hello $name!",
                modifier = modifier
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = modifier
        ) {
            /* Text(
                text = "Hello $name!",
                modifier = modifier
            )
            Spacer(
                modifier = Modifier
                    .width(16.dp)
                    .height(16.dp)
            ) */
            Button(
                onClick = { /*TODO*/ },
                modifier = modifier
            ) {
                Text(text = "Click me!")
            }
        }
        /* Image(
            painter = painterResource(
                id = R.drawable.ic_launcher_background
            ),
            contentDescription = "Android Background",
            modifier = Modifier.fillMaxSize()
        ) */
    }
}

@Preview(showBackground = true)
@Composable
fun HelloWorldPreview() {
    HelloWorldTheme {
        HelloWorld("World")
    }
}