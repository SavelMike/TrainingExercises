package Training;

public class AddressTest {
    public static void main(String[] args) {
        Address adr1 = new Address(34, "Laboratornaya", 2, "Dnepropetrovsk", "Ukraine", 49200);
        adr1.print();
        Address adr2 = new Address(44, "Oosterstraat", "Enschede", "Netherlands", 49199);
        boolean comesBeforeResult = adr1.comesBefore(adr2);
        System.out.println(comesBeforeResult);
    }

}
