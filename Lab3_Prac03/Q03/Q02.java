
package com.mycompany.prac03q02;

public class Q02 
{
    private String emName;
    private float basicSalary, bonus;
    
    
    public void setEmpName(String emName)
    {
        this.emName=emName;
    }
    public String getEmName()
    {
        return emName;
    }
    
    public void setBasicSalary(float basicSalary)
    {
        this.basicSalary=basicSalary;
    }
    public float getBasicSalary()
    {
        return basicSalary;
    }
    
    public Q02(float bonus)
    {
        this.bonus=bonus;
    }
    public void display()
    {
        System.out.println("Bonus: "+bonus);
    }
    
    private float bonusAmount;
    public void calBonusAmount()
    {
        bonusAmount=bonus+basicSalary;
        System.out.println("Bonus Amount: "+bonusAmount);
    }
}
