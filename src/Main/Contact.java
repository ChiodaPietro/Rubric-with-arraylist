package Main;

public class Contact   {
    private String name;
    private String surname;
    private int phone_number;
    private String address;

    public Contact(String name, String surname, int phone_number, String address){
        this.name=name;
        this.surname=surname;
        this.phone_number=phone_number;
        this.address=address;
    }
    public Contact(String name , String surname, int phone_number){
        this.name=name;
        this.surname=surname;
        this.phone_number=phone_number;
        address="";
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public String getAddress() {
        return address;
    }
    public String toString(){
        return "name: "+name+" surname: "+surname+" number: "+phone_number+" "+address;
    }
}
