package com.example.game;

/**
 * Adds a shiny aura: changes sprite, small buffs to both speed and damage,
 * and mentions the aura in actions.
 */
public class GoldenAura extends CharacterDecorator {
    private final String auraSprite = "golden_aura.png";
    private final int speedBuff = 1;
    private final int damageBuff = 2;

    public GoldenAura(Character inner) {
        super(inner);
    }

    @Override
    public int getSpeed() {
        return inner.getSpeed() + speedBuff;
    }

    @Override
    public int getDamage() {
        return inner.getDamage() + damageBuff;
    }

    @Override
    public String getSprite() {
        return auraSprite;
    }

    @Override
    public void move() {
        System.out.println("[Golden Aura] Moving at speed " + getSpeed() + " with sprite " + getSprite());
    }

    @Override
    public void attack() {
        System.out.println("[Golden Aura] Attacking with damage " + getDamage() + " using sprite " + getSprite());
    }
}


