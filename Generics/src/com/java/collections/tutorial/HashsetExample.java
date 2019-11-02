package com.java.collections.tutorial;
//Hasset internally follows the HashMap rule but here Hashset allows the null values

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetExample{
 public static <amp> void main(String args[]){
  
	 Set al=new HashSet(); // creating hashSet
 al.add("Rachit");                 // adding elements
 al.add("Amit");
 al.add("jack");
 al.add("Rachit");
 Iterator itr=al.iterator();
 while(itr.hasNext()){
 System.out.println(itr.next());
 }
 }
 }