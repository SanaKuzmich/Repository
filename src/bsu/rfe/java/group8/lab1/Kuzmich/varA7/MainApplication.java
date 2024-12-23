package bsu.rfe.java.group8.lab1.Kuzmich.varA7;

import static bsu.rfe.java.group8.lab1.Kuzmich.varA7.IceCream.countFoodType;

public class MainApplication {
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];

        int itemsSoFar = 0;
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            }
            if (parts[0].equals("IceCream")) {
                breakfast[itemsSoFar] = new IceCream(parts[1]);
            }

            itemsSoFar++;
        }

        for (Food item: breakfast) {
            if (item != null) {
                item.consume();
            } else {
                break;
            }
        }

        int iceCreamCount = countFoodType(breakfast, IceCream.class);
        System.out.println("Количество мороженого в завтраке: " + iceCreamCount);

        System.out.println("Всего хорошего!");
    }
}
