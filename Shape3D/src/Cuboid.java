package exo2;
public class Cuboid  implements Shape3D{
    private double length;
    private double width;
    private double height;


    public Cuboid (double length, double width,double height){
        this.height = height;
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateVolume(){
        return (length*width)*height;
    }

    @Override
    public double calculateSurfaceArea(){
        return 2*(length*width+width*height+length*height);
    }
    
}
