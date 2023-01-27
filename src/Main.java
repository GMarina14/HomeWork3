public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1()
    {
        System.out.println("Task #1");
        int first=2000547;
        System.out.println("Int variable value equals "+first);
        byte second=125;
        System.out.println("Byte  variable value equals "+second);
        short third=30737;
        System.out.println("Short  variable value equals "+third);
        long fourth=50879475638L;
        System.out.println("Long  variable value equals "+fourth);
        float fifth=5.42f;
        System.out.println("Float  variable value equals "+fifth);
        double sixth=3.14159265;
        System.out.println("Double  variable value equals "+sixth);
    }
    public static void task2()
    {
        System.out.println("Task #2");
        float var1=27.12f;
        long var2=987_678_965_549L;
        double var3=2.786;
        char var4=569;
        short var5=-159;
        int var6=27897;
        byte var7=67;
    }
    public static void task3()
    {
        System.out.println("Task #3");
        byte firstClass=23;
        byte secondClass=27;
        byte thirdClass=30;
        byte totalPupil=(byte)(firstClass+secondClass+thirdClass);
        short paper=480;
        short sheetsPerKid=(short)(paper/totalPupil);
        System.out.println("Every kid gets "+sheetsPerKid+" sheets of paper");

    }
    public static void task4()
    {
        System.out.println("Task #4");
        byte bottles=16;
        byte minutes=2;
        byte productivityPerMinute=(byte)(bottles/minutes);
        byte minutesInHour=60;
        byte hoursInDay=24;
        byte daysInMonth=30;

        short productivityPer20Min=(short)(productivityPerMinute*20);
        System.out.println("The machine produced "+productivityPer20Min+" bottles in 20 minutes");

        short productivityPerDay=(short) (productivityPerMinute*minutesInHour*hoursInDay);
        System.out.println("The machine produced "+productivityPerDay+" bottles in one day");

        int productivityPer3Days=productivityPerDay*3;
        System.out.println("The machine produced "+productivityPer3Days+" bottles in 3 days");

        int productivityPerMonth=productivityPerDay*daysInMonth;
        System.out.println("The machine produced "+productivityPerMonth+" bottles in a month");
    }
    public static void task5()
    {
        System.out.println("Task #5");
        byte totalPaint=120;
        byte whitePaintPerClass=2;
        byte brownPaintPerClass=4;

        byte classrooms=(byte)(totalPaint/(whitePaintPerClass+brownPaintPerClass));
        byte whitePaintTotal=(byte)(classrooms*whitePaintPerClass);
        byte brownPaintTotal=(byte)(classrooms*brownPaintPerClass);

        System.out.println("For school with "+ classrooms +" classrooms we need "
                + whitePaintTotal +" cans of white paint and "
                + brownPaintTotal +" cans of brown paint");
    }
    public static void task6()
    {
        System.out.println("Task #6");
        short gramsInKg=1000;

        byte bananas=5;
        byte bananaWeight=80;
        short gramsOfBananas=(short) (bananas*bananaWeight);

        short gramsInMl=105;
        short milk=200;
        short gramsOfMilk=(short)(milk/100*gramsInMl);

        byte iceCream=2;
        byte iceCreamWeight=100;
        short gramsOfIceCream=(short)(iceCream*iceCreamWeight);

        byte eggs=4;
        byte weightOfEgg=70;
        short gramsOfEggs=(short)(eggs*weightOfEgg);

        float totalGrams=gramsOfBananas+gramsOfMilk+gramsOfIceCream+gramsOfEggs;
        float totalKg= totalGrams/gramsInKg;

        System.out.println("The total weight of the breakfast is "+ totalGrams
                +" in grams or "+totalKg+" in kilograms");

    }
    public static void task7()
    {
        System.out.println("Task #7");
        short gramsInKg=1000;
        byte kgToLose=7;
        short totalWeight=(short)(kgToLose*gramsInKg);
        short minWeightPerDay=250;
        short maxWeightPerDay=500;

        short daysMaxToLose=(short)(totalWeight/minWeightPerDay);
        short daysMinToLose=(short)(totalWeight/maxWeightPerDay);

        double averageWeight=(minWeightPerDay+maxWeightPerDay)/2D;
        float daysMidToLose=(float)(totalWeight/averageWeight);

        System.out.println("Fastest we lose the weight is in " + daysMinToLose +" days."
                + " And " + daysMaxToLose+" days if we lose weight slowly. On average "
                +  daysMidToLose +" days required to lose 7 kg.");
    }
    public static void task8()
    {
        System.out.println("Task #8");
        byte monthsInYear=12;
        float raisePerYear =0.10f;

        int salaryMasha=67760;
        int salaryDenis=83690;
        int salaryKristina=76230;

        float newSalaryMasha=salaryMasha+salaryMasha*raisePerYear;
        float annualGainMasha=salaryMasha*raisePerYear*monthsInYear;
        System.out.println("Masha's new salary is "+ newSalaryMasha
                +" rub. Annual income increase is " + annualGainMasha+" rub.");

        float newSalaryDenis=salaryDenis+salaryDenis*raisePerYear;
        float annualGainDenis=salaryDenis*raisePerYear*monthsInYear;
        System.out.println("Denis' new salary is "+ newSalaryDenis
                +" rub. Annual income increase is " + annualGainDenis+" rub.");

        float newSalaryKristina=salaryKristina+salaryKristina*raisePerYear;
        float annualGainKristina=salaryKristina*raisePerYear*monthsInYear;

        System.out.println("Kristina's new salary is "+ newSalaryKristina
                +" rub. Annual income increase is " + annualGainKristina+" rub.");
    }
}

