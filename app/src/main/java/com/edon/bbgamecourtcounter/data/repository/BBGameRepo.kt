package com.edon.bbgamecourtcounter.data.repository

import com.edon.bbgamecourtcounter.data.model.Team

class BBGameRepo {
    //create the two teams - acting data source
    val teamA = Team("Lakers")
    val teamB = Team("Warriors")

    //function to add points
    fun addPoints(team: Team, points: Int){
        team.score += points
    }

    //resetting scores
    fun resetGame(){
        teamA.score = 0
        teamB.score = 0
    }
}