// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       for(int i=1; i<=10; i++){
           for(int j=1; j<=10; j++) {
               int l = i*j;
               System.out.print(l + (l<10 ? "  " : " "));
           }
           System.out.println();
       }
    }
}