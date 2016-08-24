package com.gspann.selenium;

class poly1 {
	
 public void hotel()
 {
	 System.out.println("This is hotel for poly 1");
 }
 
 public void room()
 {
	 System.out.println("This is room for poly 1");
 }
	
		}


 class poly2 extends poly1
{
	public void hotel()
	 {
		 System.out.println("This is hotel for poly 2");
	 }
	 
	 public void room()
	 {
		 System.out.println("This is room for poly 2");
	 }
}
 
 class polymorphism
 {
  public static void main(String args[])
 {
	 poly1 obj=new poly2();
	 obj.room();
	 
 }
}


