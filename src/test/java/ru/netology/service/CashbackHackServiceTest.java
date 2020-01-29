package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void ShouldAdviseToBuyMoreIfAmountIsLessThan1000() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 900;

        int actual = cashback.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }
    @Test
    void ShouldNotAdviseToBuyMoreIfAmountIs1000() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 1000;

        int actual = cashback.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void ShouldThrowExceptionIfLessThan0() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = -100;
        assertThrows(IllegalArgumentException.class,() -> {cashback.remain(amount); });
    }
}