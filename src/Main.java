import Task1.Class1;
import Task2.Class2;
import Task3.Class3;
import Task4.Class4;
import Task5.Class5;
import Task6.Class6;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 2.1");
        Class1 obj1 = new Class1();
        obj1.method1();

        System.out.println("Задача 2.2");
        Class2 obj2 = new Class2("имя поля в задаче 2.2");
        System.out.println("Вывод для задачи 2.2: " + obj2.getField());

        System.out.println("Задача 2.3");
        Class3 obj3 = new Class3("имя поля в задаче 2.3");
        System.out.println(obj3.toString());

        System.out.println("Задача 2.4");
        Class4 obj4 = new Class4("имя поля в задаче 2.4");
        System.out.println("Вывод для задачи 2.4: " + obj4.getField());

        System.out.println("Задача 2.5");
        Class5 obj5 = new Class5("имя поля в задаче 2.5");
        System.out.println("Вывод для задачи 2.5: " + obj5.getField());

        System.out.println("Задача 2.6");
        Class6 obj6 = new Class6("имя поля в задаче 2.6");
        System.out.println("Вывод для задачи 2.6: " + obj6.getField());

    }
}