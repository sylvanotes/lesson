package com.homexu.euler;
import java.util.ArrayList;

public class Person {
	
	public final String name;
    public final ArrayList<Person> children = new ArrayList<Person>();
    
    public Person(String name) {
    	this.name = name;
    }
    
    public String toString()
    {
    	return name;
    }
    
    public static void printNames(Person parent, ArrayList<Person> des)
    {
    	System.out.println(parent.toString());
    	
    	for(Person m: des)
    		System.out.print(m.toString() + " ");
    	
    	/*if(there are still descendents)
    	{
    		for(Person n: des)
    			return(n, ndes);
    	}
    	else
    	{
    		return;
    	}*/
    	
    }
}
