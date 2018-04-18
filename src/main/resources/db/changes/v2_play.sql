create table `play` (
  play_id int(11) not null AUTO_INCREMENT,
  bgg_id int(11) not null,
  username VARCHAR(20) not null,
  game_id int(11) not null,
  quantity int(11) not null DEFAULT 1,
  comments text,
  played_on_date date,
  date_created datetime,
  primary key(play_id),
  unique (bgg_id)
)