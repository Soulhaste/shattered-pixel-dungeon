/*
 * Shattered Pixel Dungeon
 * Copyright (C) 2014-2026 Evan Debenham
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */
package com.shatteredpixel.shatteredpixeldungeon.actors.hero;

/** Hero race is independent of class. */
public enum HeroRace {
    HUMAN("Human"),
    NIGHT_ELF("Night Elf");

    private final String title;

    HeroRace(String title) {
        this.title = title;
    }

    public String title() {
        return title;
    }
}
