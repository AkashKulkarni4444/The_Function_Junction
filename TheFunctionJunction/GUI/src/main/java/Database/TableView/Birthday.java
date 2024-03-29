package Database.TableView;

import java.util.concurrent.TimeUnit;

public class Birthday extends Event{
    private int NumberOfGuests;
    private final int [] PricePerPlate = {350,400,300,300,500,450,0};
    private int myChoice;

    public int getNumberOfGuests() {
        return NumberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        NumberOfGuests = numberOfGuests;
    }

    public int[] getPricePerPlate() {
        return PricePerPlate;
    }

    public int getMyChoice() {
        return myChoice;
    }

    public void setMyChoice(int myChoice) {
        this.myChoice = myChoice;
    }
    public double cakecost(){
        return (float)(this.PricePerPlate[this.getMyChoice()]);
    }

    @Override
    public double CalculateCost() {
        long gap=getEndDate().getTime()-getStartDate().getTime();
        double days= TimeUnit.DAYS.convert(gap, TimeUnit.MILLISECONDS)+1;
        return this.cakecost()+days*getVenue().getCost();
    }
}
