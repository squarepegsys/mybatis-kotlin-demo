package com.objectpartners.demo

import com.objectpartners.demo.dao.GameDao
import com.objectpartners.demo.domain.Game
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.jdbc.core.JdbcTemplate
import spock.lang.Specification

import java.time.LocalDateTime

@SpringBootTest(classes=MyKotlinApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GameDaoSpec extends Specification {

    @Autowired
    GameDao gameDao

    @Autowired
    JdbcTemplate jdbcTemplate

    void "test that the mapper works"() {

        when:

        gameDao.insert("Pandemic",30549);
        Game game = gameDao.findByTitle("Pandemic");

        def games = gameDao.findAll()

        then:

        game.gameId>0
        game.name=="Pandemic"
        game.bggId==30549
        game.lastUpdated>LocalDateTime.MIN

    }
    
}
