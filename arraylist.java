import java.util.*;
import java.io.*;
class arraylist
{
    public static void main(String[] args)
    {
        
        ArrayList fruits = new ArrayList();
        LinkedList vegetables = new LinkedList();
        ArrayList toremove = new ArrayList();
        fruits.add("singga bolda");
        fruits.add(35);
        fruits.add("43546454");
        fruits.add("hdhjddhf");
        fruits.add("o;o;ol");
        vegetables.add("koi chakkar ni");
        vegetables.add(78);
        //toremove.add(fruits.get(4));
        //toremove.add(fruits.get(2));
        fruits.removeAll(toremove);
        
        fruits.addAll(vegetables);
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.contains(78));
        /*
        pair<String,Integer> p = new pair("singga bolda veere",546);
        pair<Integer,Integer> k = new pair(45,546);
        */
    }
}
/*
class pair<X,Y>
{
    Y y;
    X x;
    pair(X x, Y y)
    {
        this.x = x;
        this.y = y;
        System.out.println(x +" " + y);
    }
}
*/