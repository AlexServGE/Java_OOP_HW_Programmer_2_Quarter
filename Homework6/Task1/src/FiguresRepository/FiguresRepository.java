package FiguresRepository;

import Figure.*;

import java.util.ArrayList;
import java.util.List;

public class FiguresRepository {
    protected List<Figure> someFigureRepository;
    protected double allPerimeters;
    protected double allLengths;
    protected double allAreas;


    public FiguresRepository() {
        this.someFigureRepository = new ArrayList<>();
        this.allPerimeters = 0;
        this.allLengths = 0;
        this.allAreas = 0;
    }

    public void add(Figure someFigure) {
        this.someFigureRepository.add(someFigure);
        allAreas += someFigure.getArea();
        if (someFigure instanceof IPerimeterable) {
            allPerimeters += ((IPerimeterable) someFigure).getPerimeter();
        } else {
            allAreas += ((ILengthable) someFigure).getLength();
        }
    }

    public List<Figure> getSomeFigureRepository() {
        return someFigureRepository;
    }

    public void setSomeFigureRepository(List<Figure> someFigureRepository) {
        this.someFigureRepository = someFigureRepository;
    }

    public double getAllPerimeters() {
        return allPerimeters;
    }

    public void setAllPerimeters(double allPerimeters) {
        this.allPerimeters = allPerimeters;
    }

    public double getAllLengths() {
        return allLengths;
    }

    public void setAllLengths(double allLengths) {
        this.allLengths = allLengths;
    }

    public double getAllAreas() {
        return allAreas;
    }

    public void setAllAreas(double allAreas) {
        this.allAreas = allAreas;
    }
}
