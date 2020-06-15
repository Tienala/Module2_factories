/* Module 2. Task 4
 * Classname: PriamougolnikFactory
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

public class PriamougolnikFactory {
    //Creation Priamougolnik object method
    //@param sideA, sideB that are used to calculations
    public static Priamougolnik create(int sideA, int sideB) {
       //Check objects existion
        if (sideA != 0 && sideB != 0 &&sideA > 0 && sideB > 0) {
            Priamougolnik priamougolnik = new Priamougolnik(sideA, sideB);
            return priamougolnik;
        }else{
            return null;
        }
    }
}
