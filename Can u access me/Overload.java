class student {
    int id;
    String name;
    float stipend;

    student(){}

    student(int id, String name){
        this.id = id;
        this.name = name;
        
    }
    student(int id, String name, float stipend){
        this.id = id;
        this.name = name;
        this.stipend = stipend;
    }

    void dislayDetails(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Stipend: " + stipend);
    }

    class Main{
        public static void main(String[] args) {
            student s1 = new student();
            student s2 = new student(101, "Alice");
            student s3 = new student(102, "Bob", 1500.50f);

            s1.dislayDetails();
            System.out.println();
            s2.dislayDetails();
            System.out.println();
            s3.dislayDetails();
        }
}
}
