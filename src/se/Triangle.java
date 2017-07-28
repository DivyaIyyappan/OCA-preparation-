package se;

public class Triangle {

			     int base;
			    int height;
			    double area;
			    
			    Triangle(int base, int height){
			        this.base = base; this.height = height;
			        updateArea();
			    }

			    void updateArea(){
			        area = base*height/2;
			        System.out.println(area);
			    }
			     void setBase(int b){ base  = b; updateArea(); }
			     void setHeight(int h){ height  = h; updateArea(); }
			    
			    
			    
			    public static void main(String[] args) {
					Triangle name = new Triangle(2,2);
					name.updateArea();
					name.setBase(20);
					name.setHeight(20);
				}
			}

