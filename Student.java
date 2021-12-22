import java.util.Scanner;
public class Student{
    
    private int id;
    private String name;
    private String school_name;
    private int[] grades=new int[4];
    
    public double calculateAverageGrade(){
        
        double average;
        
            average=(this.grades[0]+this.grades[1]+this.grades[2]+this.grades[3])/4;
            return average;
        
    }
    
    public static void main(String[]args){
        
        Student student1=new Student();
        Student student2=new Student();
        
        Scanner input = new Scanner(System.in);
         
        System.out.println("enter first student info(id - name - school name- 4 grades) one by one");
        
        student1.id=input.nextInt();
        input.nextLine();
        student1.name=input.nextLine();
        student1.school_name=input.nextLine();
        student1.grades[0]=input.nextInt();
        student1.grades[1]=input.nextInt();
        student1.grades[2]=input.nextInt();
        student1.grades[3]=input.nextInt();
        
        System.out.println("id : "+student1.id);
        System.out.println("name : "+student1.name);
        System.out.println("school name : "+student1.school_name);
        System.out.println("grades : "+student1.grades[0]+" - "+student1.grades[1]+" - "+student1.grades[2]+" - "+student1.grades[3]);
        System.out.println("average grade is : "+student1.calculateAverageGrade());
        
       
        	
        System.out.println("enter second student info(id - name - school name- 4 grades) one by one");
        student2.id=input.nextInt();
        input.nextLine();
        student2.name=input.nextLine();
        student2.school_name=input.nextLine();	
        student2.grades[0]=input.nextInt();
        student2.grades[1]=input.nextInt();
        student2.grades[2]=input.nextInt();
        student2.grades[3]=input.nextInt();
        	
        System.out.println("id : "+student2.id);
        System.out.println("name : "+student2.name);
        System.out.println("school name : "+student2.school_name);
        System.out.println("grades : "+student2.grades[0]+" - "+student2.grades[1]+" - "+student2.grades[2]+" - "+student2.grades[3]);
        System.out.println("average grade is : "+student2.calculateAverageGrade());
        
        input.close();
    }
    
}