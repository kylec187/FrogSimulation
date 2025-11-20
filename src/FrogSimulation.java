public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }
    private int hopDistance() {
        if (Math.random() < 0.67) {
            return (int)(Math.random()*14+1);
        }
        else return (int)-(Math.random()*14+1);
    }
    public boolean simulate() {
        int distance = 0;
        for(int i = 0; i < maxHops; i++) distance += hopDistance();
        return distance >= goalDistance;
    }
    public double runSimulations(int num) {
        double numofTrue = 0;
        for (int i = 0; i < num; i++) {
            if (simulate()) numofTrue += 1;
        }
        return numofTrue / num;
    }
}
