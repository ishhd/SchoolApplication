/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolapplication;

import java.io.*;
import java.util.*;

/**
 * @author HT
 * @version 4.0z Build 7000 April 24, 1973. 
 */
public class SchoolApplication {
     static  int counter = 0;
    public static void main(String[] args)throws UnsupportedEncodingException, FileNotFoundException { {
        PrintWriter writer = new PrintWriter("ElementrySchool.txt");
        Scanner input=new Scanner(System.in);
        Scanner scan=new Scanner(System.in);
        School s = new School();
        writer.println("Welcome to "+s.getName());
        System.out.println("__________________________"+s.getName()+"___________________________");
        System.out.println("\n                                Welcome to you\n");
        int choice1=-1;
        boolean continueInput=true;
        Students s1= new Students();
        Teachers t = new Teachers();
        while(continueInput){
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("> Enter 1 if you ara a student.");
        System.out.println("> Enter 2 if you ara a teacher.");
        System.out.println("> Enter 3 if you want to regist as a new student.");
        System.out.println("> Enter 4 if you are looking for a job.");
        System.out.println("-------------------------------------------------------------------------------");
        try{
        System.out.print("Enter your choice : ");
        choice1 = input.nextInt();
        }catch(InputMismatchException e){
        System.out.print("Wrong choice , Please choose again from this choices : ");
         choice1= Integer.parseInt(scan.nextLine());
           }
        switch (choice1){
            case 1: continueInput=false;counter++;writer.println(counter+"- You are a student ,so you enter #1");s1= new Students(null,0);break;
            case 2: continueInput=false;counter++;writer.println(counter+"- You are a teacher ,so you enter #2");t = new Teachers(0);break;
            case 3: continueInput=false;counter++;writer.println(counter+"- You are a new student ,so you enter #3");NewStudent();break;
            case 4: continueInput=false;counter++;writer.println(counter+"- You want a new job ,so you enter #4");getJob();break;
            default:continueInput=true;writer.println(counter+"- oh you choose a wrong choice");System.out.println("Wrong choice , Please choose again from this choices ");
        }   
    }
        int choice2=0;
        while(true){
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("> Enter 1 if you want to see your schedule.");
        System.out.println("> Enter 2 to get the menu of Almanarat's cafeteria.");
        System.out.println("> Enter 3 to get to Almanarat's library.");
        System.out.println("> Enter 4 to know our rules.");
        System.out.println("> Enter 5 if you need help.");
        System.out.println("> Enter 6 if you want to exit.");
        System.out.println("-------------------------------------------------------------------------------");
        try{
        System.out.print("Enter your choice : ");
        choice2 = scan.nextInt();
        }catch(InputMismatchException e){
        System.out.print("Wrong choice , Please choose again from this choices : ");
         choice2= Integer.parseInt(input.nextLine());
           }
        switch(choice2){
            case 1:Course(s1.getGrade(),t.getSpecialty());counter++;writer.println(counter+"- You want to see your schedule #1");break;
            case 2:Cafeteria();counter++;writer.println(counter+"- You want to see our menu #2 ");break;
            case 3:Library();counter++;writer.println(counter+"- You want to see our book #3 ");break;
            case 4:Rules();counter++;writer.println(counter+"- You want to see our rules #4 ");break;
            case 5:help();counter++;writer.println(counter+"- You want help #5 ");break;
            case 6:System.out.println("---------------------------Thank you for visiting us---------------------------\n\t\t\t\t\t\t\t"+
                    "You used "+counter+" opration");writer.println(counter+"- You just exit the system ");writer.close();System.exit(0);
            default:writer.println(counter+"- oh you choose a wrong choice");System.out.println("Wrong choice , Please choose again from this choices ");
        
        }
    }
    }
    }
    /**
     * This is method represent Rules of the School 
     */
    public static void Rules(){
        Manager m = new Manager();
        Rules r = new Rules();
        School s = new School(m,r);
        System.out.println(s);
    }
    /**
     * This is method Displays the course of the Teachers and Students
     * @param grade
     * @param sp 
     */
    public static void Course(int grade,int sp){
    
    Course c = new Course();
    Course o = new Course();
    if (grade==1){
        System.out.println("\n\t You are studying :\n\t\t"+c.getCourseGrade1());
        System.out.println("\tYou are allowed to accsses Biology lab ,Chimestry lab and Computer lab.");
    }
    else if (grade==2){
        System.out.println("\n\t You are studying :\n\t\t"+c.getCourseGrade2());
        System.out.println("\tYou are allowed to accsses Biology lab and Chimestry lab.");
    }
    else if (grade==3){
        System.out.println("\n\t You are studying :\n\t\t"+c.getCourseGrade3());
        System.out.println("\tYou are allowed to accsses Chimestry lab and Computer lab.");
    }
    else if(sp==1){
        Course course=new Course("Math","101");
        Course course2=new Course("Math","102");
        Course course3=new Course("Stat","111");
      System.out.println("These courses should be studied every week :- "+course+course2+course3+"\n") ;
    } 
    else if(sp==2)
            System.out.println("Must teach the : "+ o.Biology());
    
    else if(sp==3)
            System.out.println("Must teach the"+o.Computer());
    else if (sp==4){
            Course co1=new Course("generalChemistry ","201");
            Course co2=new Course("organic chemistryv","332");
            Course co3=new Course("Biochemistry","143");
            System.out.println("These courses should be studied every week :- \n"+co1.toString()+co2.toString()+co3.toString()+"\n") ;
    } 
    else if (sp==5)
                System.out.println("Must teach the"+o.Islamic());
    else if(sp==6)
                System.out.println("must teach the"+o.Physics());
    else if(sp==7){
       Course co1=new Course("basics of design ","211");
       Course co2=new Course("Decorative design","222");
       Course co3=new Course("photographer","212");
        System.out.println("These courses should be studied every week :- \n"+co1.toString()+co2.toString()+co3.toString()+"\n") ;
    }
    else 
        System.out.println(c.getNewCourse());
    }
    /*
    * This is method us to register new students
    */
    public static void NewStudent (){
        
        NewStudents n = new NewStudents();
        n.HowToRegist();
        System.out.println("\n\tOk done , we will call you as soon as possible");
}
    /*
    * This is method us to Get a new job
    */
    public static void getJob(){
        Job j = new Job();
        j.HowToRegist();
    }
    /*
    *This method if you want to ask for help or inquire about something
    */
    
