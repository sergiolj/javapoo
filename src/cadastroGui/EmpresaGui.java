package cadastroGui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmpresaGui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSalario;
	private JButton btbtSalvar;
	public FuncionarioGui funcionario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpresaGui frame = new EmpresaGui();
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
	public EmpresaGui () {
		setTitle("Cadastro de Funcionário");
		setResizable(false);
		FuncionarioGui funcionario = new FuncionarioGui();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 324, 187);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do Funcionario");
		lblNewLabel.setBounds(10, 11, 142, 14);
		contentPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 27, 288, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Salário");
		lblNewLabel_1.setBounds(10, 52, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtSalario = new JTextField();
		txtSalario.setColumns(10);
		txtSalario.setBounds(10, 68, 131, 20);
		txtSalario.setText("0");
		contentPane.add(txtSalario);
		
		btbtSalvar = new JButton("Salvar");
		btbtSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome=txtNome.getText();
				String salario=txtSalario.getText();
				funcionario.atualiza(nome,salario);
			}
		});
		
		btbtSalvar.setBounds(10, 108, 89, 23);
		contentPane.add(btbtSalvar);
		
		JButton btExibir = new JButton("Exibir");
		btExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				funcionario.list();
			}
		});
		
		btExibir.setBounds(109, 108, 89, 23);
		contentPane.add(btExibir);
		
		JButton btLimpar = new JButton("Limpar");
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
				txtSalario.setText("0");
				funcionario.reset();
			}
		});
		btLimpar.setBounds(209, 67, 89, 23);
		contentPane.add(btLimpar);
		
		JButton btSair = new JButton("Sair");
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		btSair.setBounds(209, 108, 89, 23);
		contentPane.add(btSair);
	}
}
