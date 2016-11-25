package Training;

public class AddressTest {
    public static void main(String[] args) {
        Address add = new Address(34, "Laboratornaya", 2, "Dnepropetrovsk", "Ukraine", 49200);
        add.print();
        Address ad2 = new Address(44, "Oosterstraat", "Enschede", "Netherlands", 49199);
        boolean streetData = add.comesBefore(ad2);
        System.out.println(streetData);

    }

}
