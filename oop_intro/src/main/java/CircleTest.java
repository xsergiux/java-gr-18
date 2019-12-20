public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5, "red");
        System.out.println("Aria obiectului circle1 este: " + circle1.getAria());
        System.out.println("Perimetrul obiectului circle1 este: " + circle1.getPerimeter());
        System.out.println("Culoarea obiectului circle1 este: " + circle1.color);

        Circle circle2 = new Circle(7, "green");
        System.out.println("Aria obiectului circle2 este: " + circle2.getAria());
        System.out.println("Perimetrul obiectului circle2 este: " + circle2.getPerimeter());
        System.out.println("Culoarea obiectului circle2 este: " + circle2.color);

        Circle circle3 = new Circle(8, "black");
        System.out.println("Aria obiectului circle3 este: " + circle3.getAria());
        System.out.println("Perimetrul obiectului circle3 este: " + circle3.getPerimeter());
        System.out.println("Culoarea obiectului circle3 este: " + circle3.color);

        Circle circle4 = new Circle(10, "pink");
        System.out.println("Apelare metode din object class");
        System.out.println(circle4);

        System.out.println(circle4.toString());
        createArrayOfCircle();

}       //urmatorul exercitiu
        private static void createArrayOfCircle () {
            Circle[] circleArray = new Circle[10];

            for (int i = 0; i <= circleArray.length - 1; i++) {
                if (i % 2 == 0)
                Circle circle = new Circle(i + 1, "blue");
                circleArray[i] = circleEven;
            }else{
                Circle circle0dd = new Circle(i + 1, "green");
                circleArray[i] = circle0dd;
            }
        }
    }
}

