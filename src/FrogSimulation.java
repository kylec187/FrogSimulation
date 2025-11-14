public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }
    private int hopDistance() {

    }
    public boolean simulate() {
        return hopDistance() >= goalDistance;
    }
    public double runSimulations(int num) {

    }
}
