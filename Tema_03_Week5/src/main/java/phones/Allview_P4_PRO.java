package phones;

import behavior.RandomIMEI;

public class Allview_P4_PRO extends Allview {
    private static final int batteryLife = 64;

    public Allview_P4_PRO() {
        super("Black", "Metal", batteryLife, RandomIMEI.generateIMEI() );
    }

    public Allview_P4_PRO(String color, String material) {
        super(color, material, batteryLife, RandomIMEI.generateIMEI());
    }
}
