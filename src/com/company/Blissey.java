package com.company;
import ru.ifmo.se.pokemon.*;

class Blissey extends Chansey{
    public Blissey(String name, int level){
        super(name, level);
        this.setStats(255,30,15,85,65,65);
        this.setType(Type.NORMAL);
        Move[] Attack = new Move[4];
        Attack [0] = new Swagger();
        Attack [1] = new ShadowBall();
        Attack [2] = new Present();
        Attack [3] = new Rest();
        this.setMove(Attack);
    }
}

class Rest extends StatusMove{
    public Rest(){}
    Effect Rest = new Effect().chance(0.3).turns(2).condition(Status.SLEEP);
    protected void applySelfEffects(Pokemon att){att.addEffect(Rest); att.getHP();}
    protected String describe(){return ("использует Rest");}
}
