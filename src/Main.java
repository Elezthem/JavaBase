public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "ElezthemDev";
        person1.age = 16;
        Person person2 = new Person();
        person2.name = "Anton";
        person2.age = 19;
        int year1 = person1.calculatorTipa();
        int year2 = person2.calculatorTipa();
        System.out.println("1-у человеку до пенсии: " + year1 + " годикаф");
        System.out.println("2-у человеку до пенсии: " + year2 + " годикаф");
    }
}
class Person {
    String name;
    int age;

    int calculatorTipa() {
        int years = 65-age;
        return years;
    }

    void speak() {
        for(int i = 0; i<3; i++)
        System.out.println("Меня зовут " + name + ", мне " +age+" лет");
    }
    void sayHi() {
        System.out.println("Hi!");
    }
}