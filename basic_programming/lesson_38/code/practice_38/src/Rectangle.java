// Создать класс Rectangle, содержащий методы для вычисления площади и периметра прямоугольника.
// Методы должны возвращать  периметр и площадь прямоугольника для длины и ширины передаваемых в качестве
// параметров в конструктор.
// Площадь прямоугольника = длина*ширина
// Периметр = 2*(длина + ширина)
// Создать несколько прямоугольников и вывести  на экран площадь и периметр для каждого

/*
1.Создать класс Rectangle, в котором создать поля  int length, int width, обьявить их приватными.
2.Создать конструктор, содержащий оба поля ширина и длина.
3.создать геттеры для полей
4. создать методы для вычисления площади и для вычисления периметра
5.Создать несколько прямоугольников и вывести  на экран площадь и периметр для каждого
 */
public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public int getArea(){
        return length*width;
    }

    public int getPerimeter(){
        return 2*(length+width);
    }

}
