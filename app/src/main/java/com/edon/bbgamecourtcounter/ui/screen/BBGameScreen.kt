package com.edon.bbgamecourtcounter.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.edon.bbgamecourtcounter.R
import com.edon.bbgamecourtcounter.data.repository.BBGameRepo
import com.edon.bbgamecourtcounter.ui.components.ScoreButton
import com.edon.bbgamecourtcounter.ui.components.TeamScore
import com.edon.bbgamecourtcounter.ui.theme.BBGameCourtCounterTheme
import com.edon.bbgamecourtcounter.viewmodel.BBGameViewModel

@Composable
fun BBGameScreen(viewModel: BBGameViewModel) {
    //for updating the UI(recomposition)
    var teamAScore by rememberSaveable{ mutableStateOf(0) }
    var teamBScore by rememberSaveable{ mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier
                .padding(all = 16.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TeamScore(
                    modifier = Modifier.padding(bottom = 20.dp),
                    name = viewModel.teamA.name,
                    score = teamAScore
                )

                ScoreButton(text = stringResource(id = R.string.points3), onClick = {
                    viewModel.addPoints(viewModel.teamA, 3) //change value in view model
                    teamAScore = viewModel.teamA.score //update ui state
                })
                ScoreButton(text = stringResource(id = R.string.points2), onClick = {
                    viewModel.addPoints(viewModel.teamA, 2)
                    teamAScore = viewModel.teamA.score
                })
                ScoreButton(text = stringResource(id = R.string.free_throw), onClick = {
                    viewModel.addPoints(viewModel.teamA, 1)
                    teamAScore = viewModel.teamA.score
                })
            }

            Spacer(modifier = Modifier.weight(1F))

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TeamScore(
                    modifier = Modifier.padding(bottom = 20.dp),
                    name = viewModel.teamB.name,
                    score = teamBScore
                )

                ScoreButton(text = stringResource(id = R.string.points3), onClick = {
                    viewModel.addPoints(viewModel.teamB, 3)
                    teamBScore = viewModel.teamB.score
                })
                ScoreButton(text = stringResource(id = R.string.points2), onClick = {
                    viewModel.addPoints(viewModel.teamB, 2)
                    teamBScore = viewModel.teamB.score
                })
                ScoreButton(text = stringResource(id = R.string.free_throw), onClick = {
                    viewModel.addPoints(viewModel.teamB, 1)
                    teamBScore = viewModel.teamB.score
                })
            }
        }

        ElevatedButton(onClick = {
            viewModel.resetGame()
            teamAScore = viewModel.teamA.score
            teamBScore = viewModel.teamB.score
        }){
            Text(text = "RESET")
        }
    }
}

@Preview
@Composable
fun ScreenPreview(){
    BBGameCourtCounterTheme {
        Surface {
            BBGameScreen(viewModel = BBGameViewModel(BBGameRepo()))
        }
    }
}