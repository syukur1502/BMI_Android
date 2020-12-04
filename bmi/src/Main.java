import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int gender;
        do {
            System.out.println("masukkan gender");

            System.out.println("1 untuk laki laki");
            System.out.println("2 untuk perempuan");
            gender = sc.nextInt();

        } while (gender < 1 || gender > 2);


        System.out.println("Berat badan dalam kg");
        float bb = sc.nextFloat();

        System.out.println("tinggi badan dalam cm");
        float tb = sc.nextFloat();
        tb = tb / 100;

        float bmi = bb / (tb * tb);

        System.out.println(bmi);
        String kategori = " ";

        switch (gender) {
            case 1:
                if (bmi < 18) {
                    kategori = " Kurus ";
                } else if (bmi <= 25) {
                    kategori = " sehat";
                } else if (bmi > 25) {
                    kategori = " Obesitas ";
                }
                break;
            case 2:
                if (bmi < 17) {
                    kategori = " Kurus ";
                } else if (bmi <= 23) {
                    kategori = " sehat";
                } else if (bmi > 23) {
                    kategori = " Obesitas ";
                }
                break;

        }
        System.out.println(" nilai bmi anda adalah  " + bmi + " dengan status  " + kategori);
    }

        }


