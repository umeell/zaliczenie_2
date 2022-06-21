import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int[][] tablica = new int[3][3];
    int iloczyn = 1;
    Scanner skan = new Scanner(System.in);
    for (int i = 0; i < tablica.length; i++) {
    for (int j = 0; j < tablica[i].length; j++) {
        tablica[i][j] = 5; 
   }
  }
    for (int i = 0; i < tablica.length; i++) {
    for (int j = 0; j < tablica[i].length; j++) {
        if(tablica[i][j]%5==0){
          iloczyn=iloczyn*tablica[i][j];
        }
    }}
    System.out.println(iloczyn);

}
}