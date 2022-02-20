package ДЗ_2021.ДЗ_21_10;

public class Water {
    int waterCount;

    Water() {
        waterCount = 0;
    }

    void fill(int amount) {
        waterCount += amount;
    }

    boolean TryToWater(Plant plant) {
        if(plant.isDry == false){
            return false;
        }
        int NeedToWater = 2 * plant.age;
        if(waterCount < NeedToWater){
            plant.fruit = 0;
            return false;
        }
        waterCount -= NeedToWater;
        plant.isDry = false;
        plant.fruit += plant.age * 3;
        return true;
    }

}
