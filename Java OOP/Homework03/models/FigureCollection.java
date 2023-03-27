package homeworks.hw3.Models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FigureCollection {

    private List<Figure> figures;

    public FigureCollection() {
        figures = new ArrayList<>();
    }

    public int getCount() {
        return figures.size();
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    public void removeFigure(int index) {
        figures.remove(index);
    }

    public void updateFigure(int index, Figure figure) {
        figures.set(index, figure);
    }

    public void sortByArea() {
        Collections.sort(figures, new Comparator<Figure>() {
            @Override
            public int compare(Figure f1, Figure f2) {
                return Double.compare(f1.getArea(), f2.getArea());
            }
        });
    }
}
