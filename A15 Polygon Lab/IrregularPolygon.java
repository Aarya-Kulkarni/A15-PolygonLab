import java.awt.geom.*;        //for Point2D.Double
import java.util.ArrayList;    //for ArrayList
import gpdraw.*;                //for DrawingTool
/**
 * Write a description of class IrregularPolygon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IrregularPolygon
{
    
    private ArrayList <Point2D.Double> myPolygon;
    
    //constructors
    public IrregularPolygon() {
    }
    
    //public methods
    public void add(Point2D.Double aPoint) {
    }
    
    public void draw() {
    }
    
    public double perimeter() {
        double perimeter = 0; 
        for (int i = 0; i < myPolygon.size() - 1; i++) {
             perimeter = myPolygon.get(i).distance(myPolygon.get(i+1));
        }
        perimeter += myPolygon.get(0).distance(myPolygon.get(myPolygon.size()-1));
        return perimeter;
    }
    
    public double area() {
        int area = 0;
        return area;
    }
    
    
   
    
}
