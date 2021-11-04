package day03;

import java.util.List;

public class Stock {
    private List<Double> shares;

    public Stock(List<Double> shares) {
        this.shares = shares;
    }

    public double maxProfit() {
        double maxSum = 0.0;
        double localSum = 0.0;

        int i = 1;
        while (i < shares.size()) {
            while (i < shares.size()
                    && !(shares.get(i) - shares.get(i - 1) > 0.0)) {
                i++;
            }
            localSum = shares.get(i - 1);
            while (i < shares.size()
                    && !(shares.get(i) - shares.get(i - 1) < 0.0)) {
                i++;
            }
            localSum = shares.get(i - 1) - localSum;
//             Igazából ez lenne a maximális haszon
//            maxSum += sum;
//            Ez csak egyszeri vétel eladási maximum
            if (localSum > maxSum) {
                maxSum = localSum;
            }
            i++;
        }
        return maxSum;
    }
}
