/**
 * @author Bruno Araujo, n. 49545
 * Demo for the Git lab on Software Engineering
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Super animal git demo");
        Animal dog = new Dog("Bobby");
        Animal cat = new Cat("Kitty");
        System.out.println(dog.getName() + " says " + dog.speak());
        System.out.println(cat.getName() + " says " + cat.speak());
    }
}

