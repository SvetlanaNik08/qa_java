package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.junit.runners.Parameterized;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensReturns0() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        int actual = lionAlex.getKittens();
        Assert.assertEquals(0, actual);
    }

    @Test
    public void getFriendsReturnsList() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        List<String> actual = lionAlex.getFriends();
        Assert.assertEquals(List.of("Марти", "Глория", "Мелман"), actual);
    }

    @Test
    public void getPlaceOfLivingReturnsCorrectValue() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        String actual = lionAlex.getPlaceOfLiving();
        Assert.assertEquals("Нью-Йоркский зоопарк", actual);
    }
}
