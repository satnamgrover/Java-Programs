class cal{
    double area;
    public double getarea(){
        return area;
    }
}
class scalene extends cal{
    public scalene(double a, double b, double c)
    {
        double s = (a+b+c)/2;
        area = Math.sqrt(s* (s-a) * (s-b) * (s-c));
    }
}
class isosceles extends cal{
    public isosceles(double base, double eqalside)
    {
        area = (base / 4) * Math.sqrt((4*eqalside*eqalside) -(base*base));
    }
    public isosceles(double base, double hight, boolean ishight)
    {
        if (ishight)
        {
            area = (base * hight) / 2;
        }
    }
}
class equilateral extends cal{
    public equilateral(double side)
    {
        area = (Math.sqrt(3) /4) *side *side;
    }
}
public class triangle {
    public static void main(String[] args) {
        scalene temp = new scalene(3,4,5);
        System.out.println("area of scalene triangle is : " + temp.getarea());

        isosceles temp1 = new isosceles(4,5);
        System.out.println("area of isoceles traingle is : " + temp1.getarea());
        
        //creating an isosceles traingle using (base and hight)
        isosceles obj = new isosceles(4,5,true );
        System.out.println("area of isosceles traingle is : " + obj.getarea());

        equilateral obj1 = new equilateral(6);
        System.out.println("area of equilateral traingle is : " + obj1.getarea());
    }
}

