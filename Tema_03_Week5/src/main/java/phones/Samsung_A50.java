package phones;

import behavior.RandomIMEI;

public class Samsung_A50 extends Samsung {
    private static final int batteryLife = 38;

    public Samsung_A50() {
        super("Yellow", "Plastic", batteryLife, RandomIMEI.generateIMEI() );
    }

    //Configurable color & material properties as per spec
    public Samsung_A50(String color, String material) {
        super(color, material, batteryLife, RandomIMEI.generateIMEI());
    }


}
