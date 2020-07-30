package enumdemo;

/**
 *
 * @author Pavelvic
 */
public enum Tools {
    SCREWDRIVER(20), WRENCH(10), HAMMER(40), PLIERS(5);
    private int m;

    private Tools(int m) {
        this.m = m;
    }
    int getMas () {return m;}
}
