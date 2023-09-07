package Lab1.graphics;

import java.util.ArrayList;

public class Group {
    public ArrayList figures;

    public Group(ArrayList figures){
        this.figures = figures;

    }

    void addFigure(Object figure){
        this.figures.add(figure);
    }


    void addFiguresList(ArrayList figures){
        for (Object figure: figures) {
            this.figures.add(figure);
        }
    }
    void addAllGroupFigures(Group group){
        this.addFiguresList(group.figures);
    }
    void deleteFigure(Object figure){
        for (Object item: this.figures
             ) {
            if (item == figure){
                this.figures.remove(item);
            }

        }
    }

    void deleteFigureById(int id){
        this.figures.remove(id);
    }
    ArrayList getFiguresList(Group figure){
        return figure.figures;
    }
    Object getFigure(int id){
        return this.figures.get(id);
    }

    public String toString(){
        String result = "";
        for (Object figure: this.figures) {
            result += figure.toString() + " ";
        }
        return result;
    }


    void draw(){
        for (Object figure: this.figures) {
            figure.draw();
        }
    }

    void moveTo(float dx, float dy){
        ArrayList<Object> figures = new ArrayList<Object>();
        for (Object figure: this.figures) {
            figures.add(figure.moveTo(dx, dy));
        }
        this.figures = figures;
    }

    double calculateAllArea(){
        double result = 0;
        for (Object figure: this.figures) {
            result = result + figure.calculateArea();
        }
        return result;
    }

    void increaseSize(int n){
        for (Object figure: this.figures) {
            figure.increaseSize(n);
        }
    }

}
