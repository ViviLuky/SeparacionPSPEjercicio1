import java.awt.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        String frase=scanner.nextLine();
        StringTokenizer stringTokenizer=new StringTokenizer(frase);
        while(stringTokenizer.hasMoreTokens()){
            String palabra=stringTokenizer.nextToken();
            System.out.println(palabra);
        }
        System.out.println("FIN");
    }
}