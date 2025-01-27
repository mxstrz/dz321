class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public void printInfo() {
        System.out.println("Це трикутник з основою " + base + " і висотою " + height + ", площа: " + calculateArea());
    }
}