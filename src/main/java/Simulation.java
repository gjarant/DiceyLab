import java.util.TreeMap;

public class Simulation {

    public String simulation(Bins bins, Integer numberOfRolls){

        String printSimulationResults="***\nSimulation of "+bins.getNumOfDice()+" dice tossed for "+numberOfRolls+" times.\n***\n";

        for (int i = 2; i<= bins.getNumOfKeys(); i++){

            String keyValue=String.format("%2d", i);
            String numberOfEachValue= String.format("%10d", bins.countTotals.get(i));
            String percentOfTotal=String.format("%.2f", (bins.countTotals.get(i).floatValue()/numberOfRolls.floatValue()));
            int numberofStars= (int)Math.floor((bins.countTotals.get(i).floatValue()/numberOfRolls.floatValue() *100));
            String starString= printStars(numberofStars);
            printSimulationResults+=keyValue+" :"+numberOfEachValue+": "+percentOfTotal+" "+starString +"\n";
        }
        return printSimulationResults.trim();
    }

    public String printStars(int numberOfStars){
        String starString="";
        for(int i=0;i<numberOfStars;i++){
            starString+="*";
        }
        return starString;
    }

}
