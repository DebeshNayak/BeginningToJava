package Oops;

public class Rectangle {
    int width;
    int height;

    void insert(int w, int h){
        width = w;
        height = h;
    }

    void calculateArea(){
        System.out.println(width*height);
    }

}
