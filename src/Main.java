public class Main {
    public static void main(String[] args) {
        int account = 100;
        int topUp = 1001;
        int bonus;
        if (topUp > 1000){
            bonus = topUp / 100;
        } else bonus = 0;

        System.out.println ("На счете " + (topUp + account + bonus) +" рублей");
        System.out.println("Вам начислено " + bonus + " бонусных рублей");

    }
}