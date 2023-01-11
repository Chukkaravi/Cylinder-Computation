public class CylinderComputation{
    public static void main(String args[]){
        double surfaceArea, baseArea, volume, radius, heigth, pi;
        radius = 3.344;
        heigth = 6.344;
        pi = 3.142;
        surfaceArea = 2 * pi * radius * heigth + 2 * pi *(radius*radius);
        baseArea = pi *(radius * radius);
        volume = pi *(radius * radius)* heigth;
        System.out.println("The Surface area is " + surfaceArea);
        System.out.println("The Base area is "+ baseArea);
        System.out.println("The Volume is " + volume);
    }
}