package exo2;
public class Sphere implements Shape3D{

    double r;
    final float pi = 3.14F;

    public Sphere(double r){
        this.r = r;
    }
    //Surface Area = 4πr2
    //Volume = 4/3πr3
    
    @Override
    public double calculateVolume(){
        double Volume =  (4/3*pi)*Math.pow(r,3);
        return Volume;
    }
    
    @Override
    public double calculateSurfaceArea(){
        double Surface = (4*pi)*Math.pow(r,2);
        return Surface;
    }
}
