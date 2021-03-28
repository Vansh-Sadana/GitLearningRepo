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
        System.out.println("removed the printing of all the useless lines made due to git");
    }
}