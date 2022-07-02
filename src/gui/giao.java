package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dao.CauThudao;
import domain.CauThu;

public class giao extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_1;
	private JScrollPane scrollPane_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_3_1;
	private JLabel lblNewLabel_3_2;
	private JLabel lblNewLabel_3_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton;
	private JButton btnXa;
	private JButton btnXa_1;
	private JButton btnThot;
	private JTable bangCT;
	private DefaultTableModel mode;
	private List<CauThu> dsct = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					giao frame = new giao();
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
	public giao() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 746);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getScrollPane());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getScrollPane_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_3_1());
		contentPane.add(getLblNewLabel_3_2());
		contentPane.add(getLblNewLabel_3_3());
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getTextField_2());
		contentPane.add(getTextField_3());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnXa());
		contentPane.add(getBtnXa_1());
		contentPane.add(getBtnThot());
		loadData();
		
	}
		
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Qu\u1EA3n L\u00FD CLB B\u00F3ng \u0110\u00E1");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel.setBounds(249, 0, 219, 29);
		}
		return lblNewLabel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 55, 750, 255);
			scrollPane.setViewportView(getBangCT());
		}
		return scrollPane;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Danh S\u00E1ch C\u1EA7u Th\u1EE7");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
			lblNewLabel_1.setBounds(10, 35, 189, 21);
		}
		return lblNewLabel_1;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(10, 346, 750, 189);
		}
		return scrollPane_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Danh S\u00E1ch HLV");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
			lblNewLabel_2.setBounds(10, 323, 204, 21);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("T\u00EAn");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNewLabel_3.setBounds(20, 545, 62, 29);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_3_1() {
		if (lblNewLabel_3_1 == null) {
			lblNewLabel_3_1 = new JLabel("S\u1ED1 \u00C1o");
			lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNewLabel_3_1.setBounds(425, 545, 62, 29);
		}
		return lblNewLabel_3_1;
	}
	private JLabel getLblNewLabel_3_2() {
		if (lblNewLabel_3_2 == null) {
			lblNewLabel_3_2 = new JLabel("Ng\u00E0y Sinh");
			lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNewLabel_3_2.setBounds(20, 595, 76, 29);
		}
		return lblNewLabel_3_2;
	}
	private JLabel getLblNewLabel_3_3() {
		if (lblNewLabel_3_3 == null) {
			lblNewLabel_3_3 = new JLabel("V\u1ECB Tr\u00ED");
			lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNewLabel_3_3.setBounds(425, 595, 62, 29);
		}
		return lblNewLabel_3_3;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(137, 545, 132, 29);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(137, 595, 132, 29);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(512, 545, 132, 29);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(512, 595, 132, 29);
		}
		return textField_3;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Th\u00EAm");
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnNewButton.setBounds(30, 670, 132, 29);
		}
		return btnNewButton;
	}
	private JButton getBtnXa() {
		if (btnXa == null) {
			btnXa = new JButton("X\u00F3a");
			btnXa.setFont(new Font("Tahoma", Font.BOLD, 17));
			btnXa.setBounds(229, 670, 132, 29);
		}
		return btnXa;
	}
	private JButton getBtnXa_1() {
		if (btnXa_1 == null) {
			btnXa_1 = new JButton("X\u1EEFa");
			btnXa_1.setFont(new Font("Tahoma", Font.BOLD, 17));
			btnXa_1.setBounds(425, 670, 132, 29);
		}
		return btnXa_1;
	}
	private JButton getBtnThot() {
		if (btnThot == null) {
			btnThot = new JButton("Tho\u00E1t");
			btnThot.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnThot.setFont(new Font("Tahoma", Font.BOLD, 17));
			btnThot.setBounds(628, 670, 132, 29);
		}
		return btnThot;
	}
	private JTable getBangCT() {
		if (bangCT == null) {
			bangCT = new JTable(getMode());
		}
		return bangCT;
	}
	/**
	 * @wbp.nonvisual location=730,604
	 */
	private DefaultTableModel getMode() {
		if (mode == null) {
			mode = new DefaultTableModel();
			mode.addColumn("Số Áo");
			mode.addColumn("Tên");
			mode.addColumn("Ngày Sinh");
			mode.addColumn("Vị Trí");
		}
		return mode;
	}
	private void loadData() {
		mode.setRowCount(0);// gan cho tong so cua dong mode
		bangCT.setModel(mode);//gan mode bangCT
		dsct = CauThudao.timTatCa();
//		for(CauThu ct:dsct	) {
//			
//		}
	}
}

