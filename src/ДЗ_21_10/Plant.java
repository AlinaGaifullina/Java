package ДЗ_21_10;

public class Plant {
    String name;
    int age;
    boolean isDry;
    int fruit;

    public Plant(String name, int age, boolean isDry, int fruit) {
        this.name = name;
        this.age = age;
        this.isDry = isDry;
        this.fruit = fruit;
    }
    void statistics(){
        if (isDry) {
            System.out.println(name + ": " + fruit + " Fruit" + "   //The plant needs WATER!");
        } else {
            System.out.println(name + ": " + fruit + " Fruit" + "   //All is well.");
        }
    }
}
