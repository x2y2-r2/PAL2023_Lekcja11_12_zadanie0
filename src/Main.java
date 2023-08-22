import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//          Zadanie jest symulacją wiersza w planszy do gry.
//
//        Row - wiersz - posiada listę pól (Field)
//        Field - posiada symbol

//        Napraw kod tak, aby po wpisaniu rozmiaru wiersza równego 3 pojawiło się:
//        _ _ _

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak dlugi wiersz?");
        int size = scanner.nextInt();

        Row row = new Row();
        row.initialize(size);
        row.show();
    }
}