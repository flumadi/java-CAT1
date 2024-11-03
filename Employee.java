public class Employee{
    int id;
    String firstname;
    String lastname;
    int salary;
    public Employee (String x, String y, int z, int w){
        firstname = x;
        lastname = y;
        id = z;
        salary = w;
    }
public String getFirstname(){
    return firstname;
}
public String getLastname(){
    return lastname;
}
public int getId(){
    return id;
}
public int getSalary(){
    return salary;
}
public void setFirstname(String newfirstname){
    this.firstname = newfirstname;
   }
   public void setLastname(String newlastname){ 
    this.lastname = newlastname;
   }
   public void setId(int newid){
    this.id = newid;
   }
   public void setSalary(int newsalary){
    this.salary = newsalary;
   }
    public int findAnnual(){
        
        return salary*12;
       }
    public int findRaised(){
        return salary*110/100;
       }
  @Override
   public String toString(){
    return "The Firstname= " + firstname +"\n"  + 
    "The lastname=" + lastname  + "\n" + 
    "The id=" +  id + "\n" +
    "The salary=" + salary + "\n" +
    "The Annualsalary=" + findAnnual() + "\n"+
    "The increased salary=" + findRaised();
   }
    }

