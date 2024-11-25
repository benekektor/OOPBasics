public class Parallelogram {
    private double base;
    private double height;
    private double side;

    public Parallelogram(double base, double height, double side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public double calculateArea() {
        return base * height;
    }

    public double calculatePerimeter() {
        return 2 * (base + side);
    }

    public boolean equals(Parallelogram other) {
        return this.calculateArea() == other.calculateArea();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public static void main(String[] args) {
        Parallelogram parallelogram1 = new Parallelogram(5, 10, 7);
        Parallelogram parallelogram2 = new Parallelogram(5, 10, 7);

        System.out.println("Площа паралелограма 1: " + parallelogram1.calculateArea());
        System.out.println("Периметр паралелограма 1: " + parallelogram1.calculatePerimeter());

        System.out.println("Площа паралелограма 2: " + parallelogram2.calculateArea());
        System.out.println("Периметр паралелограма 2: " + parallelogram2.calculatePerimeter());

        if (parallelogram1.equals(parallelogram2)) {
            System.out.println("Паралелограми мають однакову площу.");
        } else {
            System.out.println("Паралелограми мають різну площу.");
        }
    }
}
