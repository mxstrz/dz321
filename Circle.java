// Інтерфейс для геометричних фігур
interface Shape {
    double calculateArea();
    void printInfo();
}

// Клас для кола
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Це коло з радіусом " + radius + ", площа: " + calculateArea());
    }
}