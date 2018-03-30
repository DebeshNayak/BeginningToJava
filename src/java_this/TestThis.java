package java_this;

class Student {
    int rollNo;
    String name;
    float fee;

    Student(int rollNo, String name, float fee){
        this.rollNo = rollNo;
        this.name = name;
        this.fee = fee;
    }

    void display(){
        System.out.println(rollNo + " "+name+" "+fee);
    }
}

class TextThis{
    public static void main(String args[]){
        Student s1 = new Student(111, "ankit", 5000f);
        Student s2 = new Student(111, "ankit", 5000f);

        s1.display();
        s2.display();
    }
}
