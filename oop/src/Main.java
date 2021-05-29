import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;    
class Frame 
{      
    Frame(){    
        
        //creating Frame 
        JFrame f=new JFrame("Printer");
        JLabel l = new JLabel("Printer: My Printer");
        l.setBounds(50,50,150,30);
        f.add(l);

        //creating first list
        String [ ] lst = { " "}; 
        JList list = new JList(lst);  
        list.setBounds(50,100, 75,100);  
        f.add(list); 

        //creating first checkbox
        JCheckBox C1 = new JCheckBox("image");  
        C1.setBounds(130,100, 75,50);
        f.add(C1);
        //creating second checkbox
        JCheckBox C2 = new JCheckBox("Text");  
        C2.setBounds(130,130, 75,50);    
        f.add(C2);  
        //creating third checkbox
        JCheckBox C3 = new JCheckBox("Code");  
        C3.setBounds(130,160, 75,50);  
        f.add(C3);

        //creating second list
        JList list1 = new JList(lst);  
        list1.setBounds(200,100, 75,100);  
        f.add(list1); 

        //creating radio buttons 
        ButtonGroup G1 = new ButtonGroup(); 
        JRadioButton R1 = new JRadioButton(); 
        R1.setText("Selecion"); 
        R1.setBounds(280,100,75 ,50);
        f.add(R1);
        JRadioButton R2 = new JRadioButton();
        R2.setText("All"); 
        R2.setBounds(280,130,75 ,50);
        f.add(R2);
        JRadioButton R3 = new JRadioButton();
        R3.setText("Applet"); 
        R3.setBounds(280,160,75 ,50);
        f.add(R3);

        G1.add(R1); 
        G1.add(R2); 
        G1.add(R3); 

        //creating third list
        JList list2 = new JList(lst);  
        list2.setBounds(350,100, 75,100);  
        f.add(list2); 

        //creating first button
        JButton b1=new JButton("OK");
        // showing dialog message
        b1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "OK");
             }
          });

        //creating second button
        JButton b2=new JButton("Cancel");
        // showing dialog message
        b2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                int a = JOptionPane.showConfirmDialog(f,"Do You Want to Cancel ?");
                if(a==JOptionPane.YES_OPTION){  
                    System.exit(0);
                }
            } } );

        //creating third button
        JButton b3=new JButton("Setup");
        //showing dialog message
        b3.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f,"The setup is set by default\n if you want to do any changes then make changes in source code.");  
             }
          });

        //creating fourth button
        JButton b4=new JButton("Help");
        //shhoqing dialog message
        b4.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f,"    Help "
                     + "\n 1. The empty text boxes are JList components"
                     + "\n 2. Image, text, Code, Print to file are four JCheckBox components"
                     + "\n 3. Selection, All, Applet are JRadioButton Components which grouped by ButtonGroup to select only one item at a time "
                     + "\n 4. Print Quality is a JComboBox component that has three levels (high, medium, low)"
                     + "\n 5. Ok, Cancel, Setup, Help are four JButton Components that show message dialogue on click.");  
             }
          });
        //setting bounds of Buttons button.setBounds(int xaxis, int yaxis, int width, int height)
        b1.setBounds(450,50,95,30);  
        b2.setBounds(450,100,95,30); 
        b3.setBounds(450,150,95,30); 
        b4.setBounds(450,200,95,30); 
        //adding these buttons to frame
        f.add(b1); 
        f.add(b2);
        f.add(b3);
        f.add(b4);

        //creating label
        JLabel l1=new JLabel("Print Quality:");  
        l1.setBounds(50,210, 100,30);  
        f.add(l1);  
        //creating comboBox
        String country[]={"High","Medium","Low"};        
        JComboBox cb=new JComboBox(country);    
        cb.setBounds(150,210,90,30);    
        f.add(cb);    
        
        //creating check box
        JCheckBox C4 = new JCheckBox("Print to File");  
        C4.setBounds(300,210,100,30);  
        f.add(C4);

        //setting layout and size of Frame and makking it visible
        f.setLayout(null);    
        f.setSize(600,400);    
        f.setVisible(true); 
    }  
 }
public class Main{
    
public static void main(String[] args) {  
    //creating object of frame
    new Frame();         
}    
}   