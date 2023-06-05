public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500

        System.out.println("Подравлям с покупкой билета!");
        System.out.println("Вам начислено " + miles + " миль!");
        System.out.println("Вы можете воспольоваться милями при оплате следующего билета.");
        System.out.println("Подробнее с программой МИЛИ можно ознакоиться на странице ...");
    }
}
