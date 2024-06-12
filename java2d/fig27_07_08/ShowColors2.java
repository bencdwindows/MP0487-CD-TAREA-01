// Fig. 13.8: ShowColors2.java
// Choosing colors with JColorChooser.
import javax.swing.JFrame;

public class ShowColors2 {
   // execute application
   public static void main(String[] args)  {
      //Haremos un println para generar algún cambio en el clon del fork
      System.out.println("Segundo cambio del fork");
      ShowColors2JFrame application = new ShowColors2JFrame();
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   } 
} // end class ShowColors2
