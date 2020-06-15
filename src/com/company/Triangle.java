/* Module 2. Task 4
 * Classname:Triangle
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

public class Triangle  implements IGeometry {

    private double sideA;
    private double sideB;
    private double sideC;
//Сonstructor with parametr
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    //Сonstructor with parametr
    public Triangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC =  Math.sqrt(sideA*sideA + sideB*sideB);
    }
//Constructor without parametr
    public Triangle() {
    }
//getter 1
    public double getA() {
        return sideA;
    }
//setter 1
    public void setA(double a) {
        this.sideA = sideA;
    }
//getter 2
    public double getB() {
        return sideB;
    }
//setter 2
    public void setB(double chislo) {

        if (sideB >0 ) this.sideB = chislo;
    }
//getter 3
    public double getC() {
        return sideC;
    }
//setter3
    public void setC(double sideC) {
        this.sideC = sideC;
    }

    //Implemented method to calculate area
    //@pram sideA, sideB, sideC are used to calculate Area
    public double getArea() {
        double semi = this.getLength() /2;
        return  Math.sqrt(semi * (semi - sideA) * (semi -sideB) * (semi -sideC) );
    }

//Implemented method to calculate perimetr
// @pram sideA, sideB, sideC are used to calculate Area
    public double getLength() {
        return sideA + sideB + sideC;
    }
//to string method
    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + sideA +
                ", b=" + sideB +
                ", c=" + sideC +
                '}';
    }
}
