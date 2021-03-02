package com.company;
import ru.ifmo.se.pokemon.*;

class TapuFini extends Pokemon{
    public TapuFini(String name, int level){
        super(name, level);
        this.setStats(70,75,115,95,130,85);
        this.setType(Type.FAIRY);
        Move[] Attack = new Move[4];
        Attack [0] = new BulkUp();
        Attack [1] = new RockTomb();
        Attack [2] = new ZenHeadbutt();
        Attack [3] = new SmartStrike();
        this.setMove(Attack);
    }
}


class BulkUp extends StatusMove{
    public BulkUp(){}
    Effect BulkUp = new Effect().chance(0.3).turns(1).stat(Stat.ATTACK, 1).stat(Stat.DEFENSE,1);
    protected void applySelfEffects(Pokemon att){att.addEffect(BulkUp);}
    protected String describe(){return ("использует BulkUp");}
}

class RockTomb extends PhysicalMove{
    public RockTomb(){super(Type.ROCK,60,95);}
    Effect RockTomb = new Effect().chance(0.3).turns(1).stat(Stat.SPEED, -1);
    protected void applyOppEffects(Pokemon att){att.addEffect(RockTomb);}
    protected String describe(){return ("использует RockTomb");}
}


class SmartStrike extends PhysicalMove{
    public SmartStrike(){super(Type.STEEL,70,0);}
    protected String describe(){return ("использует SmartStrike");}
}

class ZenHeadbutt extends PhysicalMove{
    public ZenHeadbutt(){super(Type.PSYCHIC,80,90);}
    Effect ZenHeadbutt = new Effect().chance(0.2).turns(1);
    protected void applyOppEffects(Pokemon att){att.addEffect(ZenHeadbutt);}
    protected String describe(){return ("использует ZenHeadbutt");}
}