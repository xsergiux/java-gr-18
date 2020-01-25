public class Book {
    private int numarPagini;
    private String nume;

    public int getNumarPagini() {
        return numarPagini;
    }

    public void setNumarPagini(int numar) {
        numarPagini = numar;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String numele) {
        nume = numele;
    }

    @Override
    public String toString() {
        return "Book{" + "Cartea se numeste: '" + nume +
                "' si are numarul de pagini de " + numarPagini +
                '\'' + "}" ;
    }
}
