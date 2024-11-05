public class Author{
    String name;
    String email;
    char gender;
    public Author(String name, String email, char gender){

    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    public void setName(String newname){
         this.name = newname;
    }
    public void setEmail(String newemail){
        this.email = newemail;
    }
    public void setGender(char newgender){
        this.gender = newgender;
    }        
    @Override
     public String toString() {
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}