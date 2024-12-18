class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Кіт нявкає: Няв-няв!");
    }

    @Override
    public void eat() {
        System.out.println("Кіт їсть рибу.");
    }

    @Override
    public void printInfo() {
        System.out.println("Це кіт.");
    }
}