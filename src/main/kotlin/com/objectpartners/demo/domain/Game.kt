package com.objectpartners.demo.domain

import java.sql.Timestamp
import java.time.LocalDateTime

data class Game (
    val gameId: Int,
    val name: String,
    val bggId: Int,
    val lastUpdated: LocalDateTime

    )
{

   constructor( gameId: Int,
                 name:String,
                 bggId :Int ,
                 sqlTimestamp: Timestamp): this(gameId,name,bggId,sqlTimestamp.toLocalDateTime())


}
