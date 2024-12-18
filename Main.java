public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Bird()
        };

        for (Animal animal : animals) {
            animal.printInfo();
            animal.makeSound();
            animal.eat();
            System.out.println();
        }

        Shape[] shapes = {
                    new Circle(5),
                    new Rectangle(4, 6),
                    new Triangle(3, 7)
            };

            for (Shape shape : shapes) {
                shape.printInfo();
            }







    }








}