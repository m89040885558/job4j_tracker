package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare zayac = new Hare();
        Wolf gray = new Wolf();
        Fox alisa = new Fox();
        ball.runBall(ball);
        zayac.notEat(ball);
        gray.notEat(ball);
        alisa.tryEat(ball);
    }
}
