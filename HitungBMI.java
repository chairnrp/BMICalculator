import java.util.Scanner;

public class HitungBMI {
    public static void main(String[] args) {
        double BeratBadan;
        double TinggiBadan;
        double Bmi;
        boolean IdealorNo;

        Scanner input = new Scanner(System.in);

        System.out.println("=== program menghitung BMI ===");

        System.out.println("masukan berat badan anda (Kg):");
        BeratBadan = input.nextDouble();

        System.out.println("masukan tinggi badan anda (meter):");
        TinggiBadan = input.nextDouble();

        Bmi = BeratBadan / (TinggiBadan * TinggiBadan);

        IdealorNo = Bmi >= 18.5 && Bmi <= 24.9;

        System.out.println("=== hasil perhitungan BMI ===");
        System.out.println("BMI anda:" + " " + Bmi);

        if (IdealorNo) {
            System.out.println("status berat badan anda adalah ideal");
        } else if (Bmi < 18.5) {
            System.out.println("status berat badan anda kurang ideal (underweight)");
        } else {
            System.out.println("status berat badan anda kurang ideal (overweight)");
        }

        input.close();


    }
}
