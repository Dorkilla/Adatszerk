package adatszerkezet;

public class Adatszerkezet {

   
    public static void main(String[] args) {
       Nev nev= new Nev('#');
       
       nev.kirajzol();
       
           System.out.println("Első sorban lévő karakterek száma: " + nev.hanyJelVan(0, -1));
    }
    
}
