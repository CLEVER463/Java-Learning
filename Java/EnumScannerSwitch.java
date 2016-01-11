import java.util.Scanner;
public class EnumScannerSwitch {

    /**
     * @param args the command line arguments
     */
    public enum Color { RED, BLUE, GREEN }
    public static void main(String[] args) {
      String bool;
      Scanner scan = new Scanner(System.in);
      bool = scan.nextLine();
      Color colorGui=Color.BLUE;
      switch(bool){
          case "YES":colorGui = Color.RED;break;
          case "NO":colorGui = Color.GREEN;break;
          default:
              break;
      }
      switch(colorGui){
          case RED:System.out.println("RED");break;
          case GREEN:System.out.println("GREEN");break;
          default:break;
      }
    }
    
}