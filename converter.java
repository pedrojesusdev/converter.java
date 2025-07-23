import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de quilometros que você deseja converter:");
        float km = input.nextFloat();
        float hm = 10 * km;
        float dam = hm * 10;
        float m = dam * 10;
        float cm = m * 10;
        float dm = cm * 10;
        float mm = cm * 10;
        
        String result = String.format("%.1f Quilometros possuem: %.1f hm | %.1f dam | %.1f m | %.1f cm | %.1f dm | %.1f mm", km, hm, dam, m, cm, dm, mm);
        System.out.println(result);
        input.close();
    }
} 
