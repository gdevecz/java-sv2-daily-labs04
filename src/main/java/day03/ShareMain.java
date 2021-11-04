package day03;

import java.util.Arrays;

public class ShareMain {

    public static void main(String[] args) {
//        Stock stock = new Stock(Arrays.asList(1.23,4.35,0.23,4.0,8.4));
//        System.out.println(stock.maxProfit());  //8.17
//
//        Stock stock2 = new Stock(Arrays.asList(12.0,2.0,8.0,4.0));
//        System.out.println(stock2.maxProfit()); //6.0

        Stock stock = new Stock(Arrays.asList(1.23, 1.23, 4.35, 4.35, 0.23, 0.23, 4.0, 4.0, 8.4, 8.4, 1.23, 1.23, 4.35, 4.35, 0.23, 0.23, 4.0, 4.0, 8.4, 8.4));
        System.out.println(stock.maxProfit());  //8.17

        Stock stock2 = new Stock(Arrays.asList(12.0, 2.0, 8.0, 4.0, 12.0, 2.0, 8.0, 4.0, 12.0, 2.0, 8.0, 4.0));
        System.out.println(stock2.maxProfit()); //8.0


    }
}
