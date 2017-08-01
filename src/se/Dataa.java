package se;

import java.util.Arrays;
import java.util.List;

public class Dataa {
	

			    int value;

			    Dataa(int value){

			        this.value = value;

			    }

			    public String toString(){

			return ""+value;

			}

			         public static void main(String[] args) {

			        Dataa[] dataArr = new Dataa[]{ new Dataa(1), new Dataa(2), new Dataa(3), new Dataa(4) };

			         List<Dataa> dataList = Arrays.asList(dataArr); //1

			         for(Dataa element :  dataList){

			             dataList.removeIf( (Dataa d) -> { return d.value%2 ==  0; } );  //2


			        }

			   }

			      
}
