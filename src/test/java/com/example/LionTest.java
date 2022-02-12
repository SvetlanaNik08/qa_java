package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.junit.runners.Parameterized;
import java.util.List;

@RunWith(Parameterized.class)
public class LionTest {
    private final String sexParameterized;
    private final boolean hasManeParameterized;

    public LionTest(String sexParameterized, boolean hasManeParameterized) {
        this.sexParameterized = sexParameterized;
        this.hasManeParameterized = hasManeParameterized;
    }

    @Parameterized.Parameters
    public static Object[][] getLionData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;

    @Test public void getKittensReturns1() throws Exception {
        Lion lion = new Lion(feline, sexParameterized);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        Assert.assertEquals(1, actual);
    }

   @Test
    public void doesHaveManeReturnsCorrectValue() throws Exception {
       Lion lion = new Lion(feline, sexParameterized);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(hasManeParameterized, actual);
   }

   @Test
   public void getFoodReturnsList() throws Exception {
        Lion lion = new Lion(feline, sexParameterized);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }
}


