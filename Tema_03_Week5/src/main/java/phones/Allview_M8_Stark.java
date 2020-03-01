package phones;

import behavior.RandomIMEI;

public class Allview_M8_Stark extends Allview {
    private static final int batteryLife = 24;

    public Allview_M8_Stark() {
        super("Gray", "Silicon", batteryLife, RandomIMEI.generateIMEI() );
    }

    public Allview_M8_Stark(String color, String material) {
        super(color, material, batteryLife, RandomIMEI.generateIMEI());
    }
}
