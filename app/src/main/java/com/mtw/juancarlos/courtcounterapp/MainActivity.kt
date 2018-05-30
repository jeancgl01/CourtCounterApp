package com.mtw.juancarlos.courtcounterapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    val teamA: Team =  Team()
    val teamB: Team =  Team()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnReset.setOnClickListener{
            teamA.resetPoints()
            teamB.resetPoints()
            setScoreTeamA()
            setScoreTeamB()
            Toast.makeText(this,"Reset Game!!",Toast.LENGTH_LONG).show()

        }

    }

    fun btn3PAOnClick(view: View) {
            teamA.treePointsBasket()
            setScoreTeamA()
    }

    fun btn2PAOnClick(v:View){
        teamA.twoPointsBasket()
        setScoreTeamA()
    }

    fun btnFTAOnClick(view:View){
        teamA.onePointsBasket()
        setScoreTeamA()
    }

    fun btn3PBOnClick(view: View){
        teamB.treePointsBasket()
        setScoreTeamB()

    }

    fun btn2PBOnClick(view: View){
        teamB.twoPointsBasket()
        setScoreTeamB()
    }

    fun btnFTBOnClick(view: View){
        teamB.onePointsBasket()
        setScoreTeamB()
    }

    private fun setScoreTeamA(){
        txtScoreA.text = teamA.totalPoints.toString()
    }

    private fun setScoreTeamB(){
        txtScoreB.text = teamB.totalPoints.toString()
    }


}
