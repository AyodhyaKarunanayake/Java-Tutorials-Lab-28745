
package com.mycompany.labquestion02;

public class Triangle implements Shape
{
    private double base,height, sA, sB;
    
    public Triangle(double base, double height, double sA, double sB)
    {
        this.base=base;
        this.height=height;
        this.sA=sA;
        this.sB=sB;
    }
    
    public void setValues(double b, double h, double sA, double sB)
    {
        base=b;
        height=h;
        sideA=sA;
        sideB=sB;
    }
    public double getBase()
    {
        return base;
    }
    public double getHeight()
    {
        return height;
    }
    public double getSideA()
    {
        return sideA;
    }
    public double getSideB()
    {
        return sideB;
    }
         
    public double CalculateArea()
    {
        return 0.5* base * height;
    }
    public double CalculatePerimeter()
    {
        return base + sideA + sideB;
    }
            
}
