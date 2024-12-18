interface Animal {
    void makeSound();
    void eat();
    void printInfo();
}

// Клас для собаки
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Собака гавкає: Гав-гав!");
    }

    @Override
    public void eat() {
        System.out.println("Собака їсть м'ясо.");
    }

    @Override
    public void printInfo() {
        System.out.println("Це собака.");
    }
}