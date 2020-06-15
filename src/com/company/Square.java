/* Module 2. Task 4
 * Classname: Square
 *
 * Version 1
 *
 * Nataliia Zviertseva, NTU KhPI
 *
 * Develop for your class
1. Factory.
2. Abstract factory.
 */
package com.company;

public class Square implements IGeometry {
    private double sideA;
    private double sideB;
    // constructor
    public Square(double sideA, double sideB) {
        this.sideA = sideA;
         this.sideB = sideA;
    }
    //Getter
    public double getSideA() {
        return sideA;
    }
    //Setter
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    //Implemented Method to calculate area
    @Override
    public double getArea() {
        return this.sideA*this.sideB;
    }
    //Implemented Method to calculate perimetr
    @Override
    public double getLength() {
        return 2 * sideA + 2 * sideB;
    }
    //To string method
    @Override
    public String toString() {
        return "Square{" +
                "Perimetr=" + getLength() +
                ", Area=" + getArea() +
                '}';
    }
}

