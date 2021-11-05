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
        double min = shares.get(0);
        double max = shares.get(0);
        int i = 1;
        while (i < shares.size()) {
            if(shares.get(i) > max) {
                max = shares.get(i);
            }
            if(shares.get(i) < min ) {
                min = shares.get(i);
            }
            // Ez a többihez kéne, ezért nem értettem a feladatot
//            while (i < shares.size()
//                    && !(shares.get(i) - shares.get(i - 1) > 0.0)) {
//                i++;
//            }
//            localSum = shares.get(i - 1);
//            while (i < shares.size()
//                    && !(shares.get(i) - shares.get(i - 1) < 0.0)) {
//                i++;
//            }
//            localSum = shares.get(i - 1) - localSum;
//             Igazából ez lenne a maximális haszon( a felszálló ágakban bent van, a leszálló ágak idején másik részvényben)
//            maxSum += sum;
//            Ez csak egyszeri max lokális emelkedésből származó haszon
//            if (localSum > maxSum) {
//                maxSum = localSum;
//            }
            i++;
        }
        maxSum = max-min;
        return maxSum;
    }
}
