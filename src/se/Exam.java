package se;

import java.util.Scanner;

public class Exam {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
float a=s.nextFloat();
if(((a/3)*3)==a)
{
	System.out.println("even");
}
else
{
	System.out.println("odd");
}
}
}