    public static void help (){
    System.out.println("Just choose from this choices (1-5) or exit the program by entering number 6 ");
}
    /*
    *This is method to show the menu of cateteria.
    */
    public static void Cafeteria(){
        Cafeteria f = new Cafeteria();
        System.out.println(f);
        f.setCafeteria("");
    }
    /*
    *This is method if you want to buy or borrow book from the library
    */
    public static void Library(){
        Scanner input = new Scanner(System.in);
        Library l =new Library();
        System.out.println(l);
        System.out.print("\tDo you have any Suggestions you want to add it to the library ? \n\tPlease write it (Book name , Author name): ");
        String name=input.next();
        String author=input.next();
        l.setBook(new Book(name,author));
    }
    
}
/*
 *This is class rpresent the information about our School 
 * @author HT
 * @see Person
 * @see Rules
 * @see Course
 * @see Cafeteria 
 * @see Library
*/

class School {
   
    private Manager manager ;
    private String name;
    private Rules rules ;
/*
    * constuctor School to giva the data field initial values
    */
    public School() {
    }
    /*
    *  Constructor School to give the data field real values.
     * @param manager
     * @param rules 
    */

    public School(Manager manager, Rules rules) {
        
        this.manager = manager;
        this.rules = rules;
    }
    /*
     * Returns the names of the School.
     * @return a String containig a School.
    */
    
