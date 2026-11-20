import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PrototipoGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtNif;
	private JTextField txtMovil;
	private JTextField txtEmail;
	private JTextField txtCuenta;
	private JTextField txtCantidad;
	private JTextField txtMes;
	private JTextField txtProd100;
	private JTextField txtProd300;
	private JTextField txtProd500;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrototipoGUI frame = new PrototipoGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrototipoGUI() {
		setTitle("Proyecto Reto 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblDatos = new JLabel("Datos del trabajador");
		lblDatos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDatos.setBounds(20, 10, 300, 20);
		contentPane.add(lblDatos);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(20, 40, 100, 20);
		contentPane.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(130, 40, 310, 20);
		txtNombre.setColumns(10);
		contentPane.add(txtNombre);

		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(20, 70, 100, 20);
		contentPane.add(lblApellidos);

		txtApellidos = new JTextField();
		txtApellidos.setBounds(130, 70, 310, 20);
		txtApellidos.setColumns(10);
		contentPane.add(txtApellidos);

		JLabel lblNif = new JLabel("NIF:");
		lblNif.setBounds(20, 100, 100, 20);
		contentPane.add(lblNif);

		txtNif = new JTextField();
		txtNif.setBounds(130, 100, 310, 20);
		txtNif.setColumns(10);
		contentPane.add(txtNif);

		JLabel lblMovil = new JLabel("Movil:");
		lblMovil.setBounds(20, 130, 100, 20);
		contentPane.add(lblMovil);

		txtMovil = new JTextField();
		txtMovil.setBounds(130, 130, 310, 20);
		txtMovil.setColumns(10);
		contentPane.add(txtMovil);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(20, 160, 100, 20);
		contentPane.add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setBounds(130, 160, 310, 20);
		txtEmail.setColumns(10);
		contentPane.add(txtEmail);

		JLabel lblCuenta = new JLabel("Cuenta bancaria:");
		lblCuenta.setBounds(20, 190, 110, 20);
		contentPane.add(lblCuenta);

		txtCuenta = new JTextField();
		txtCuenta.setBounds(130, 190, 310, 20);
		txtCuenta.setColumns(10);
		contentPane.add(txtCuenta);

		JButton btnGuardar = new JButton("Guardar datos");
		btnGuardar.setBounds(130, 220, 150, 25);
		contentPane.add(btnGuardar);

		JButton btnMostrar = new JButton("Mostrar datos");
		btnMostrar.setBounds(290, 220, 150, 25);
		contentPane.add(btnMostrar);

		JSeparator separator = new JSeparator();
		separator.setBounds(20, 260, 420, 2);
		contentPane.add(separator);

		JLabel lblGestionSaldo = new JLabel("Gestion del saldo");
		lblGestionSaldo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGestionSaldo.setBounds(20, 270, 300, 20);
		contentPane.add(lblGestionSaldo);

		JLabel lblSaldo = new JLabel("Saldo actual: 0.0 euros");
		lblSaldo.setBounds(20, 300, 300, 20);
		contentPane.add(lblSaldo);

		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(20, 330, 100, 20);
		contentPane.add(lblCantidad);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(130, 330, 90, 20);
		txtCantidad.setColumns(10);
		contentPane.add(txtCantidad);

		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(230, 328, 100, 25);
		contentPane.add(btnIngresar);

		JButton btnExtraer = new JButton("Extraer");
		btnExtraer.setBounds(340, 328, 100, 25);
		contentPane.add(btnExtraer);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 368, 420, 2);
		contentPane.add(separator_1);

		JLabel lblNomina = new JLabel("Calculo de la nomina mensual");
		lblNomina.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNomina.setBounds(20, 378, 300, 20);
		contentPane.add(lblNomina);

		JLabel lblMes = new JLabel("Mes (1-12):");
		lblMes.setBounds(20, 408, 100, 20);
		contentPane.add(lblMes);

		txtMes = new JTextField();
		txtMes.setBounds(130, 408, 60, 20);
		txtMes.setColumns(10);
		contentPane.add(txtMes);

		JLabel lblProd100 = new JLabel("Productos 100 euros:");
		lblProd100.setBounds(20, 438, 130, 20);
		contentPane.add(lblProd100);

		txtProd100 = new JTextField();
		txtProd100.setBounds(150, 438, 60, 20);
		txtProd100.setColumns(10);
		contentPane.add(txtProd100);

		JLabel lblProd300 = new JLabel("Productos 300 euros:");
		lblProd300.setBounds(240, 438, 130, 20);
		contentPane.add(lblProd300);

		txtProd300 = new JTextField();
		txtProd300.setBounds(380, 438, 60, 20);
		txtProd300.setColumns(10);
		contentPane.add(txtProd300);

		JLabel lblProd500 = new JLabel("Productos 500 euros:");
		lblProd500.setBounds(20, 468, 130, 20);
		contentPane.add(lblProd500);

		txtProd500 = new JTextField();
		txtProd500.setBounds(150, 468, 60, 20);
		txtProd500.setColumns(10);
		contentPane.add(txtProd500);

		JButton btnCalcular = new JButton("Calcular nomina");
		btnCalcular.setBounds(240, 466, 200, 25);
		contentPane.add(btnCalcular);

		JLabel lblResultado = new JLabel("Sueldo neto: -");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblResultado.setBounds(20, 510, 420, 20);
		contentPane.add(lblResultado);
	}
}
