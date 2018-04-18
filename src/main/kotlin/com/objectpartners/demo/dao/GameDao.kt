package com.objectpartners.demo.dao

import com.objectpartners.demo.domain.Game
import org.apache.ibatis.annotations.*


@Mapper
interface GameDao {
    @Select("select * from game where name=#{title}")
    fun findByTitle(@Param("title") title: String): Game

    @Select("select * from game")
    fun findAll(): List<Game>


    @Insert("insert into game (name,bgg_id,last_updated) values (#{name},#{bggId},NOW())")
    @Options(useGeneratedKeys = true)
    fun insert(
            @Param("name") name: String,
            @Param("bggId") bggId: Int

               )

    @Select("select * from game where bgg_id=#{bggId}")
    fun findByBggId(@Param("bggId") bggId:Int): Game

}
