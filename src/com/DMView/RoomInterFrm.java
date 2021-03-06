/*
 * RoomInterFrm.java
 *
 * Created on __DATE__, __TIME__
 */

package com.DMView;

import java.sql.Connection;

import javax.swing.JOptionPane;

import com.DMModel.Room;
import com.DMUtil.DMUtil;
import com.Dao.RoomDao;

/**
 *
 * @author  __USER__
 */
public class RoomInterFrm extends javax.swing.JInternalFrame {
	DMUtil dmutil = new DMUtil();
	RoomDao roomdao = new RoomDao();

	/** Creates new form RoomInterFrm */
	public RoomInterFrm() {
		initComponents();
		this.setLocation(200, 50);
	}

	
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		dm_number = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		dm_leader = new javax.swing.JTextField();
		jb_add = new javax.swing.JButton();
		jb_reset = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();

		setClosable(true);
		setIconifiable(true);
		setTitle("\u5bbf\u820d\u7ba1\u7406");

		jLabel1.setText("\u5bdd\u5ba4\u53f7\uff1a");

		jLabel2.setText("\u5bdd\u5ba4\u957f\uff1a");

		jb_add.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\add.png")); // NOI18N
		jb_add.setText("\u6dfb\u52a0");
		jb_add.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jb_addActionPerformed(evt);
			}
		});

		jb_reset.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\reset.png")); // NOI18N
		jb_reset.setText("\u91cd\u7f6e");
		jb_reset.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jb_resetActionPerformed(evt);
			}
		});

		jLabel3.setIcon(new javax.swing.ImageIcon(
				"C:\\Documents and Settings\\Administrator\\����\\��������.jpg")); // NOI18N
		//jLabel3.setText("jLabel3");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(22, 22, 22)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		dm_leader,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		121,
																		Short.MAX_VALUE))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel1)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		dm_number,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		121,
																		Short.MAX_VALUE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		jb_add)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jb_reset)))
								.addGap(4, 4, 4)
								.addComponent(jLabel3,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										170,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(25, 25, 25)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(29, 29,
																		29)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel1)
																				.addComponent(
																						dm_number,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(70, 70,
																		70)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel2)
																				.addComponent(
																						dm_leader,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		91,
																		Short.MAX_VALUE)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jb_reset)
																				.addComponent(
																						jb_add)))
												.addGroup(
														javax.swing.GroupLayout.Alignment.LEADING,
														layout.createSequentialGroup()
																.addGap(27, 27,
																		27)
																.addComponent(
																		jLabel3,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		222,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(40, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jb_addActionPerformed(java.awt.event.ActionEvent evt) {
		String name = dm_number.getText();
		String leader = dm_leader.getText();
		Room room = new Room(name, leader);
		Connection con = null;
		try {
			con = dmutil.getCon();
			int a = roomdao.roomAdd(con, room);
			if (a == 1) {
				JOptionPane.showMessageDialog(null, "���ӳɹ���");
				this.resetValue();
			} else {
				JOptionPane.showMessageDialog(null, "����ʧ�ܣ�");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "����ʧ�ܣ�");
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

	private void resetValue() {
		this.dm_leader.setText("");
		this.dm_number.setText("");
	}

	private void jb_resetActionPerformed(java.awt.event.ActionEvent evt) {
		this.dm_number.setText("");
		this.dm_leader.setText("");
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JTextField dm_leader;
	private javax.swing.JTextField dm_number;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JButton jb_add;
	private javax.swing.JButton jb_reset;
	// End of variables declaration//GEN-END:variables

}