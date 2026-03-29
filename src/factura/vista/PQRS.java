package factura.vista;

import javax.swing.*;
import java.awt.*;

public class PQRS extends JFrame {

    private JTable tablaPQRS;
    private JButton btnConsultar;
    private JButton btnExportar;
    private JTextField txtFechaInicio;
    private JTextField txtFechaFin;
    private JComboBox<String> cmbTipoPQRS;

    public PQRS() {
        setTitle("Gestión de PQRS");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelSuperior = new JPanel(new GridLayout(2, 4));
        panelSuperior.add(new JLabel("Fecha inicio:"));
        txtFechaInicio = new JTextField();
        panelSuperior.add(txtFechaInicio);

        panelSuperior.add(new JLabel("Fecha fin:"));
        txtFechaFin = new JTextField();
        panelSuperior.add(txtFechaFin);

        panelSuperior.add(new JLabel("Tipo de PQRS:"));
        cmbTipoPQRS = new JComboBox<>(new String[]{"Queja", "Reclamo", "Sugerencia", "Felicitación"});
        panelSuperior.add(cmbTipoPQRS);

        btnConsultar = new JButton("Consultar");
        panelSuperior.add(btnConsultar);

        btnExportar = new JButton("Exportar");
        panelSuperior.add(btnExportar);

        add(panelSuperior, BorderLayout.NORTH);

        tablaPQRS = new JTable();
        JScrollPane scrollPane = new JScrollPane(tablaPQRS);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PQRS frame = new PQRS();
            frame.setVisible(true);
        });
    }
}