package phones;

import behavior.RandomIMEI;

public class Nokia_2720_Flip extends Nokia {
    private static final int batteryLife = 24;

    public Nokia_2720_Flip() {
        super("Red", "Copper", batteryLife, RandomIMEI.generateIMEI() );
    }

    public Nokia_2720_Flip(String color, String material) {
        super(color, material, batteryLife, RandomIMEI.generateIMEI());
    }
}
