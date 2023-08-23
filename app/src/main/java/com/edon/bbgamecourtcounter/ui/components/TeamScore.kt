package com.edon.bbgamecourtcounter.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TeamScore(modifier: Modifier = Modifier, name: String, score: Int){
    Column(modifier = Modifier.padding(all = 16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = name, color = MaterialTheme.colorScheme.secondary)
        Text(
            text = score.toString(),
            fontSize = 50.sp,
            fontWeight = FontWeight.SemiBold,
            color = MaterialTheme.colorScheme.secondary
        )
    }
}