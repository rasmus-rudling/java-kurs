package Shape;

public abstract class Shape {
    protected String color;

    // Konkret metod - alla former delar denna implementation
    public void setColor(String color) {
        this.color = color;
    }

    // Abstrakt metod - måste implementeras av subklasser
    public abstract double calculateArea();

    // Abstrakt metod - måste implementeras av subklasser
    public abstract double calculatePerimeter();
}
