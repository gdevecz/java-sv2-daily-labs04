package day03;

import java.util.List;

public class StockOrai {

    private List<Double> stocks;

    public StockOrai(List<Double> stocks) {
        this.stocks = stocks;
    }

    public double maxProfit() {
        double sum = 0.0;
        for (int i = 1; i < stocks.size(); i++) {
            double diff = stocks.get(i) - stocks.get(i - 1);
            if (diff > 0.0) {
                sum += diff;
            }
        }
        return sum;
    }
}