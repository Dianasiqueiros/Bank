import java.util.Scanner;

public class Main {
    public static void main(String [] args){

    Scanner s = new Scanner(System.in);
    System.out.println("Nombre del cliente: ");
    String name = s.nextLine();
    System.out.println("Tipo de tarjeta: ");
    String type= s.nextLine();
    Card card;
    CardType value=CardType.fromString(type);
    short year;
    short month;
    switch(value){
        case DEBITO:
            System.out.println("Ingresa el monto maximo:  ");
            double maxAmount= s.nextDouble();
            System.out.println("Ingresa la mes de expiracion: ");
            month= s.nextShort();
            System.out.println("Ingresa el año de expiracion: ");
            year= s.nextShort();
            card= new CreditCard(CardType.fromString(type),name,month,year,maxAmount);
            System.out.println("Tarjeta de: " + " " + " " + name + card);
            break;
        case CREDITO:
            System.out.println("Ingresa el monto minimo:  ");
            double minAmount= s.nextDouble();
            System.out.println("Ingresa la mes de expiracion: ");
            month= s.nextShort();
            System.out.println("Ingresa el año de expiracion: ");
            year= s.nextShort();
            card=new DebitCard(CardType.fromString(type),name,month,year,minAmount);
            System.out.println("Tarjeta de: " + " " + name + " " + card);
        }
    }
}

