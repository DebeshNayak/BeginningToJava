package java_aggregation;

class Address{
    String city, state, country;

    public Address(String city, String state, String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Employee{
    int id;
    String name;
    Address address;

    Employee(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }
}
public class TestAggregation2 {
    public static void main(String[] args) {
        Address address1 = new Address("sbp", "Odisha", "India");
        Address address2 = new Address("bng", "Karnataka", "India");

        Employee e = new Employee(111, "Debesh", address1);
        Employee e1 = new Employee(112, "Satish", address2);

        e.display();
        e1.display();
    }
}
