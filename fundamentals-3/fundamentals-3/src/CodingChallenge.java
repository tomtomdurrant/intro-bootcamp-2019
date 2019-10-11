public class CodingChallenge {
    public static void main(String[] args) {
        double variable20 = 20d;
        double variable80 = 80d;
        double answer1 = (variable20 + variable80) * 25;
        double remainder = answer1 % 40;

        if (remainder <= 20){
            System.out.println("Total was over the limit");
        }
    }
}
