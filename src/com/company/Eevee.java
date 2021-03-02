package com.company;
import ru.ifmo.se.pokemon.*;

class Eevee extends Pokemon{
    public Eevee(String name, int level){
        super(name, level);
        this.setStats(55,55,50,45,65,55);
        this.setType(Type.NORMAL);
        Move[] Attack = new Move[3];
        Attack [0] = new DoubleTeam();
        Attack [1] = new WorkUp();
        Attack [2] = new Facade();
        this.setMove(Attack);
    }
}

class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.EVASION, 1);
    }

    @Override
    protected String describe() {
        return "использует Double Team";
    }
}
class WorkUp extends StatusMove {
    public WorkUp() {
    }
    protected String describe() {
        return ("использует WorkUp");
    }
}
class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        Status p_stat = def.getCondition();
        if (p_stat.equals(Status.BURN) || p_stat.equals(Status.POISON) || p_stat.equals(Status.PARALYZE)) {
            super.applyOppDamage(def, damage*2);
        }
        else {
            super.applyOppDamage(def, damage);
        }
    }

    @Override
    protected String describe() {
        return "использует Facade";
    }
}

