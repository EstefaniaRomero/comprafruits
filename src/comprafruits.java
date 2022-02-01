import java.util.Scanner;

public class comprafruits {

    public static void main(String[] args) {

        int money = askmoney();
        int option = chooseFruits();
        int price = getPricebyFruit(option);
        int balance = purchaseFruit(price,money);
    }

    private static int getPricebyFruit(int option) {

        if (option == 1){

            return 20;
        } else if (option == 2){
            return 10;
        }else return 30;

    }


    private static int purchaseFruit(int price,int money) {

        int result = 0;
        if (money > price) {

            result = money - price;
            System.out.println("Et queden " + result + " diners, pots seguir comprant");
        } else {
            System.out.println("No tens diners suficients per seguir comprant");
        }
        return result;


    }


    private static int chooseFruits() {

        System.out.println("Avui tenim Platan a 20€ (1), Pomes a 10€ (2), Taronges a 30€ (3), que tries? ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        return option;
    }



    private static int askmoney() {
        int money = 0;
        System.out.println(" Quants diners tens? ");
        Scanner sc = new Scanner(System.in);
        return  money = sc.nextInt();

    }

}
