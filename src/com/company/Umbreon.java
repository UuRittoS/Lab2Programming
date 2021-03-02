package com.company;
import ru.ifmo.se.pokemon.*;

class Umbreon extends Eevee{
    public Umbreon(String name, int level){
        super(name, level);
        this.setStats(95,65,110,60,130,65);
        this.setType(Type.DARK);
        Move[] Attack = new Move[4];
        Attack [0] = new DoubleTeam();
        Attack [1] = new WorkUp();
        Attack [2] = new Facade();
        Attack [3] = new DarkPulse();
        this.setMove(Attack);
    }
}

class DarkPulse extends SpecialMove{
    public DarkPulse(){super(Type.DARK,80D,100);}
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.2) {
            Effect.flinch(p);
        }
    }
    protected String describe(){return ("использует Acid");}
}




