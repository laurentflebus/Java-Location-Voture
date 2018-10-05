package locationvoiture;
import mesclasses.*;
public class LocationVoiture {
    public static void main(String[] args) {
        Client c1 = new Client("Flebus", "Laurent", "rue des bois", "54A", 7000, "Mons", "078/09.06.18", "laurentflebus@hotmail.be", "M", "01-02-2017");
        System.out.println(c1.toString());
    }  
}



