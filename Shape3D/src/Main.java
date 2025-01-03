package exo2;
public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(4);
        Cuboid cuboid = new Cuboid(5,3,2);
        CompositeShape compositeShape = new CompositeShape();

        System.out.println("the volume of sphere is :" + sphere.calculateVolume());
        System.out.println("the area of the surface is : " + sphere.calculateSurfaceArea());

        System.out.println("the volume of cuboid is :" + cuboid.calculateVolume());
        System.out.println("the area of the cuboid is : " + cuboid.calculateSurfaceArea());

        compositeShape.addShape(sphere);
        compositeShape.addShape(cuboid);

        System.out.println("the volume of composite is :" + compositeShape.calculateVolume());
        System.out.println("the area of the composite is : " + compositeShape.calculateSurfaceArea());


    }
}
