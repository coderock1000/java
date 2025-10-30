import java.util.*;

class Main {
public static void main(String[] args) {
int sum=0;
String result;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of Subjects: ");
int noOfSubjects = sc.nextInt();
int marks[]=new int[noOfSubjects]; 
System.out.println("Enter the marks of " + noOfSubjects + " Subjects.Press Enter to give marks for another subject");

for(int i=0; i<noOfSubjects;i++){
marks[i]=sc.nextInt();
}
for(int j=0; j<noOfSubjects;j++){
sum=sum+marks[j];
}
int percentage=sum/noOfSubjects;
System.out.println("Your percentage is: " + percentage + "%");
if(percentage>=90){
result="A+";
}
else if(percentage>=80){
result="A";
}
else if(percentage>=70){
result="B+";
}
else if(percentage>=60){
result="B";
}
else if(percentage>=50){
result="C";
}
else{
result="F";
}
System.out.println("Your grade is: " + result);
}
}
