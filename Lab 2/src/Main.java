import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("---Задание 1");
        System.out.println("Введите координаты точки");
        System.out.println("Введите координату X");
        double x = InputCheck.CycleInputDouble("Введите координату X");
        System.out.println("Введите координату Y");
        double y = InputCheck.CycleInputDouble("Введите координату Y");
        Point userPoint = new Point(x, y);
        System.out.println("Координаты точки:");
        userPoint.ToString();
        System.out.println();

        System.out.println("---Задание 2---");
        /*System.out.println("Введите координаты точек для построения линии");
        System.out.println("Введите координаты первой точки");
        x = InputCheck.CycleInputDouble("Введите координату X");
        System.out.println("Введите координату Y");
        y = InputCheck.CycleInputDouble("Введите координату Y");
        Point userPointOne = new Point(x, y);
        System.out.println("Введите координаты второй точки");
        x = InputCheck.CycleInputDouble("Введите координату X");
        System.out.println("Введите координату Y");
        y = InputCheck.CycleInputDouble("Введите координату Y");
        Point userPointTwo = new Point(x, y);
        Line userLine = new Line(userPointOne, userPointTwo);
        userLine.ToString();
        System.out.println();*/

        Line lineOne = new Line(new Point(0, 3), new Point(23,8));
        lineOne.ToString();
        System.out.println();
        Line lineTwo = new Line(new Point(5, 10), new Point(25,10));
        lineTwo.ToString();
        System.out.println();
        Point p1LineOne = lineOne.getPointOne();
        Point p2LineTwo = lineTwo.getPointTwo();
        Line lineThree = new Line(p1LineOne, p2LineTwo);
        lineThree.ToString();
        System.out.println();
        System.out.println();
        p1LineOne.setX(1);
        p2LineTwo.setX(26);
        lineOne.ToString();
        System.out.println();
        lineTwo.ToString();
        System.out.println();
        lineThree.ToString();
        System.out.println();
        System.out.println();
        lineOne.setPointOne(new Point(25, 25));
        lineOne.ToString();
        System.out.println();
        lineThree.ToString();
        System.out.println();



        System.out.println("---Задание 3---");
        Student vasya = new Student("Вася", new int[]{3,4,5});
        Student petya = new Student("Петя", vasya.getMarks());
        petya.changeMark(5, 0);
        vasya.ToString();
        petya.ToString();
        int [] marksCopy = Arrays.copyOf(vasya.getMarks(), vasya.getMarks().length);
        Student andrei = new Student("Андрей", marksCopy);
        vasya.changeMark(2, 0);
        vasya.ToString();
        andrei.ToString();

        System.out.println("---Задание 4.1---");
        Point pointOne = new Point(3, 5);
        Point pointTwo = new Point(25, 6);
        pointOne.ToString();
        System.out.println();
        pointTwo.ToString();
        System.out.println();

        System.out.println("---Задание 4.7---");
        vasya = new Student("Вася", new int[]{3, 4, 5});
        vasya.ToString();;
        Student maksim = new Student("Максим");
        maksim.ToString();

        System.out.println("---Задание 5---");
        vasya = new Student("Вася", new int[]{3, 4, 5, 4});
        System.out.println(vasya.avgMarks());
        System.out.println(vasya.isCool());
        petya = new Student("Петя", new int[]{5, 5, 5, 5});
        System.out.println(petya.avgMarks());
        System.out.println(petya.isCool());
    }
}