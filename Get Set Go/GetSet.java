class student {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class GetSet {
    public static void main(String[] args){
        student s = new student();
        s.setName("John");
        System.out.println(s.getName());
    }
}