/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticExamples;

import java.time.LocalDate;

/**
 *
 * @author keora
 */
public class StaticHelper {
    public static void printMessage(String message) {
        System.out.println("Messsage for " +
         LocalDate.now() + ": " + message);
    }
}
