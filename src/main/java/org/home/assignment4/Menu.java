package org.home.assignment4;


import java.util.Scanner;

//Задача
//Реализовать программу для работы с графическими 2D фигурами (Квадрат, Прямоугольник, Круг  и Треугольник).
//Пользователю предоставить меню, для выбора фигуры.
//Выберите фигуру:
//Квадрат
//Прямоугольник
//Круг
//Треугольник
//Выход
//После выбора конкретной фигуры запросить определяющие ее параметры (ширина, высота - для прямоугольника,
// стороны для треугольника, радиус для круга).
//Вы выбрали прямоугольник.
//Введите длину боковой грани: 10
//Введите длину верхней грани: 20
//Для каждой фигуры реализовать отдельными методами расчет площади и периметра, и вывести их на экран.
//Прямоугольник со сторонами 10, 20 имеет площадь 200.
//
//Каждую фигуру оформить в виде отдельного класса.
//Каждый класс должен переопределить метод toString - описание фигуры с определяющими ее параметрами
//Создать отдельный класс создающий конкретную фигуру по выбору пользователя. Этот же класс должен производить
// взаимодействие с пользователем по зарпашиванию параметров фигуры.
public abstract class Menu {

    public Menu() {
    }

    public abstract String getPerimeter();

    public abstract String getArea();


    public static int figure = 0;

    public static void displayMenu() {
        System.out.println("Выберите фигуру:");
        System.out.println("1. Квадрат");
        System.out.println("2. Прямоугольник");
        System.out.println("3. Круг");
        System.out.println("4. Треугольник");
        System.out.println("5. Выход");
        figure = new Scanner(System.in).nextInt();
    }

    public static void whatWillWeDo() {
        displayMenu();
        switch (figure) {
            case 1:
                RectangleScan.getParam();
                break;
            case 2:
                SquareScan.getParam();
                break;
            case 3:
                CircleScan.getParam();
                break;
            case 4:
                TriangleScan.getParam();
                break;
            case 5:
                System.out.println("Выход");
                break;
            default:
                System.out.println("WRONG!!!");
                whatWillWeDo();
        }
    }

    public static void main(String[] args) {
        whatWillWeDo();
    }
}
