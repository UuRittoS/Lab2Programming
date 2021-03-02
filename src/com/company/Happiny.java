package com.company;
import ru.ifmo.se.pokemon.*;

class Happiny extends Pokemon{
    public Happiny(String name, int level){
        super(name, level);
        this.setStats(100,5,5,15,65,30);
        this.setType(Type.NORMAL);
        Move[] Attack = new Move[2];
        Attack [0] = new Swagger();
        Attack [1] = new ShadowBall();
        this.setMove(Attack);
    }
}


class Swagger extends StatusMove{
    public Swagger(){super(Type.NORMAL,0,85);}
    Effect Swagger = new Effect().chance(0.3).turns(1).stat(Stat.ATTACK, 2);
    protected void applySelfEffects(Pokemon def){def.addEffect(Swagger);}
    protected void applyOppEffects(Pokemon att){Effect.confuse(att);}
    protected String describe(){return ("использует Swagger");}

}

class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 80D, 100);
    }

    Effect ShadowBall = new Effect().chance(0.2).turns(1).stat(Stat.SPECIAL_DEFENSE, -1);

    protected void applyOppEffects(Pokemon p) {
        p.addEffect(ShadowBall);
    }

    protected String describe() {
        return ("использует ShadowBall");
    }
}