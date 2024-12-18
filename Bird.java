class Bird implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Птах співає: Чик-чирик!");
    }

    @Override
    public void eat() {
        System.out.println("Птах їсть зерно.");
    }

    @Override
    public void printInfo() {
        System.out.println("Це птах.");
    }
}