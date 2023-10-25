
import java.util.ArrayList;


public class Zoo {
    public static void main(String args[]) {
        ArrayList<Animal> zoo = new ArrayList<Animal>(); 
        zoo.add(new Cow());
        zoo.add(new Bird());
        zoo.add(new Bird());
        zoo.add(new Animal());
        zoo.add(new Duck());
        zoo.add(new Eagle());
        generateCacophony(zoo);
    }












































    static void generateCacophony(ArrayList<Animal> zoo) {
        for (int i=0; i<zoo.size(); i++) {
            System.out.println(zoo.get(i).makeNoise());
            System.out.println(zoo.get(i).move(5));
        }
    }
}



















