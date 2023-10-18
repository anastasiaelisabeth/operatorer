import java.util.Scanner;
public class vilkettal {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);

        System.out.println("Skriv in ett tal");

        int x = tangentbord.nextInt();
        int y=x;

        tangentbord.nextLine();

        System.out.println("Addera 7");
        x+=7;
        System.out.println("= " +x);
        tangentbord.nextLine();
        System.out.println("Multipricera med 2");
        x*=2;
        System.out.println("= " +x);
        tangentbord.nextLine();
        System.out.println("Subtrahera 6");
        x-=6;
        System.out.println("= " +x);
        tangentbord.nextLine();
        System.out.println("Halvera talet");
        x/=2;
        System.out.println("= " +x);
        tangentbord.nextLine();
        System.out.println("Addera yttligare 3");
        x+=3;
        System.out.println("= " +x);
        tangentbord.nextLine();
        System.out.println("Subtrahera ursprungliga talet");
        x-=y;
        System.out.println("= " +x);
        tangentbord.nextLine();

        System.out.println("Ditt tal är " +x);



    }
}
