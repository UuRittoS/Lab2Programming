package com.company;

import ru.ifmo.se.pokemon.Battle;

public class Lab2{
    public static void main(String args[]){
        Battle b = new Battle();
        b.addAlly(new Chansey("Чхансей", 1));
        b.addAlly(new Blissey("Блиссей", 2));
        b.addAlly(new Happiny("Хаппинй", 3));
        b.addFoe(new TapuFini("Тапу Фини", 1));
        b.addFoe(new Eevee ("Еевее", 2));
        b.addFoe(new Umbreon("Умбрейон", 3));
        b.go();
    }//формируем бой
}