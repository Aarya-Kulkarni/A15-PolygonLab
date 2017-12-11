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
        int first = 0;
        int second = 0;
        int area = 0;
        for (int i = 0; i < myPolygon.size() - 1; i++) {
            first += myPolygon.get(i).getX() * myPolygon.get(i + 1).getY();
        }
        first += myPolygon.get(0).getX() * myPolygon.get(myPolygon.size() - 1).getY();
        
        for (int i = 0; i < myPolygon.size() - 1; i++) {
            second += myPolygon.get(i).getY() * myPolygon.get(i + 1).getX();
        }
        second += myPolygon.get(0).getY() * myPolygon.get(myPolygon.size() - 1).getX();
        
        return Math.abs(.5 * (first - second));
    }
    
    
   
    
}
