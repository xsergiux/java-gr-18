package phones;

import behavior.RandomIMEI;

public class Samsung_Galaxy_S6 extends Samsung {
    private static final int batteryLife = 24;

    public Samsung_Galaxy_S6() {
        super("White", "Gorila Glass 4", batteryLife, RandomIMEI.generateIMEI() );
    }

    //Configurable color & material properties as per spec
    public Samsung_Galaxy_S6(String color, String material) {
        super(color, material, batteryLife, RandomIMEI.generateIMEI());
    }

}
