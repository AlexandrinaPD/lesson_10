public class Pizzeria {
    /**
     * Главный метод программы. Создает массив пицц с названиями. Вывод циклом названия пицц на экран. Візов метода показать информацию о пиццах
     *
     * @param args
     */

    public static void main(String[] args) {

        String[] menu = new String[5];
        menu[0] = "Margherita";
        menu[1] = "Classic";
        menu[2] = "Marinara";
        menu[3] = "Chicken";
        menu[4] = "Spicy";

        for (int i = 0; i < 5; i++) {
            System.out.println(menu[i]);

        }
        Pizza[] pizzes = getPizzes();
        showInfo(pizzes);
    }

    /**
     * Создание метода Пицца которых хранит в себе описание пицц и возвращает их описание
     *
     * @return
     */
    private static Pizza[] getPizzes() {
        Pizza[] pizza = new Pizza[5];
        pizza[0] = new Pizza("cheese + tomato", "Margherita", 150, 30);
        pizza[1] = new Pizza("cheese + tomato + mushroom", "Classic", 170, 35);
        pizza[2] = new Pizza("cheese + tomato + salami", "Marinara", 165, 35);
        pizza[3] = new Pizza("cheese + tomato + chicken", "Chicken", 180, 30);
        pizza[4] = new Pizza("cheese + tomato + pepper", "Spicy", 150, 35);
        return pizza;
    }

    /**
     * Создание метода показа информации массива пицц с их описанием через цикл и вывода их на экран.
     *
     * @param arrayOfPizzes
     */
    private static void showInfo(Pizza[] arrayOfPizzes) {
        for (int i = 0; i < arrayOfPizzes.length; i++) {
            System.out.println("Name: " + arrayOfPizzes[i].getName() + ". " + "Composition: " +
                    arrayOfPizzes[i].getComposition() + ". Size: " + arrayOfPizzes[i].getDiameter() + " cm.. Cost: "
                    + arrayOfPizzes[i].getCost() + " grn.");
        }


    }
}
