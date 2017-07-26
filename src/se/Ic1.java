package se;

public class Ic1 extends  InheritanceConcept{
public void add(){
	System.out.println("hi");
}
public static void main(String[] args) {
InheritanceConcept obj=new  InheritanceConcept();//hlo
//Ic1 obj1=new  InheritanceConcept(); //complier error
InheritanceConcept obj2=new Ic1(); //hi
Ic1 obj3 =new Ic1(); //hi
	obj.add();
	
}
}
