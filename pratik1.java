import java.util.Scanner;

public class pratik1 {
    public static void main(String[] args) {
        /*
         * Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri 
         * kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
         */
         Scanner inp = new Scanner(System.in);

        int number;
        int total = 0;


        do {
            System.out.print("sayı giriniz: ");

            number = inp.nextInt();
            if(number%4==0){
                total +=number;
                System.out.println(total);
            }

            
        } while (number%2 ==0);


    }
    
}
