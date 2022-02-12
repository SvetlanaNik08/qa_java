package com.example;

import java.util.List;

public class LionAlex extends Lion {
    String name;

    public LionAlex(Feline feline) throws Exception {
        super(feline, "Самец");
        this.name = "Алекс";
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }
}
