package soal1;

public abstract class Shape {
    String Name;
    public Shape(String shapename){
        Name = shapename;
    }
    public abstract double area();
    public String toString(){
        return Name;
    }
}
