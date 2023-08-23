package com.edon.bbgamecourtcounter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.edon.bbgamecourtcounter.data.repository.BBGameRepo
import com.edon.bbgamecourtcounter.ui.theme.BBGameCourtCounterTheme
import com.edon.bbgamecourtcounter.viewmodel.BBGameViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BBGameCourtCounterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //craete viewModel and pass it to the App composable
                    val viewModel = BBGameViewModel(BBGameRepo())
                    App(viewModel)
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BBGameCourtCounterTheme {
        //craete viewModel and pass it to the App composable
        val viewModel = BBGameViewModel(BBGameRepo())
        App(viewModel)
    }
}