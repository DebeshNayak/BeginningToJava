package java_this;

// this() used for constructor chaining
class Student1{
    int rollNo;
    String name, course;
    float fee;

    Student1(int rollNo, String name, String course){
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    Student1(int rollNo, String name, float fee){
        this.rollNo = rollNo;
        this.name = name;
        this.fee = fee;
    }

    Student1(int rollNo, String name, String course, float fee){
        // this() must be the first statement in constructor
        this(rollNo, name, course);
        this.fee = fee;
    }

    void display(){
        System.out.println(rollNo+" "+name+" "+course+" "+fee);
    }
}

class TestThis4 {
    public static void main(String args[]){
        Student1 s1 = new Student1(111, "ankit", "java");
        Student1 s2 = new Student1(112, "sumit", "spring", 6000f);

        s1.display();
        s2.display();
    }
}
