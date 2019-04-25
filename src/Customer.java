import static java.lang.System.out;

public class Customer {

    String Name;
    int id;

    public Customer() {
        out.println( "Constructor called");
    }

    public void setName(String name) {
        Name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public int getId() {
        return id;
    }
}
