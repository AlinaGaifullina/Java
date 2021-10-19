package ДЗ_21_10;

public class Garden {
    public static void main(String[] args) {
        Plant Apple = new Plant("Apple Tree", 20, true, 0);
        Plant Pear = new Plant("Pear Tree", 24, true, 0);
        Plant Peach = new Plant("Peach Tree", 2, true, 0);

        System.out.println("Report #1:");
        Apple.statistics();
        Pear.statistics();
        Peach.statistics();

        Water water = new Water();
        water.fill(92);

        water.TryToWater(Apple);
        water.TryToWater(Pear);
        water.TryToWater(Peach);

        System.out.println("Report #2:");
        Apple.statistics();
        Pear.statistics();
        Peach.statistics();
    }

}
