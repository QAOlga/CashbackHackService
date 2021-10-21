package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CashbackHackServiceTest {

    @Test
    public void shouldAskToAdd50() {
        int amount = 950;
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(amount);

        Assert.assertEquals(50, expected);

    }

    @Test
    public void shouldNotAskToAdd() {
        int amount = 1000;
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(amount);

        Assert.assertEquals(0, expected);

    }
}