abstract class figure  {
    double lenght,width;
    figure(double lenght,double width)
    {
        this.lenght = lenght;
        this.width = width;
    }
    abstract double area();
    
}

class rectangle extends figure{
    rectangle(double lenght, double width){
        super(lenght, width);
    }
    @Override
    double area(){
        return lenght * width;
    }
}

public class abstact  {
    public static void main(String[] args) {
        rectangle temp = new rectangle(5, 3);
        System.out.println("area of rectangle is : " + temp.area());
    }
}
