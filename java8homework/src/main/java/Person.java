public class Person {
    private String name;
    private String country;
    private int tennisScore;
    private int age;

    public Person(String name, String country, int tenisScore, int age) {
        this.name = name;
        this.country = country;
        this.tennisScore = tenisScore;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getTennisScore() {
        return tennisScore;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Tenis Player: " + name + ", of age: " + age + ",  representing: " + country +
                ", acumulated a total score of: " + tennisScore + " points." + "\n";
    }
}
