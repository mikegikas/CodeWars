public class BuyCar {

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int months = 0;
        int totalSaving = 0;
        double priceOld = startPriceOld;
        double priceNew = startPriceNew;
        double leftSavings = 0;
        double percentLoss = percentLossByMonth;

        while((totalSaving + priceOld) < priceNew){
            months++;
            if (months % 2 == 0){
                percentLoss += 0.5;
            }
            totalSaving += savingperMonth;
            priceOld -= priceOld * (percentLoss / 100);
            priceNew -= priceNew * (percentLoss / 100);
        }
        leftSavings =  Math.round(totalSaving + priceOld - priceNew);
        return new int[] { months, (int) leftSavings };
    }
}