    public String getName() {
        name="AlManarat highschool";
        return name;
    }
/*
    *This method return all data fields of manager
    *@return object manager containig a all info about the manager.
    
    */
    public Manager getManager() {
        return manager;
    }
    /*
     *This method return all data fields of rules
    *@return object rules  containig a all rules of the School
    */
    

    public Rules getRules() {
        return rules;
    }
    /*
    * This method to return the contains data fields
    * returns String containing Name and rules and Manager
    */
    
    
    @Override
    public String toString() {
        return  "This is "+getName()+" Rules\n\n"+getRules()+"\n\nWritten by "+getManager();
    }
}
/*
*this is class To give a person's specifications
*@author HT
*/

class Person{
    private String name;
    private int age;
    /*
    *constuctor no arg Person to giva the data field initial values
    */
    

    public Person() {
    }
/*
     * constuctor two arg Person to giva the data field real values
     * @param name
     * @param age
    */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        
    }
    /*
    * the method returns the name of the person 
     * @return a String containig a Person.
    */

    public String getName() {
        return name;
    }
    /*
    * Sets the name of the person
    * @param name 
    */

    public void setName(String name) {
        this.name = name;
    }
    /*
    * Sets the age for this Person 
     *@param age 
    */

    public void setAge(int age) {
        this.age = age;
    }
    /**
     * This class repersent the students in the School
 * @author HT
     */

 }
class Students extends Person{
    private String ID;
    private int grade ;
    
/*
    *constuctor no arg Students to giva the data field initial values
    */
    public Students() {
    }
    /*
    * constuctor two arg Students to giva the data field real values
     * @param ID every Students in the School have ID
     * @param grade must Students hava a grade
    */
    public Students(String ID, int grade) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name ,ID and your grade:");
        System.out.print("Name : ");
        super.setName(input.next()); 
        System.out.print("ID : ");
        ID = input.next();
        while(true){
            try{
        System.out.print("Grade <as a number> : ");
        grade = input.nextInt();
            }catch(InputMismatchException s){
                System.out.print("<as a number please> : ");
               grade = Integer.parseInt(input.nextLine());
            }
        if (grade==1||grade==2||grade==3)
            break;
        else
            System.out.println("There is no "+grade+"th grade in our school please try again.");
        }
        this.ID = ID;
        this.grade = grade;
        
    }
    /*
     * the method returns the Grades of the Student 
     * @return a int containig a grade.
    */
     

    public int getGrade() {
        return grade;
    }
    /*
    * Sets the Grade for this Student 
     * @param grade 
    */

    public void setGrade(int grade) {
        this.grade = grade;
    }
    /*
       * Sets the ID of this Student 
     * @param ID 
    */
    
    public void setID(String ID) {
        this.ID = ID;
    }
  
}
/*
 * This class represent Teachers in the School 
 * @author HT
*/
class Teachers extends Person{
   
private int specialty;
/*
*constuctor no arg Teachers to giva the data field initial values
*/
    public Teachers() {
      
    }
    /*
    *  constuctor one arg Teachers to giva the data field real values
     * @param specialty 
    */

    public Teachers(int specialty)  {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name=input.next();
        super.setName(name);
        int age=0;
        try{
        System.out.print("Enter your age : ");
        age=input.nextInt();
        }catch(InputMismatchException j){
            System.out.print("<as a number please> : ");
               age = Integer.parseInt(input.nextLine());
        }
        
        super.setAge(age);
        if(age<=60){
            System.out.println("***** You can teach *****");
        }
        else{
           System.out.println("***** "+age+" ,You reached retirment age *****");   
        }
        System.out.println("Choose 1 if your specialty is Math:");
            System.out.println("Choose 2 if your specialty is Biology:");
            System.out.println("Choose 3 if your specialty is Computer:");
            System.out.println("Choose 4 if your specialty is Chimestry:");
            System.out.println("Choose 5 if your specialty is Islamic:");
            System.out.println("Choose 6 if your specialty is Physics:");
            System.out.println("Choose 7 if your specialty is Art:");
            try {
            System.out.print("> Enter your specialty : ");
            specialty=input.nextInt();
            }catch(InputMismatchException e){
               System.out.print("Wrong choice , Please choose again from this choices : ");
               specialty = Integer.parseInt(input.nextLine());
            }
            this.specialty=specialty;
            
    
    }
    /*
    * the method returns the specialty of the Teacher 
    * @return a int containig a Specialty.
    */

