import Task1.Class1;
import Task2.Class2;
import Task3.Class3;
import Task5.Class5;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 2.1");
        Class1 obj1 = new Class1();
        obj1.method1();

        System.out.println("Задание 2.2");
        Class2 obj2 = new Class2();
        System.out.println("аннотация с default " + obj2.getField());

        System.out.println("Задание 2.3");
        Class3 obj3 = new Class3();
        System.out.println(obj3.toString());

        System.out.println("Задание 2.4, Validate ");
        Class4 obj4 = new Class4("Тигр", "Вася");
        System.out.println("Аннотация с Validate ");
        System.out.println("animal: " + obj4.getAnimal());
        System.out.println("name: " + obj4.getName());

        System.out.println("Задание 2.5");
        Class5 obj5 = new Class5("first", 2);
        System.out.println("Аннотация с Two");
        System.out.println("first: " + obj5.getFirst());
        System.out.println("second: " + obj5.getSecond());

        System.out.println("Задание 2.6 , Cache");
        System.out.println("Аннотация с Cache");
        Class6 obj6 = new Class6("First", 2, 2.4);
        System.out.println("first: " + obj6.getFirst());
        System.out.println("second: " + obj6.getSecond());
        System.out.println("third: " + obj6.getThird());

    }
}