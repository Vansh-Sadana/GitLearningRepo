import java.util.*;
import java.io.*;
class singleton
{
    private singleton()
    {
        
    }
    public static singleton g = null;
    public static singleton getInstance()
    {
        if(g == null)
        {
            g = new singleton();
        }
        return g;
    }
}
class second
{
    public static void main(String args[])
    {
        singleton j = singleton.getInstance();
        System.out.println("changing the code with git");
        System.out.println("changing the code second time");
    }
}