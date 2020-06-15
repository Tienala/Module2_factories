/* Module 2. Task 4
 * Classname: Main
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
public class Main {

    public static void main(String[] args) {
        //Create object by Factory
        Priamougolnik priamougolnik2 = PriamougolnikFactory.create(3,5);
        System.out.println(priamougolnik2);
        //Create object by Abstract Factory
        IGeometry square = AbstractFactory.create(4,4, Figure.SQUARE);
        System.out.println(square);

    }
}