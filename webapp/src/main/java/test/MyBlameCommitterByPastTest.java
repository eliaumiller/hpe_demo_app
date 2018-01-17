package test;

import java.util.Random;

/**
 *  Created by vaingato                   on 05/12/2016.
 *  Testing hotspot  widget by Ralu
 *  test test11
 */
public class MyBlameCommitterByPastTest {
    private static Random rand = new Random();
    private static int randomNumber = rand.nextInt(2);

    // if committed a change to calc, the new analyzer will find you as responsible!
    public static void blameCommitterPastTestA() {     //  1  test covers this
        if (randomNumber > 0) {
            Calcs.randomThrowExceptionMethodA();
        }
    }

    // if committed a change to calc, the new analyzer will find you as responsible!
    public static void blameCommitterPastTestB() {     //  1  test covers this
        if (randomNumber == 0) {
            Calcs.randomThrowExceptionMethodB();
        }
    }


}
