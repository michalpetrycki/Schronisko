package schronisko;

import java.util.Scanner;

public class Schronisko {

    public static void main(String[] args) {
        chose = "";
        capacity = 8;
        z = new Zwierze();
        
        z.fillList();
        
        while(true){
            noa = z.numberOfAnimals();
            while(capacity > noa){
                System.out.println("Co chcesz zrobic?");
                System.out.println("1 - Dodaj zwierze, 2 - usun zwierze, "
                        + "3 - wypisz wszystkie zwierzęta, 4 - zamknij.");
                chose = sc.next();
                noa = z.getList().size();
                if(chose.equals("1")){
                    System.out.println("Podaj imie zwierzaka: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Podaj wiek zwierzaka: ");
                    int age = sc.nextInt();
                    int id = z.nextId();
                    z.addZwierze(new Zwierze(id, name, age));
                    System.out.println("Pomyślnie dodano zwierzaka.");
                    System.out.println("Zostalo: " + (capacity - noa - 1) +" miejsc.");
                }
                else if(chose.equals("2")){
                    System.out.println("Podaj id zwierzaka do usunięcia: ");
                    int id = sc.nextInt();
                    z.delZwierze(id);
                }
                else if(chose.equals("3")){
                    z.printStatus();
                }
                else if(chose.equals("4")) System.exit(0);
                else System.out.println("Wybierz coś: ");
            }
            while(capacity == noa){
                sc.nextLine();
                System.out.println("Co chcesz zrobić? 1- usuń zwierzaka, 2 - status, 3 - wyjscie");
                chose = sc.nextLine();
                if(chose.equals("1")){
                    System.out.println("Podaj id zwierzaka do usunięcia: ");
                    int id = sc.nextInt();
                    z.delZwierze(id);
                }else if(chose.equals("2")){
                    z.printStatus();
                }else if(chose.equals("3")){
                    System.exit(0);
                }else System.out.println("Wybierz coś z listy: ");
            }
            while(capacity < noa) System.out.println("Schronisko jest przepełnione");
        }
    }
    static Scanner sc = new Scanner(System.in);
    private static Zwierze z;
    private static String chose;
    private static int capacity;
    private static int noa;
}
