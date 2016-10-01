
public class Student {
   private String name;
   private String DOB;
   private int age;

   public Student(String name, String DOB, int age){
       this.name = name;
       this.DOB = DOB;
       this.age = age;
   }
  
   public String getName(){
       return name;
   }
   
   public String getDOB(){
       return DOB;
   }
   
   public int getAge(){
       return age;
   }
   
   public String getusername(){
       return name+DOB;
   }
   
   public static void main(String[] args){
       
   }
}
