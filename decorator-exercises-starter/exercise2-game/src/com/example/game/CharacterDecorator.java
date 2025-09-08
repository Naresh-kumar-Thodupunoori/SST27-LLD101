package com.example.game;

/**
 * Base decorator that wraps another Character and delegates calls.
 * Extend this class to modify only the parts you need (speed, damage, sprite).
 */
public class CharacterDecorator implements Character {
    protected final Character inner;

    public CharacterDecorator(Character inner) {
        this.inner = inner;
    }

    @Override
    public void move() {
        inner.move();
    }

    @Override
    public void attack() {
        inner.attack();
    }

    @Override
    public int getSpeed() {
        return inner.getSpeed();
    }

    @Override
    public int getDamage() {
        return inner.getDamage();
    }

    @Override
    public String getSprite() {
        return inner.getSprite();
    }
}


