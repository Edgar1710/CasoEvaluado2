package casoprogramado2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Activities extends JFrame implements ActionListener {

    JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4;
    JButton b1, b2;

    public Activities() {

        super("Activities");

        setLayout(new FlowLayout());

        etiqueta1 = new JLabel("""
                                  Bienvenido a la plataforma de gestion del Hotel!!
                                  """);

        etiqueta2 = new JLabel("""
                                  Esta herramienta nos funcionara para lograr realizar gestiones a nivel de sistemas. 
                                  """);
        etiqueta3 = new JLabel("""
                                  Por favor leer atentamente e introducir la informacion requerida para completar el proceso de manera satisfactoria 
                                  """);
        etiqueta4 = new JLabel("Menu: ");

        b1 = new JButton("Gestionar informacion de empleados");
        b1.addActionListener(this);

        b2 = new JButton("Gestionar actividades");
        b2.addActionListener(this);

        add(etiqueta1);
        add(etiqueta2);
        add(etiqueta3);
        add(etiqueta4);
        add(b1);
        add(b2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //Inicializacion de la Salas de yoga, baile
        SistemaDeReservas yoga = new SistemaDeReservas();
        SistemaDeReservas baile = new SistemaDeReservas();

        //Inicializacion del sistema
        EmployeeData employeeData = new EmployeeData();
        employeeData.preloadedRegistry();
        
        if (e.getSource() == b1) {

        }
        if (e.getSource() == b2) {

            OUTER:
            while (true) {
                String bookingOption = JOptionPane.showInputDialog("""
                                                                   Has ingresado a la seccion de reservaciones!
                                                                   En esta seccion lograras localizar las diversas areas que nuestra empresa te brinda para realizar la reservacion que deseas
                                                                   Para facilidad agregamos un menu de ayuda para seleccionar la opcion que deseas

                                                                   Menu:
                                                                   1. Yoga
                                                                   2. Baile
                                                                   3.Empleados

                                                                   Digita cualquier otra tecla para salir

                                                                   Introduzca a cual actividad desea ingresar: """);

                if (bookingOption == null || !(bookingOption.equals("1") || bookingOption.equals("2") || bookingOption.equals("3") || bookingOption.equals("4") || bookingOption.equals("5"))) {
                    break;
                }
                if (bookingOption.equals("1") || bookingOption.equals("2") || bookingOption.equals("3") || bookingOption.equals("4") || bookingOption.equals("5")) {

                }
            }

        }

    }

}
