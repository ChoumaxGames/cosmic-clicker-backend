package com.choumaxgames.players;

public interface IPlayer {

    void getUID();
    void getName();

    long addScore(long score);
    long getScore();

}
