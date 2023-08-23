package com.edon.bbgamecourtcounter

import androidx.compose.runtime.Composable
import com.edon.bbgamecourtcounter.ui.screen.BBGameScreen
import com.edon.bbgamecourtcounter.viewmodel.BBGameViewModel

@Composable
fun App(viewModel: BBGameViewModel){
    BBGameScreen(viewModel = viewModel)
}