import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class TestSimulation {

    @Test
    public void runSimulationTest() {
        Simulation simulation = new Simulation();
        simulation.run();
    }

    @Test
    public void printResultTest() {
        Simulation simulation = new Simulation(2,1000000);
        simulation.run();
        simulation.printResults();
    }
}