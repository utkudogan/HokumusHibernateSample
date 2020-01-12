package com.hokumus.hib.proje.ui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.hokumus.hib.proje.dao.UsersDBDao;
import com.hokumus.hib.proje.models.Users;
import com.hokumus.hib.proje.util.DbServicessBase;
import com.hokumus.hib.proje.util.MyHBUtil;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame{
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtUserName;
	private JTextField txtPassword;
	private JButton btnCancel;
	private JButton btnLogin;
	
	public LoginFrame() {
		initialize();
	}
	
	private void initialize() {
		setTitle("Kullanýcý Giriþ Ekraný");
		setSize(400,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getTxtUserName());
		getContentPane().add(getTxtPassword());
		getContentPane().add(getBtnCancel());
		getContentPane().add(getBtnLogin());
		
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Kullan\u0131c\u0131 Ad\u0131");
			lblNewLabel.setBounds(12, 101, 153, 21);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\u015Eifre");
			lblNewLabel_1.setBounds(12, 144, 153, 21);
		}
		return lblNewLabel_1;
	}
	private JTextField getTxtUserName() {
		if (txtUserName == null) {
			txtUserName = new JTextField();
			txtUserName.setBounds(177, 100, 153, 22);
			txtUserName.setColumns(10);
		}
		return txtUserName;
	}
	private JTextField getTxtPassword() {
		if (txtPassword == null) {
			txtPassword = new JTextField();
			txtPassword.setBounds(177, 143, 153, 22);
			txtPassword.setColumns(10);
		}
		return txtPassword;
	}
	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton("\u0130ptal");
			btnCancel.setBounds(61, 206, 99, 25);
		}
		return btnCancel;
	}
	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("Giri\u015F");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DbServicessBase<Users> dao = new DbServicessBase<Users>();
					List<Users> liste = dao.getAllRows(new Users());
					if(liste.size() > 0)
						JOptionPane.showMessageDialog(LoginFrame.this, "Giriþ Baþarýlý");
					else {
						JOptionPane.showMessageDialog(LoginFrame.this, "Giriþ Baþarýsýz");
					}
					
				}
			});
			btnLogin.setBounds(231, 206, 99, 25);
		}
		return btnLogin;
	}
}
