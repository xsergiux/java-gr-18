package phones;

import behavior.RandomIMEI;

public class Nokia_Sand_2 extends Nokia{
    private static final int batteryLife = 24;

    public Nokia_Sand_2() {
        super("Light Brown", "Aluminium", batteryLife, RandomIMEI.generateIMEI() );
    }

    public Nokia_Sand_2(String color, String material) {
        super(color, material, batteryLife, RandomIMEI.generateIMEI());
    }


}
