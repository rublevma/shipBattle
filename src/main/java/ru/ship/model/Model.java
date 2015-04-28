package ru.ship.model;

import org.jetbrains.annotations.NotNull;

/**
 * @author a.zhizhelev on 21.04.2015.
 */
public class Model {
    /** Расстановка кораблей.*/
    public static class GameBoard{}
    /** Сделанные ходы и ответы на них.*/
    public static class GameBoardState{
        @NotNull
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

    @NotNull
    HitStatus shoot(@NotNull GameBoard gameBoard, @NotNull GameBoardState state, @NotNull Point point){
        throw new IllegalStateException();
    }
}