    public int getSpecialty() {
        return specialty;
    }
    

}
/*
 * this class represent the manager of the school 
 * @author HT
*/
class Manager extends Person{
    private long phoneNo;
    private int yearsNum;
    /*
     * constuctor no arg Teachers to giva the data field initial values 
    */

    public Manager() {
        setName("Abeer AlShareef");
        yearsNum=11;
        phoneNo =0555321355;
    }
    /*
    * this method returns the phone number of the manger 
     * @return a long containig a phone number.
    */
    public long getPhoneNo() {
        return phoneNo;
    }
    /*
    * this method returns a years number of the manger 
     * @return a int containig a Years number.
    */

    public int getYearsNum() {
        return yearsNum;
    }
    /*
     * This method  returns the contains of data fields
     * @return  a String containig a Name and phone number and years num 
    */
@Override
    public String toString() {
        return "\n\tManager : " +getName()+ ", Phone Number " + phoneNo + "\n\t\tYears of experience :" + yearsNum + " years";
    }
    
}
/*
* This class displays the rules of the School
 * @author HT
*/
class Rules{
    ArrayList<String>rules=new ArrayList<String>();
/*
    *constuctor no arg Rules to giva the data field initial values 
    */
    public Rules() {
        rules.add("1- Attend the school in uniform\n");
        rules.add("2- Commitment to calm and public order\n");
        rules.add("3- Respect for classroom rules\n");
        rules.add("4- Stand regularly when you buy.\n");
        rules.add("5- Respect all school staff of teachers\n");
        rules.add("6- No Absence without excuse\n");
        
    }
    /*
     * this method retun A number of rules and conditions
     * @return array String rules of the School
    */
    public ArrayList<String> getRules() {
        return rules;
    }
    /*
     * This method  returns the contains of data fields
     * @return  a String containig a rules
    */

    public String toString() {
        return getRules()+"";
    }

}
/*
 * this class represnt the course of the Teachers and Students
 * @author HT
*/
class Course{
    private String courseName;
    private String courseID;
    /*
    *constuctor no arg Course to giva the data field initial values 
    */

    public Course() {
    }
    /*
     * constuctor two arg course to giva the data field initial values 
     * @param courseName
     * @param courseID 
    */

    public Course(String courseName, String courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
    }
    /*
      * this method returns a Course name  of the Teachers and Students 
     * @return a String containig a Course name
    */

    public String getCourseName() {
        return courseName;
    }
    /*
     * Sets the Cours name of this Students and Teachers
     * @param courseName
    */

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    /*
      *  this method returns a Course ID  of the Teachers and Students 
     * @return a String containig a Course ID
    */

