package Lad7;

public class Rectangle {


    //attributes
    private double lendth;
    private double width;

    //constructor คือ เมธอดที่มีชื่อเดียวกันกับชื่อ class
    //defaulf constructor
    public Rectangle(){}

    //design constructor
    public Rectangle (double lendth,double width){
        this.lendth = lendth;
        this.width = width;
    }
    //getter and setter methods
    //getter ใช้อ่านข้อมูลใน attributes ของ class
    //ใช้ปรับปรุงหรือเปลี่ยนแปลงข้อมูลใน attributes ของ class

    public double getLendth(){
        return this.lendth;
    }
    public void setLendth(double lendth){
       this.lendth = lendth;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    //find  area
    public double getArea(){
        return this.lendth * this.width;

    }

}//class
