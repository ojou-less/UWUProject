package com.PROG2.Model.Events;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameEventTest {

    @Test
    @Ignore
    void randomEvent() {
        GameEvent ge = new GameEvent(new Trader(new int[]{2,2,2,2,2}));
        assertTrue(ge != null);
    }
}