/*
 * StudentDeleteInterFrm.java
 *
 * Created on __DATE__, __TIME__
 */

package com.DMView;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.DMModel.Room;
import com.DMModel.Student;
import com.DMUtil.DMUtil;
import com.Dao.StudentDao;

/**
 *
 * @author  __USER__
 */
public class StudentDeleteInterFrm extends javax.swing.JInternalFrame {
	DMUtil dmutil = new DMUtil();
	StudentDao studentdao = new StudentDao();

	/** Creates new form StudentDeleteInterFrm */
	public StudentDeleteInterFrm() {
		initComponents();
		this.setLocation(200, 50);
	}

	private void fillTable(Student student) {
		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
		dtm.setRowCount(0);
		Connection con = null;
		try {
			con = dmutil.getCon();
			ResultSet rs = studentdao.StudentSearch(con, student);
			while (rs.next()) {
				Vector v = new Vector();
				v.add(rs.getString("id"));
				v.add(rs.getString("name"));
				v.add(rs.getString("sex"));
				v.add(rs.getString("yuanxi"));
				v.add(rs.getString("classroom"));
				v.add(rs.getString("dormitory"));
				v.add(rs.getString("bed"));
				dtm.addRow(v);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dmutil.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		nameTxt = new javax.swing.JTextField();
		jb_search = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		table = new javax.swing.JTable();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();

		setClosable(true);
		setIconifiable(true);
		setTitle("\u5b66\u751f\u4fe1\u606f\u5220\u9664");

		jLabel1.setText("\u59d3\u540d\uff1a");

		jb_search.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\search.png")); // NOI18N
		jb_search.setText("\u67e5\u8be2");
		jb_search.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jb_searchActionPerformed(evt);
			}
		});

		table.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "���", "����", "�Ա�", "Ժϵ", "�༶", "���Һ�", "����" }) {
			boolean[] canEdit = new boolean[] { false, false, false, true,
					true, true, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(table);

		jButton2.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\delete.png")); // NOI18N
		jButton2.setText("\u5220\u9664");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\exit.png")); 
		jButton3.setText("\u9000\u51fa");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(16, Short.MAX_VALUE)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(
						layout.createSequentialGroup()
								.addGap(119, 119, 119)
								.addComponent(jLabel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										43,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(nameTxt,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										132,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jb_search)
								.addContainerGap(113, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
								.addGap(125, 125, 125)
								.addComponent(jButton2)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										141, Short.MAX_VALUE)
								.addComponent(jButton3).addGap(98, 98, 98)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(29, 29, 29)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel1)
												.addComponent(jb_search)
												.addComponent(
														nameTxt,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										136,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(38, 38, 38)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton2)
												.addComponent(jButton3))
								.addContainerGap(39, Short.MAX_VALUE)));

		pack();
	}

	private void jb_searchActionPerformed(java.awt.event.ActionEvent evt) {
		String member = nameTxt.getText();
		Student student = new Student(member);
		this.fillTable(student);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		String name = nameTxt.getText();
		int n = JOptionPane.showConfirmDialog(null, "ȷ��Ҫɾ��������¼ô");
		if (n == 0) {
			Connection con = null;
			try {
				con = dmutil.getCon();
				Student student = new Student(name);
				int a = studentdao.StudentDelete(con, student);
				if (a == 1) {
					JOptionPane.showMessageDialog(null, "ɾ���ɹ���");
					this.fillTable(student);
					this.nameTxt.setText("");
					return;
				} else {
					JOptionPane.showMessageDialog(null, "ɾ��ʧ��!");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "ɾ��ʧ��!");
				e.printStackTrace();
			}
		}
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		int a = JOptionPane.showConfirmDialog(null, "ȷ���˳���");
		if (a == 0) {
			this.dispose();
		}
	}

	
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JButton jb_search;
	private javax.swing.JTextField nameTxt;
	private javax.swing.JTable table;
	

}