package exo2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CompositeShape implements Shape3D {
    private List<Shape3D> shapes;
    public CompositeShape(){
        shapes = new ArrayList<>();
    }

    public void addShape(Shape3D shape){
        shapes.add(shape);
    }
   
    @Override
    public double calculateVolume(){
        double clac = 0;
        for(Shape3D i : shapes){
            clac += i.calculateVolume();
        }
        return clac;
    }

    @Override
    public double calculateSurfaceArea(){
        double surf = 0;
        for(Shape3D i : shapes){
            surf += i.calculateSurfaceArea();
        }
    return surf;
    }
}
