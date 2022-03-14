import java.awt.Color;

public class WinterScene{
   public static void main (String [] args){
      for (int i=1; true; i++){
      StdDraw.setScale(-1,1);
      StdDraw.pause(5000);
      StdDraw.clear();
      Color ppman = new Color (36,255,255);
      StdDraw.setPenColor(ppman);
      StdDraw.setPenRadius(0.01);
      StdDraw.filledRectangle(0,-0.75, 1, 0.25);
      StdDraw.setPenColor(StdDraw.GRAY);
      StdDraw.filledCircle(0,-0.3,0.4);
      StdDraw.filledCircle(0,0.25,0.3);
      StdDraw.filledCircle(0,0.65,0.2);
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.filledCircle(0.06,0.7,0.014);
      StdDraw.filledCircle(-0.06,0.7,0.014);
      StdDraw.setPenColor(StdDraw.ORANGE);
      StdDraw.circle(0,0.65,0.025);
      StdDraw.setPenColor(ppman);
      StdDraw.filledCircle(0,0.65,0.02);
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.arc(0,0.65,0.1,230,310);
      Color brown = new Color (125, 0, 0);
      StdDraw.setPenColor(brown);
      StdDraw.line(0.3,0.25,0.5,0.25);
      StdDraw.line(-0.3,0.25,0.5*-1,0.25);
      for (int x=0; x<6; x++){
      StdDraw.pause(25);
      StdDraw.clear(StdDraw.BLACK);
      StdDraw.pause(25);
      StdDraw.clear();
      StdDraw.pause(25);
      StdDraw.clear(StdDraw.RED);
      StdDraw.pause(25);
      StdDraw.clear(ppman);
      //StdDraw.pause(25);
      }
      StdDraw.pause(2000);
      StdDraw.clear();
      StdDraw.setPenColor(StdDraw.RED);
      StdDraw.setPenRadius(0.01);
      StdDraw.filledRectangle(0,-0.75, 1, 0.25);
      StdDraw.setPenColor(StdDraw.GRAY);
      StdDraw.filledCircle(0,-0.3,0.4);
      StdDraw.filledCircle(0,0.25,0.3);
      //StdDraw.filledCircle(0,0.65,0.2);
      StdDraw.setPenColor(StdDraw.BLACK);
      //StdDraw.point(0.06,0.7);
      //StdDraw.point(-0.06,0.7);
      StdDraw.setPenColor(StdDraw.ORANGE);
      //StdDraw.circle(0,0.65,0.025);
      //StdDraw.setPenColor(ppman);
      //StdDraw.filledCircle(0,0.65,0.02);
      //StdDraw.setPenColor(StdDraw.BLACK);
      //StdDraw.arc(0,0.65,0.1,230,310);
      StdDraw.setPenColor(brown);
      StdDraw.line(0.3,0.25,0.5,0.25);
      StdDraw.line(-0.3,0.25,0.5*-1,0.25);
      //StdDraw.pause(6000);
      StdDraw.setPenColor(StdDraw.GRAY);
      StdDraw.filledCircle(0.7,-0.7,0.2);
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.line(0.75,-0.6,0.8,-0.65);
      StdDraw.line(0.8,-0.6,0.75,-0.65);
      //StdDraw.line(0.7,-0.6,0.75,-0.65);
      StdDraw.line(0.75-0.1,-0.6,0.8-0.1,-0.65);
      StdDraw.line(0.7,-0.6,0.65,-0.65);
      StdDraw.circle(0.73,-0.76,0.05);
      if (i==1) System.out.println("The snowman died!");
      if (i!=1) System.out.println("The snowman died, AGAIN!!");
      }

   }
}

