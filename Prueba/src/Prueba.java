import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Prueba extends JFrame implements ActionListener{
JButton boton;
    public Prueba(){
        JFrame frame = new JFrame("JTable Test Display");
        
        
        
        
        Object[][] datos = {
           };
        String[] columnNames = {"Nombre" , "Años", "Apto",};
        DefaultTableModel dtm = new DefaultTableModel(datos,columnNames);
        final JTable table = new JTable(dtm);
        table.setPreferredScrollableViewportSize(new Dimension(250, 100));
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
     
        boton=new JButton("holi");
        boton.setBounds(300,250,100,30);
        //add(boton);
        boton.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Prueba frame = new Prueba();
        frame.pack();
        frame.setVisible(true);
    }
    
    public void agregarRol(){
    }
    public void eliminarRol(){
    }
    public void mostraRol(){
    }
}
