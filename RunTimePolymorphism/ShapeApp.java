package RunTimePolymorphism;

public class ShapeApp {

	public static void main(String[] args) {
     Shape a=new Circle();
     a.area();
     a.show();
     a= new Rectange();
     a.area();
     a.show();
     a=new Triangle();
     a.area();
     a.show();
     Shape a1=new Circle();
     a1.area();
     a1.show();
     Shape a2 =new Rectange();
     a2.area();
     a2.show();
     Shape a3=new Triangle();
     a3.area();
     a3.show();
     
	}

}
