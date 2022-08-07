package com.muskan;
// Author Muskan Singal
import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoEle {
public static void main(String[] args) {
	//create a array list 
ArrayList<String> ArrList = new ArrayList<String>();
   // add the elements in the array list
    ArrList.add("muskan");
    ArrList.add("neeta");
    ArrList.add("anjali");
    ArrList.add("chesta");
    ArrList.add("pooja");
    
   // print the elements
    System.out.println("before swap the elements");
    System.out.println(ArrList);

    Collections.swap(ArrList, 1, 2);
    
    System.out.println("After swap the elements");
    System.out.println(ArrList);
}
}