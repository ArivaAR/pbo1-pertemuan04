
public class Main {
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh = 225;

        System.out.println("Isi Gelas Sekarang : " + isiGelas + "m1");
        System.out.println("Isi Gelas Ketika Penuh : " + penuh + "m1");

        do {
            isiGelas++;
            System.out.println("Sedang mengisi gelas..");
            System.out.println("Isi Gelap Sekrang : " + isiGelas + "m1");
        }while(isiGelas != penuh);

        System.out.println("Finale: Isi Gelas Sekarang : " + isiGelas + "m1");

        }
    }