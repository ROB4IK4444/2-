package com.company;

public class Main {

    public static void main(String[] args) {
        byte b = 8;
        char c = 16;
        short s = 16;
        int i = 32;
        long l = 64l;
        float f = 32.12f;
        double d = 64.234_56d;

        float TheFirstBoxer = 78.2f;
        float TheSecondBoxer = 82.7f;
        float TotalWeight = TheFirstBoxer + TheSecondBoxer;
        System.out.println("Общий вес боксеров " + TotalWeight +  " кг!");

        float WeightDifference = TheSecondBoxer - TheFirstBoxer;
        System.out.println("Разница в весе " + WeightDifference + " кг!");

        byte Bananas = 5;
        int Milk = 200;
        byte IceCreamSundae = 2;
        byte RawEggs = 4;
        int WeightOfOneBanana = 80;
        int WeightOfOneHundredGramsOfMilk = 105;
        int WeightOfOneIceCream = 100;
        int WeightOfOneEgg = 70;
        int TotalWeightOfBananas = Bananas * WeightOfOneBanana;
        int TotalMilkWeight = (Milk / 100)*WeightOfOneHundredGramsOfMilk;
        int TotalWeightOfIceCream = IceCreamSundae * WeightOfOneIceCream;
        int TotalWeightOfEggs = RawEggs * WeightOfOneEgg;
        int TotalWeightOfProducts = TotalWeightOfBananas + TotalMilkWeight + TotalWeightOfIceCream + TotalWeightOfEggs;
        System.out.println(TotalWeightOfProducts);
        float WeightInKilograms = TotalWeightOfProducts / 1000f;
        System.out.println("Общий вес продуктов " + WeightInKilograms + " кг!");

        byte NeedToReset = 7;
        int InOneKilogram = 1000;
        int TheFirstOption = 250;
        int TheSecondOption = 500;
        int WeightInGrams = NeedToReset * InOneKilogram;
        int DaysInTheFirstCase = WeightInGrams / TheFirstOption;
        System.out.println("за " + DaysInTheFirstCase + " дней похудеет спортсмен в первом случае!" );
        int DaysInTheSecondCase = WeightInGrams / TheSecondOption;
        System.out.println("за " + DaysInTheSecondCase + " дней похудеет спортсмен во втором случае!" );
        int DaysOnAverage = (DaysInTheFirstCase + DaysInTheSecondCase) / 2;
        System.out.println("за " + DaysOnAverage + " день в среднем похудеет спортсмен!" );


        int Masha = 67760;
        int Denis = 83690;
        int Christina = 76230;
        byte InterestIncrease = 10;
        int SalaryAsAPercentage = 100;
        byte MonthsPerYear = 12;
        int MashaPromotion = (Masha / SalaryAsAPercentage) * InterestIncrease;
        int MashaFutureSalary = Masha +  MashaPromotion;
        int WasMashaAnnualIncome = Masha * MonthsPerYear;
        int MashaAnnualIncomeHasBecome = MashaFutureSalary * MonthsPerYear;
        int TheDifferenceInMashaAnnualIncome = MashaAnnualIncomeHasBecome - WasMashaAnnualIncome;
        System.out.println("Маша теперь получает " + MashaFutureSalary + " рублей. Годовой доход вырос на " + TheDifferenceInMashaAnnualIncome + " рублей!");

        int DenisPromotion = (Denis / SalaryAsAPercentage) * InterestIncrease;
        int DenisFutureSalary = Denis + DenisPromotion;
        int WasDenisAnnualIncome = Denis * MonthsPerYear;
        int DenisAnnualIncomeHasBecome = DenisFutureSalary * MonthsPerYear;
        int TheDifferenceInDenisAnnualIncome = DenisAnnualIncomeHasBecome - WasDenisAnnualIncome;
        System.out.println("Денис теперь получает " + DenisFutureSalary + " рублей. Годовой доход вырос на " + TheDifferenceInDenisAnnualIncome + " рублей!");

        int ChristinaPromotion = (Christina / SalaryAsAPercentage) * InterestIncrease;
        int ChristinaFutureSalary =Christina +  ChristinaPromotion;
        int WasChristinaAnnualIncome = Christina * MonthsPerYear;
        int ChristinaAnnualIncomeHasBecome = ChristinaFutureSalary * MonthsPerYear;
        int TheDifferenceInChristinaAnnualIncome = ChristinaAnnualIncomeHasBecome - WasChristinaAnnualIncome;
        System.out.println("Кристина теперь получает " + ChristinaFutureSalary + " рублей. Годовой доход вырос на " + TheDifferenceInChristinaAnnualIncome + " рублей!");


    }
}