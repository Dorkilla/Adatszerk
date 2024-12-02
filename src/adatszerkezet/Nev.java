package adatszerkezet;

public class Nev{
    private char jelzes;
    private char[][] rajz;
    
public Nev(char jelzes){
       this.jelzes=jelzes;
       this.rajz= new char[5][5];
       
       for(int i=0; i < 5; i++){
           for(int j=0; j < 5; j++){
             if (j==0 || (i==0&&j<4)|| (i==4&&j<4)|| (j==4&&i>0&&i<4)){
                 rajz[i][j]=jelzes;
             }else{
                 rajz[i][j]= ' ';
             }
           }
       }
   }

public void kirajzol(){
for(int i=0; i<rajz.length;i++){
    for(int j=0; j<rajz[i].length; j++){
        System.out.print(rajz[i][j]);
        }
      }
    System.out.println();
    }

public int hanyJelVan(int sor, int oszlop){
    int db=0;
    if (sor >= 0 && sor < rajz.length) {
            for (int j = 0; j < rajz[sor].length; j++) {
                if (rajz[sor][j] != ' ') db++;
     }
    }
     else if (oszlop >= 0 && oszlop < rajz[0].length) {
            for (int i = 0; i < rajz.length; i++) {
                if (rajz[i][oszlop] != ' ') db++;
            }
     }
    return db;
    }

public boolean teliSor(int sor){
    if(sor >= 0 && sor < rajz.length){
    for(int i=0; )
    }

}