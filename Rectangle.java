package advance.dev;

 class Rectangle extends Shape implements IShape {
     private double a;
     private double b;
     
     public Rectangle(double a, double b) {
    	 super();
    	 this.a = a;
    	 this.b = b;
     }
     @Override
     public double chuvi() {
    	 return (a + b) * 2;
     }
     @Override
     public double dientich() {
    	 return a * b;
     }
     public void input(Shape[] shapes) {
    	 
     }
     public void print(Shape[] shapes) {
    	 
     }
}
