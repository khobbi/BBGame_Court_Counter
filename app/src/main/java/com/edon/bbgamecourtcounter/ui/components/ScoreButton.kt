package com.edon.bbgamecourtcounter.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ScoreButton(modifier: Modifier = Modifier, text: String, onClick: () -> Unit){
    Button(modifier = modifier.width(150.dp).padding(8.dp), onClick = {onClick()}){
        Text(text = text)
    }
}