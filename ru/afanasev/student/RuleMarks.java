
package ru.afanasev.student;

/**
 *
 * @author Афанасьев_ИС
 */
public class RuleMarks implements Verifiable {

    @Override
    public boolean check(int x) {
       if(x>2 || x<=5 ) return true;
        return false;

    }
    
}
