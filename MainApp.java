package advance.dev;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;

public class MainApp {
     public static void main(String[] args) {
       List<Shape> shapes = new ArrayList<>();
       readerFile(shapes);
     }
     public static void readerFile(List<Shape> shapes) {
    	 try {
    		 File file = new File("input.txt");
    		 Scanner sc = new Scanner(file);
    		 while(sc.hasNextLine()) {
    			 String line = sc.nextLine();
    			 String[] parts = line.split(",");
    			 String shapeType = parts[0].trim().toLowerCase();
    			 switch(shapeType) {
    			 case "Triangle":
    				 double a = Double.parseDouble(parts[1].trim());
    				 double b = Double.parseDouble(parts[2].trim());
    				 double c = Double.parseDouble(parts[3].trim());
    				 break;
    				 
    			 case "Circle" :
    				 double r = Double.parseDouble(parts[1].trim());
    				 break;
    				 
    			 case "Rectangle" :
    				 double height = Double.parseDouble(parts[1].trim());
    				 double width = Double.parseDouble(parts[2].trim());
    				 break;
    				 default:
    					 System.out.println("Không đọc được file");
    					 break;
    			 }
    		 }
    		 sc.close();
    	 }catch(FileNotFoundException Exception) {
    		 System.out.println("File không tồn tại: input.txt");
    		 Exception.printStackTrace();
    	 }
     }
}
