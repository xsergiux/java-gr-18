import java.util.ArrayList;
import java.util.List;

public class MainTema {
    public static void main(String[] args) {
        Book c1 = new Book();
        c1.setNume("Prima Carte");
        c1.setNumarPagini(30);

        Book c2 = new Book();
        c2.setNume("A doua Carte");
        c2.setNumarPagini(80);

        Book c3 = new Book();
        c3.setNume("A treia Carte");
        c3.setNumarPagini(550);

        Novel n1 = new Novel();
        n1.setNume("Prima Nuvela");
        n1.setNumarPagini(200);
        n1.setType("Mystery");

        Novel n2 = new Novel();
        n2.setNume("A doua Nuvela");
        n2.setNumarPagini(350);
        n2.setType("Science fiction");

        ArtAlbum a1 = new ArtAlbum();
        a1.setNume("Primul Album");
        a1.setNumarPagini(35);
        a1.setCaliateHartie("Buna");

        ArtAlbum a2 = new ArtAlbum();
        a2.setNume("Al doilea Album");
        a2.setNumarPagini(55);
        a2.setCaliateHartie("Foarte buna");

        List<Book> listaCarti = new ArrayList<>();

        listaCarti.add(c1);
        listaCarti.add(c2);
        listaCarti.add(c3);
        listaCarti.add(n1);
        listaCarti.add(n2);
        listaCarti.add(a1);
        listaCarti.add(a2);
        listaCarti.remove(c3);

        for (Book book : listaCarti) {
            System.out.println(book.toString());
        }

        System.out.println("Nuvelele sunt de doua feluri:");
        System.out.println(n1.getNume() + "este de tip " + n1.getType() + " iar " +n2.getNume() + "este de tip " + n2.getType());
        System.out.println("Albumele de arta au calitatea hartiei de doua feluri:");
        System.out.println(a1.getNume() + " are calitatea hartiei " + a1.getCaliateHartie() + " iar "
                + a2.getNume() + " are calitatea hartiei " + a2.getCaliateHartie());
    }
}
