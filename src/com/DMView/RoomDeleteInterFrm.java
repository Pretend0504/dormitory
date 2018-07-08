/*
 * RoomDeleteInterFrm.java
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
import com.DMUtil.DMUtil;
import com.DMUtil.StringUtil;
import com.Dao.RoomDao;

/**
 *
 * @author  __USER__
 */
public class RoomDeleteInterFrm extends javax.swing.JInternalFrame {
	DMUtil dmutil = new DMUtil();
	RoomDao roomdao = new RoomDao();

	/** Creates new form RoomDeleteInterFrm */
	public RoomDeleteInterFrm() {
		initComponents();
		this.setLocation(200, 50);
		this.fillTable(new Room());
	}

	private void fillTable(Room room) {
		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
		dtm.setRowCount(0);
		Connection con = null;
		try {
			con = dmutil.getCon();
			ResultSet rs = roomdao.roomList(con, room);
			while (rs.next()) {
				Vector v = new Vector();
				v.add(rs.getString("id"));
				v.add(rs.getString("member"));
				v.add(rs.getString("leader"));
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
		roomNum = new javax.swing.JTextField();
		jb_search = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		table = new javax.swing.JTable();
		jb_delete = new javax.swing.JButton();
		jb_exit = new javax.swing.JButton();

		setClosable(true);
		setIconifiable(true);
		setTitle("\u5bdd\u5ba4\u5220\u9664");

		jLabel1.setText("\u5bdd\u5ba4\u53f7\uff1a");

		jb_search.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\search.png")); // NOI18N
		jb_search.setText("\u67e5\u8be2");
		jb_search.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jb_searchActionPerformed(evt);
			}
		});

		table.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "���", "���Һ� ", "���ҳ�" }) {
			boolean[] canEdit = new boolean[] { false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(table);

		jb_delete.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\delete.png")); // NOI18N
		jb_delete.setText("\u5220\u9664");
		jb_delete.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jb_deleteActionPerformed(evt);
			}
		});

		jb_exit.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\exit.png")); // NOI18N
		jb_exit.setText("\u9000\u51fa");
		jb_exit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jb_exitActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(64, 64, 64)
								.addComponent(jLabel1)
								.addGap(18, 18, 18)
								.addComponent(roomNum,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										142,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(29, 29, 29).addComponent(jb_search)
								.addContainerGap(41, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
								.addGap(76, 76, 76)
								.addComponent(jb_delete)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										123, Short.MAX_VALUE)
								.addComponent(jb_exit).addGap(86, 86, 86))
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										379,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(28, 28, 28)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jb_search)
												.addComponent(jLabel1)
												.addComponent(
														roomNum,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										216,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										20, Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jb_delete)
												.addComponent(jb_exit))
								.addGap(27, 27, 27)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jb_deleteActionPerformed(java.awt.event.ActionEvent evt) {
		int row = this.table.getSelectedRow();
		String member = (String) this.table.getValueAt(row, 1);
		if (StringUtil.isEmpty(member)) {
			JOptionPane.showMessageDialog(null, "��ѡ��Ҫɾ���ļ�¼!");
			return;
		}
		int n = JOptionPane.showConfirmDialog(null, "ȷ��Ҫɾ��������¼ô");
		if (n == 0) {
			Connection con = null;
			try {
				con = dmutil.getCon();
				Room room = new Room(member);
				int deleteNum = roomdao.roomDelete(con, room);
				if (deleteNum == 1) {
					JOptionPane.showMessageDialog(null, "ɾ���ɹ�");
					this.roomNum.setText("");
					this.fillTable(new Room());
				} else {
					JOptionPane.showMessageDialog(null, "ɾ��ʧ��");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "ɾ��ʧ��");
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
	}

	private void jb_exitActionPerformed(java.awt.event.ActionEvent evt) {
		int a = JOptionPane.showConfirmDialog(null, "ȷ��Ҫ�˳���");
		if (a == 0) {
			this.dispose();
		}
	}

	private void jb_searchActionPerformed(java.awt.event.ActionEvent evt) {
		String member = roomNum.getText();
		Room room = new Room(member);
		this.fillTable(room);
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel jLabel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JButton jb_delete;
	private javax.swing.JButton jb_exit;
	private javax.swing.JButton jb_search;
	private javax.swing.JTextField roomNum;
	private javax.swing.JTable table;
	// End of variables declaration//GEN-END:variables

}