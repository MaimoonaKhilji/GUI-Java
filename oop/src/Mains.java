import javax.swing.JOptionPane;
/* w w w.  j  a va  2 s.  co m*/
public class Mains {
  public static void main(String[] args) {
    String inputValue = JOptionPane.showInputDialog("Please input a value");

    if (inputValue == null) {
      System.out.println("CANCEL");
    } else if (inputValue.equals("")) {
      System.out.println("OK");
    } else {
      JOptionPane.showMessageDialog(null, inputValue);
    }
  }
}