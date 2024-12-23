package bsu.rfe.java.group8.lab1.Kuzmich.varA7;

public class IceCream extends Food {
    private String sirup;

    public IceCream(String sirup) {
        super("Мороженое");
        this.sirup = sirup;
    }

    public void consume() {
        System.out.println(this + " съедено");
    }

    public String getSirup() {
        return sirup;
    }

    public void setSirup(String sirup) {
        this.sirup = sirup;
    }

    @Override
    public String toString() {
        return super.toString() + " с сиропом '" + sirup + "'";
    }

    public static int countFoodType(Food[] breakfast, Class<?> foodType) {
        int count = 0;
        for (Food item : breakfast) {
            if (item != null && item.equals(foodType)) {
                count++;
            }
        }
        return count;
    }

}

