public class Main {

    public static void main(String[] args){
        Dice die1 = new Dice(2);

        Bins secondBin = new Bins(13);

        for(int i = 1; i <= 100000; i++){
            secondBin.increment(die1.roll());
        }

        for(int i = 2; i <= 12; i++){
            // System.out.println(i + " : " + secondBin.getNum(i));

            double percentage = secondBin.getNum(i) / 100000.0;

            String output = String.format("%1$2d: %2$10d: ", i , secondBin.getNum(i)) +
                    String.format("%.2f :", percentage);

            System.out.print(output);
            for(int j = 0; j < (percentage*100); j++){
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
