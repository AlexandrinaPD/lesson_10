/**
 * Класс служит для хранения пиццы со свойствами <b>basis</b> <b>composition</b> <b>name</b> <b>cost</b>
 *
 * @author Aleksandra
 * @version 1.0
 */
public class Pizza {

    /**
     * Поле базис типа класса Circle
     */
    private Circle basis;
    /**
     * Поле состав пиццы
     */
    private String composition;
    /**
     * Поле название пиццы
     */
    private String name;
    /**
     * Поле цена пиццы
     */
    private double cost;

    /**
     * Конструктор - создание нового объекта с определенными значениями
     *
     * @param composition
     * @param name
     * @param cost
     * @param diameter
     */


    public Pizza(String composition, String name, double cost, double diameter) {
        this.composition = composition;
        this.name = name;
        this.cost = cost;
        this.basis = new Circle(diameter / 2);

    }

    /**
     * Функция получения значения поля {@link Circle#radius}
     *
     * @return Возвращает диаметр
     */

    public double getDiameter() {
        return basis.radius * 2;
    }

    /**
     * Функция получения значения поля {@link Pizza#composition}
     *
     * @return Возвращает состав пиццы
     */

    public String getComposition() {
        return composition;
    }

    /**
     * Функция получения значения поля {@link Pizza#name}
     *
     * @return Возвращает название пиццы
     */
    public String getName() {
        return name;
    }

    /**
     * Функция получения значения поля {@link Pizza#cost}
     *
     * @return Возвращает цену пиццы
     */
    public double getCost() {
        return cost;
    }

}


