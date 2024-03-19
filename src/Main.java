import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir indeks girin: ");
        int index = scanner.nextInt();

        try {
            int element = getElementAtIndex(array, index);
            System.out.println("Dizinin " + index + ". indeksi: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Belirtilen indeks dizinin boyutunun dışında!");
        }
    }

    public static int getElementAtIndex(int[] array, int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }
}
