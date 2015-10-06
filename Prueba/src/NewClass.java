import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class NewClass extends JFrame implements ActionListener {
 JButton button,button2;
public NewClass() {
   
// TODO Auto-generated constructor stub

button = new JButton("Nuevo ROL");
button.addActionListener(this);
button.setActionCommand("AGREGAR-JTABLE");

JPanel panel = new JPanel(new FlowLayout());
panel.add(button);


getContentPane().setLayout(new BorderLayout());
getContentPane().add(panel, BorderLayout.NORTH);


JButton button2 = new JButton("Eliminar ROL");
button2.addActionListener(this);
button2.setActionCommand("AGREGAR-JTABLE");

JPanel panel2 = new JPanel(new FlowLayout());
panel.add(button2);

//getContentPane().setLayout(new BorderLayout());
getContentPane().add(panel, BorderLayout.NORTH);

setSize(800, 300);
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
setTitle("Panel de Roles");


Vector columnas = new Vector();
columnas.add("ROL 1");
columnas.add("ROL 2");
columnas.add("ROL 3");
columnas.add("ROL 4");
columnas.add("ROL 5");

Vector filas = new Vector();
Vector fila = new Vector();


/*fila.add(new JButton("Clic aquí"));
fila.add("Y");
fila.add("Z");
filas.add(fila);*/

JTable tbl = new JTable(filas,columnas);
JScrollPane scroll =new JScrollPane(tbl);
getContentPane().add(scroll, BorderLayout.CENTER);
getContentPane().invalidate();
getContentPane().validate();
setVisible(true);

}

@Override
public void actionPerformed(ActionEvent e) {
     if(e.getSource()==button){
            JOptionPane.showMessageDialog(null,"AGREGAR NUEVO ROL");
       
        }else{
            JOptionPane.showMessageDialog(null,"Seleccione ROL a ELIMINAR");
        }
    
    
    
    
    
    
// TODO Auto-generated method stub
    Vector columnas = new Vector();
    
columnas.add("dwda");


}

public static void main(String[] args) {
// TODO Auto-generated method stub
new NewClass();
}

}

