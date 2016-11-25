package Training;

public class Address {
    private int houseNum;
    private String streetName;
    private int apartNum;
    private String city;
    private String state;
    private int postCode;


    public Address(int num, String str, int apnum, String ct, String st, int posc) {
        houseNum = num;
        streetName = str;
        apartNum = apnum;
        city = ct;
        state = st;
        postCode = posc;
    }

    public Address(int num, String str, String ct, String st, int posc) {
        houseNum = num;
        streetName = str;
        city = ct;
        state = st;
        postCode = posc;
    }

    public void print() {
        System.out.println(streetName);
        System.out.println(city + "," + state + "," + postCode);
    }

    public boolean comesBefore(Address other) {
        if (postCode < other.postCode) {
            return true;
        } else {
            return false;
        }
    }
}
