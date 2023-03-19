package models;

public abstract class BaseFigure implements Figure, Comparable<BaseFigure> {

    @Override
    public void PrintInfo() {
        System.out.println(String.format("Периметр: %.2f", this.Perimeter()));        
        System.out.println(String.format("Площадь: %.2f", this.Area()));
    }

    @Override
    public int compareTo(BaseFigure o) {
        return Double.compare(this.Area(), o.Area());
    }
}
