package com.homexu.euler;
import java.util.ArrayList;

public class Person {
	
	public final String name;
    public final ArrayList<Person> children = new ArrayList<Person>();
    
    public Person(String name) {
    	this.name = name;
    }
    
    public static void printNames(Person p)
    {
    	System.out.println(p.name);
    	
    	for(Person child: p.children)
    		printNames(child);
    	
    }
    
    public static void main(String[] args)
    {
    	Person grandpa = new Person("Grandpa");
    	Person uncle = new Person("Uncle");
    	Person mom = new Person("Mom");
    	Person jolin = new Person("Jolin");
    	Person joanna = new Person("Joanna");
    	Person jacob = new Person("Jacob");
    	Person camilla = new Person("Camilla");
    	Person rory = new Person("Rory");
    	
    	grandpa.children.add(uncle);
    	grandpa.children.add(mom);
    	
    	uncle.children.add(jolin);
    	uncle.children.add(joanna);
    	uncle.children.add(jacob);
    	
    	mom.children.add(camilla);
    	mom.children.add(rory);
    	
    	printNames(grandpa);
    }
}