    public String getCourseID() {
        return courseID;
    }
    /*
     * Sets the Cours ID of this Students and Teachers
     * @param courseID 
    */

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }
    /*
     * this method return the material of physics specialty of the teachers 
     * @return the physics specialty
    */
     public ArrayList<String>Physics(){
         ArrayList<String>phys=new ArrayList<String>();
        phys.add("General Physics");
        phys.add("Nuclear physics");
        phys.add("Theoretical physics");
        phys.add("Electrical dynamics");
        return phys;
     }
     /*
       *  this method return the material of Islamic specialty of the teachers 
     * @return the Islamic specialty
     */
    public ArrayList<String>Islamic(){
         ArrayList<String>islam=new ArrayList<String>();
        islam.add("Islamic Creed");
        islam.add("Islamic law");
        islam.add("Recitation and recitation");
        islam.add("Islamic Fiqh");
      
           
        return islam;
     
     }
    /*
     *  this method return the material of computer specialty of the teachers 
     * @return the computer specialty
    */
    
    public ArrayList<String>Computer(){
         ArrayList<String>comp=new ArrayList<String>();
        comp.add("Java Language");
        comp.add("Algorithms");
        comp.add("Operating Systems");
        comp.add("Compilers");
        return comp;
     }
    /*
         *  this method return the material of Biology specialty of the teachers 
     * @return the Biology specialty
    */

     public ArrayList<String>Biology(){
         ArrayList<String>Bio=new ArrayList<String>();
        Bio.add("Biology");
        Bio.add("heredity");
        Bio.add("Cell biology");
        Bio.add("Ecology");
        return Bio;
     
     }
     /*
           * this method return the materals of the grade 1 Students
      * @return grade 1 Students
     */
    public ArrayList<String> getCourseGrade1(){
        ArrayList<String> grade1= new ArrayList<String>();
        grade1.add("Math");
        grade1.add("Biology");
        grade1.add("Chimestry");
        grade1.add("Islamic");
        grade1.add("Computer");
        return grade1;
    }
    /*
          * this method return the materals of the grade 2 Students
      * @return grade 2 Students
    */
    public ArrayList<String> getCourseGrade2(){
        ArrayList<String> grade2= new ArrayList<String>();
        grade2.add("Math");
        grade2.add("Biology");
        grade2.add("Chimestry");
        grade2.add("Islamic");
        grade2.add("Physics");
        return grade2;
    }
    /*
          * this method return the materals of the grade 3 Students
      * @return grade 3 Students
    */
    public ArrayList<String> getCourseGrade3(){
        ArrayList<String> grade3= new ArrayList<String>();
        grade3.add("Math");
        grade3.add("Art");
        grade3.add("Chimestry");
        grade3.add("Islamic");
        grade3.add("Computer");
        return grade3;
    }
    /*
         * this method  if Student and teacher has a New course returns New course 
     * @return a String containig a new Course
    */
    public String getNewCourse(){
        return "It didn't exist yet";
    }
/*
     * This method  returns the contains of data fields
      * @return  a String containig a Course Name and Course ID 
    */
    @Override
    public String toString() {
        return "\n"+ courseName + " " + courseID ;
    }
    
}
/*
 * this class displat the menu in the cafeteria
 * @author HT
*/

class Cafeteria{
    ArrayList <String> menu = new ArrayList <String>();
/*
    *  constuctor no arg course to giva the data field initial values  
    */
    public Cafeteria() {
    }
    /*
    *  constuctor one arg course to giva the data field real values 
    */
       
    public Cafeteria(ArrayList <String> menu) {
        this.menu = menu;
    }
    /*
     *  this method returns a menu  of the cafeteria in the School
     * @return a List String containig a menu of Cafeteria
    */

    public ArrayList<String> getCafeteria() {
        menu.add("Cheese Sandwich");
        menu.add("Clip Sandwich");
        menu.add("Croissant");
        menu.add("Peanut Butter Toast");
        menu.add("Fruit Salad");
        menu.add("Vegetables Salad");
        menu.add("Juices");
        return menu;
    }
    /*
         * Sets the menu of the Cafeteria in the School
     * @param menu 
    */

    public void setCafeteria(String menu) {
        Scanner scan = new Scanner (System.in);
        System.out.print("\tDo you have any Suggestions you want to add it to the menu ? Please write it : ");
        String suggestion = scan.nextLine();
        this.menu.add(suggestion);
        
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("------------------------------ Successfully done ------------------------------");
    }
    /*
     * This method  returns the contains of data fields
     * @return  a String containig a menu of the Cafeteria
    */

