import java.util.*;
public class Main {
    public static void main(String[] args) {
        display();
        Currency();
    }
        public static void display(){
        System.out.println("Currency Convertor");
            System.out.println();
            System.out.println("Select a Currency");
            System.out.println("1.Rupees");
            System.out.println("2.Dollar");
            System.out.println("3.Pound");
            System.out.println("4.Euro");
    }

    public static void Currency (){
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        double curr = 0;
        switch (choice){
            case 1:
                System.out.print("Enter in Rupees : ");
                curr = sc.nextDouble();

                System.out.println();
                //dollars
                double doll= curr/82.94;
                System.out.println("Dollar:"+doll);

                //pound
                double pou= curr/103.32;
                System.out.println("Pound:"+pou);

                //Euro
                double euro= curr/89.06;
                System.out.println("Euro:"+euro);
                break;
            case 2:
                System.out.print("Enter in Dollars : ");
                curr = sc.nextDouble();

                System.out.println();
                //Rupees
                double rupe= curr*82.94;
                System.out.println("Rupees:"+rupe);

                //pound
                pou= curr*0.80;
                System.out.println("Pound:"+pou);

                //Euro
                euro= curr*0.93;
                System.out.println("Euro:"+euro);
                break;
            case 3:
                System.out.print("Enter in Pound : ");
                curr= sc.nextDouble();

                System.out.println();
                //Rupees
                rupe = curr*103.32;
                System.out.println("Rupees:"+rupe);

                //Dollars
                doll = curr/0.80;
                System.out.println("Dollar:"+doll);

                //Euro
                euro= curr*0.86;
                System.out.println("Euro:"+euro);
                break;

            case 4:
                System.out.print("Enter in Euro : ");
                curr= sc.nextDouble();

                System.out.println();
                //Rupees
                rupe = curr/89.11;
                System.out.println("Rupees:"+rupe);

                //Dollars
                doll = curr/0.93;
                System.out.println("Dollar:"+doll);

                //pound
                pou= curr/1.16;
                System.out.println("Pound:"+pou);
                break;
            default:
                System.out.println("Enter Valid Currency Number");
                break;
        }
    }
}
