package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите тип фигуры:\n1 - круг\n2 - треугольник\n3 - прямоугольник\n\n");
        Scanner console = new Scanner(System.in);
        int type = console.nextInt();
        switch(type){
            case 1:
                System.out.println("Введите радиус кружочка: ");
                int R = console.nextInt();
                circle c = new circle(R);
                System.out.println(c.calc_square());
                break;
            case 2:
                System.out.println("Введите катеты треугольника: ");
                int cat1 = console.nextInt();
                int cat2 = console.nextInt();
                triangle t = new triangle(cat1,cat2);
                System.out.println(t.calc_square());
                break;
            case 3:
                System.out.println("Введите стороны прямогольника: ");
                int a = console.nextInt();
                int b = console.nextInt();
                square s = new square(a,b);
                System.out.println(s.calc_square());
                break;
        }
    }
}
