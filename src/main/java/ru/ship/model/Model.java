package ru.ship.model;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.text.MessageFormat;

/**
 * @author a.zhizhelev on 21.04.2015.
 */
public class Model {
    /** Расстановка кораблей.*/
    public static class GameBoard{}
    /** Сделанные ходы и ответы на них.*/
    public static class GameBoardState{
        GameBoard gameBoard;
//        List<Ship> hurtShips;
//        HitStatus getStatus(Point point);
    }
    public static class Ship {
        int length;
    }
    class ShipList {}
    /** Правила игры. Содержат размеры доски и количество кораблей разных размеров.*/
    class Rules {}
    public static class Turn{}
    public static class Player{}
    public static class PlayerStrategy{}

    enum HitStatus{
        Miss,
        Hurt,
        Kill
    }
    enum Direction{
        Horizontal,
        Vertical
    }
    class ShipPosition {}

    HitStatus shoot(GameBoard gameBoard, GameBoardState state, Point point){
        throw new NotImplementedException();
    }
}
