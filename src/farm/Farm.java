package farm;

import animals.Cow;
import animals.Horse;
import animals.Sheep;

import java.util.Arrays;

public class Farm {
    private String address;
    private Cow[] cows;
    private Sheep[] sheeps;
    private Horse[] horses;
    private String OwnerName;

    public Farm(String address,String ownerName,Cow[] cows,Sheep[] sheeps,Horse[] horses) {
        this.address = address;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horses = horses;
        OwnerName = ownerName;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", sheeps=" + Arrays.toString(sheeps) +
                ", horses=" + Arrays.toString(horses) +
                ", OwnerName='" + OwnerName + '\'' +
                '}';
    }
    
}
