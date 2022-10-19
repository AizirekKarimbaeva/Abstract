import animals.Animal;
import animals.Cow;
import animals.Horse;
import animals.Sheep;
import farm.Farm;

public class Main {
    public static void main(String[] args) {
        Cow cow1 = new Cow(55,4,"female","Avrora");
        Cow cow2 = new Cow(47,5,"male","Burenka");
        Cow cow3 = new Cow(80,8,"female","Arisha");
        Cow cow4 = new Cow(33,15,"male","Babet");
        Cow cow5 = new Cow(20,9,"male","Buba");
        Cow cow6 = new Cow(32,10,"male","Varba");
        Sheep sheep1 = new Sheep(45,2,"female","Lor");
        Sheep sheep2 = new Sheep(36,21,"male","Vilen");
        Sheep sheep4 = new Sheep(75,13,"female","Apri");
        Sheep sheep5 = new Sheep(57,12,"male","Rigan");
        Horse horse1 = new Horse(54,6,"female","Spirt");
        Horse horse2 = new Horse(78,11,"female","Pegas");
        Horse horse3 = new Horse(30,18,"male","Pik");
        Farm farm1 = new Farm("Kyrgyzstan","Roma",new Cow[]{cow2,cow3,cow4,cow5,cow6},
             new Sheep[]{sheep2,sheep4,sheep5},
             new Horse[]{horse2,horse3});
     System.out.println(farm1);
     Farm farm2 = new Farm("Switzerland","Dima",new Cow[]{cow1},new Sheep[]{sheep1} ,new Horse[]{horse1});
        System.out.println(farm2);

    }
}