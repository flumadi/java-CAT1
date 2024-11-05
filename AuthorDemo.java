public class AuthorDemo{
    public static void main(String[] args) {

Author author1 = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');

System.out.println(author1);
author1.setEmail("paulTan@nowhere.com");
author1.setName("Tan Ah Teck");
author1.setGender('m');
System.out.println("name is: " + author1.getName());
System.out.println("eamil is: " + author1.getEmail());
System.out.println("gender is: " + author1.getGender());
  }
}