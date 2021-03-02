package com.company;
import ru.ifmo.se.pokemon.*;

class Chansey extends Happiny{
    public Chansey(String name, int level){
        super(name, level);//формируем суперкласс для обращения к файлу в классе lab2
        this.setStats(255,10,10,75,135,55);
        this.setType(Type.NORMAL);
        Move[] Attack = new Move[3];
        Attack[0] = new Swagger();
        Attack[1] = new ShadowBall();
        Attack[2] = new Present();
        this.setMove(Attack);
    }
}

class Present extends PhysicalMove {
    public Present() {
        super(Type.NORMAL, 0, 90);
    }

    protected String describe() {
        return ("использует Present");
    }
}