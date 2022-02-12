package com.example;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {

    @Test
    public void getFoodReturnsList() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.getFood("Хищник");
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }

    @Test
    public void eatMeatReturnsList() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }

    @Test
    public void getFamilyReturnsCorrectValue() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        Assert.assertEquals("Кошачьи", actual);
    }

    @Test
    public void getKittensWhenNoParametersThenReturns1() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        Assert.assertEquals(1, actual);
    }

    @Test
    public void getKittenWhenParametersThenReturnsTheSameValue() {
        Feline feline = new Feline();
        int actual = feline.getKittens(5);
        Assert.assertEquals(5, actual);
    }
}
