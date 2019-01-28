package test;

/**
 *  Created by vaingato                   on 05/12/2016.
 *  Testing hotspot  widget by Ralu
 *  test test11
 */
public class  MyBlameCommitterByPastTestClass {

    // if committed a change to calc, the new analyzer will find you as responsible!
    public static void blameCommitterPastTestA() {     //  1  test covers this
        Calcs.randomThrowExceptionMethodA();
    }

    // if committed a change to calc, the new analyzer will find you as responsible!
    public static void blameCommitterPastTestB() {     //  1  test covers this
        Calcs.randomThrowExceptionMethodB();
    }


}
