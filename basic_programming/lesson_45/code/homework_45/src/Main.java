public class Main {
    /*
        Создать интерфейс Shape, содержащий методы для подсчета периметра и площади фигуры.
        Создать классы Circle и Rectangle, имплементирующие этот интерфейс для круга и прямоугольника.
        В методе main класса Main создать несколько обьектов этих классов и вывести на экран площади и периметры фигур.
 */
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        System.out.println(circle.perimeter());
        System.out.println(circle.area());

        Shape rectangle = new Rectangler(10,10);
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.area());
    }
}
