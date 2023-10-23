import java.io.*;
interface Shape
{
      final float pi=3.14f;
      public void area();     
}

class Circle implements Shape
{     int r;
      Circle(int r)
      {
            this.r = r;
      }
      public void area()
      {
            System.out.println("Area of Circle = "+(pi*r*r));
      }
     
}

class Sphere implements Shape
{     int r;
      Sphere(int r)
      {     this.r = r;
      }
      public void area()
      {     System.out.println("Area of  Sphere = "+(4*pi*r*r));
      }
}

class Slip9
{    
      public static void main(String a[]) throws IOException
      {    
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int r;

            System.out.println("Enter radius for Circle =  ");
            r =Integer.parseInt(br.readLine());
           
            Shape s;
            s = new Circle(r);
            s.area();
           
            System.out.println("Enter radius for sphere : ");
            r =Integer.parseInt(br.readLine());
 
            s=new Sphere(r);
            s.area();
           
      }
}