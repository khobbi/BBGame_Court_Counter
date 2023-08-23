package com.edon.bbgamecourtcounter.viewmodel

import androidx.lifecycle.ViewModel
import com.edon.bbgamecourtcounter.data.model.Team
import com.edon.bbgamecourtcounter.data.repository.BBGameRepo

class BBGameViewModel(private val repository: BBGameRepo): ViewModel() {
    //create data source from the repo
    val teamA = repository.teamA
    val teamB = repository.teamB

    fun addPoints(team: Team, points: Int){
        repository.addPoints(team, points)
    }

    fun resetGame(){
        repository.resetGame()
    }
}