/**
 * Класс служит для хранения круга со свойствами <b>radius</b> <b>length</b> <b>area</b> <b>color</b>
 *
 * @author Aleksandra
 * @version 1.0
 */

public class Circle {

    /**
     * Поле радиус
     */
    public double radius;
    /**
     * Поле длина
     */
    public double length;
    /**
     * Поле площадь
     */
    public double area;
    /**
     * Поле цвет
     */
    public String color;

    /**
     * Конструктор и вложенный конструктор с дефолтным данным цвета
     *
     * @param radius радиус круга
     */

    public Circle(double radius) {
        this(radius, "White");
    }

    /**
     * Создание конструктора с определенными значениями и расчетными в конструкторе значениями
     *
     * @param radius радиус круга
     * @param color  цвет круга
     */

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        this.area = this.radius * Math.PI;
        this.length = 2 * Math.PI * this.radius;
    }

    /**
     * Главный метод программы. Создает обьект круг и выводит данные на экран через другой метод
     *
     * @param args Параметры командной строки
     */

    public static void main(String[] args) {

        Circle circle = new Circle(5, "White");
        printInfo(circle);

    }

    /**
     * Метод вывода на экран. Сначала устанавливает для них значения свойств, а затем выводит на экран
     *
     * @param circle Параметры командной строки
     */

    private static void printInfo(Circle circle) {
        System.out.println("Area = " + circle.getArea());
        System.out.println("Length = " + circle.getLength());
        System.out.println("Color = " + circle.getColor());
    }

    /**
     * Функция получения значения поля {@link Circle#length}
     *
     * @return Возвращает длину
     */

    public double getLength() {
        return length;
    }

    /**
     * Функция получения значения поля {@link Circle#area}
     *
     * @return Возвращает площадь
     */

    public double getArea() {
        return area;
    }

    /**
     * Функция получения значения поля {@link Circle#color}
     *
     * @return Возвращает название цвета
     */

    public String getColor() {
        return color;
    }
}