    @Override
    public String toString() {
        return "\n\t*Everyday the best chifs make this menu : \n\t\t"+getCafeteria();
    }
}
/*
 * this class represent the library in the School
 * @author HT
*/
class Library {
    ArrayList <Book> book = new ArrayList <Book>();
/*
    *  constuctor no arg course to giva the data field initial values 
    */
    public Library() {
        
    }
    /*
         *  constuctor one arg course to giva the data field real values 
     * @param book a number of books
    */
    public Library(ArrayList <String> book) {
    }
    /*
     * this method display the Books in the library can Student buy it
     * @return a list books 
    */

    public ArrayList<Book> getBook() {
        book.add(new Book("Meditations","Marcus Aurelius"));
        book.add(new Book("A Brief History of Time","Stephen Hawking"));
        book.add(new Book("This is Water","David Foster Wallace"));
        book.add(new Book("Manual for Living","Epictetus"));
        book.add(new Book("When Breath Becomes Air","Paul Kalanithi"));
        book.add(new Book("Fooled by Randomness","Nassim Nicholas Taleb"));
        book.add(new Book("Breakthrough Advertising","Eugene Schwartz"));
        return book;
    }
    /*
         * Sets the Book for the Student 
     * @param book 
    */

    public void setBook(Book book) {
        this.book.add(book);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("------------------------------ Successfully done ------------------------------");
    }
    /*
         * This method  returns the contains of data fields
     *@return  a String containig a books in the library
    */

    @Override
    public String toString() {
        return "These are the cammon books we have : " +getBook() ;
    }
    
    
}
/*
 * this class display the books in the libary
 * @author HT
*/
class Book{
    String name;
    String author;
    /*
     *   constuctor no arg course to give the data field initial values 
    */

    public Book() {
    }
    /*
     *   constuctor two arg course to giva the data field real values 
 * @param name
 * @param author
    */

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    /*
     * This method  returns the contains of data fields
 * @return  a String containig a name and author of the book
    */

    @Override
    public String toString() {
        int i = 1;
        return "\n\t"+(i++)+"-"+ name+" by :"+ author;
    }
    
}
/*
 * This class Show you how to register at school
 * @author HT
*/

interface Registration{
    void HowToRegist ();
}
/*
 *This class show you how to get a job 
 * @author HT
*/

class Job implements Registration{
Person person;
/*
  * this method show you registration method and If you accept what you become.
*/
    
    public void HowToRegist() {
        Scanner input=new Scanner(System.in);
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = input.next(); 
        
        System.out.println("> Press 1 if your Degree is prof.");
        System.out.println("> Press 2 if your Degree is Ph.D.");
        System.out.println("> Press 3 if your Degree is Masters.");
        System.out.println("> Press 4 if your Degree is BA.");
        int Degree=0;
        while(true){
            try{
        System.out.print("Ente your degree :");
          Degree=input.nextInt();
          break;
        }catch(InputMismatchException e){
        System.out.print("Wrong choice , Please choose again from this choices : ");
         Degree= Integer.parseInt(scan.nextLine());
           }
        System.out.print("In which university you got it:");
            String place=scan.nextLine();
        if(Degree==1){
            System.out.println("You will be a head of department");
            break;
        }  else if(Degree==2){
            System.out.println("You will be a Section Supervisor");
            break;
        }else if (Degree==3){
            System.out.println("You will be a Head of teachers");
            break;
        }else if(Degree==4){
            System.out.println("You will be a teacher");
            break;
        } else 
            System.out.println("Wrong choice please try again");
        }
    System.out.println("We will call you as soon as possible");
    }
}
/*
 * this class If you are a student and want to register or want to enroll your son in school
 * @author HT
*/
class NewStudents extends Students implements Registration{
    public void HowToRegist() {
       Scanner input=new Scanner(System.in);
        System.out.println("Enter your name ,ID :");
        System.out.print("Name : ");
        super.setName(input.next()); 
        System.out.print("ID : ");
        super.setID(input.next());
    }
}
    
    

