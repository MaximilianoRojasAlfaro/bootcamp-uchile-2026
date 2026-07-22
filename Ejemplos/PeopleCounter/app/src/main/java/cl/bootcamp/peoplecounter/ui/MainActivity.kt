package cl.bootcamp.peoplecounter.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import cl.bootcamp.peoplecounter.ui.theme.PeopleCounterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() //Se usa la pantalla del dispositivo completa(todo el espacio disponible)
        setContent {
            PeopleCounterTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PeopleCounter(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun PeopleCounter(modifier: Modifier) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize()
    ) {

        Text("People Counter App", style = MaterialTheme.typography.titleLarge)

        Spacer(modifier = Modifier.height(128.dp))

        RowCounter()

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {

            }
        ) {
            Text("Count!", modifier = Modifier.padding(24.dp))
        }
    }
}

@Composable
fun RowCounter(){

    Row(
        verticalAlignment =  Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        Counter()

        Spacer(modifier = Modifier.width(8.dp))

        Counter()

        Spacer(modifier = Modifier.width(8.dp))

        Counter()
    }
}

@Composable
fun Counter(){
    Card(

    ){
        Text("0", style = MaterialTheme.typography.labelLarge, modifier = Modifier.padding(16.dp))
    }
}

//@Preview(showBackground = true)
//@Composable
//fun PeopleCounterPreview() {
//    PeopleCounterTheme {
//        PeopleCounter()
//    }
//}