/* Module 2. Task 4
 * Classname: AbstractFactory
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

public class AbstractFactory {
    //Creation object method by Abstract factory
    //@param sideA, sideB that are used to calculations
    //@param Figure that is used to identify objects type
    public static  IGeometry create (double sideA, double sideB, Figure figure){
        switch (figure) {
            //Identifying type of object
            case TRIANGLE: return new Triangle(sideA, sideB);
            case RECTANGLE: return new Priamougolnik(sideA, sideB);
            case SQUARE: return new Square(sideA, sideB);
            default: return null;
        }
        }

    }

