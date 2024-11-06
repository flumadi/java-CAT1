public class TheCustomer {
   int id;
   String name;
   char gender;

    public TheCustomer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "The name=" + name + 
        ", The Id=" + id + 
        ", The Gender='" + gender + "'";
    }
}