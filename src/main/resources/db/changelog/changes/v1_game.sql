create table `game` (
  game_id int(11) not null AUTO_INCREMENT,
  name VARCHAR(200) not null,
  bgg_id int(11) not null,
  last_updated datetime not NULL,
  primary key(game_id),
  unique (bgg_id)

)