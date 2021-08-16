package com.train

import java.util.*

fun main(){

    val scn = Scanner(System.`in`)
    print("Please enter number of tickets:")
    var tickets = scn.nextInt()
    print("How many round-trip tickets:" )
    var roundTrip = scn.nextInt()
    val tic = TesterKotlin(tickets, roundTrip)
    tic.show()
}

class TesterKotlin(var tickets:Int, var roundTrip:Int) {
    fun show(){
        println("Total tickets:" + tickets + "\n" +
                "Round-Trip:" + roundTrip + "\n" +
                "Total:" + ((tickets-roundTrip)*1000+(roundTrip*2000)*0.9))

    }

}