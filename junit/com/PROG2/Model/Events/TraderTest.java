package com.PROG2.Model.Events;

import javafx.collections.ObservableList;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraderTest {

    @Test
    @Ignore
    void getWeaponsForSale() {
        Trader trader = new Trader(new int[]{312,33,23,70,588,7});
        trader.getWeaponsForSale();
    }

    @Test
    @Ignore
    void getArtifactsForSale() {
        Trader trader = new Trader(new int[]{312,33,23,70,588,7});
        trader.getArtifactsForSale();
    }

    @Test
    @Ignore
    void armorForSale() {
        Trader trader = new Trader(new int[]{312,33,23,70,588,7});
        trader.armorForSale();
    }

    @Test
    @Ignore
    void getCardsForSale() {
        Trader trader = new Trader(new int[]{312,33,23,70,588,7});
        trader.getCardsForSale();
    }
}