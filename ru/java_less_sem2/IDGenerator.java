/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task7;

import org.springframework.stereotype.Component;

/**
 *
 * @author Афанасьев_ИС
 */
@Component
public class IDGenerator {
    private static int seed;
    
    public static int next(){
        return seed++;
    }
}
