public class Spinner {
    private int sections;
    private int numSpun;
    private int timesSpun;
    private int sumOfNum;

    public Spinner(int sections) {
        this.sections = sections;

        timesSpun = 0;
        sumOfNum = 0;
    }

    public void spin() {
        int randNum = (int) (Math.random() * sections) + 1;

        numSpun = randNum;
        timesSpun++;
        sumOfNum += randNum;
    }

    public int returnNum() {
        return numSpun;
    }

    public double calcAverageSpin() {
        double avg = sumOfNum / (double) timesSpun;
        return avg;
    }
}
