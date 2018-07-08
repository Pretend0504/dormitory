/*
 * MainFrm2.java
 *
 * Created on __DATE__, __TIME__
 */

package com.DMView;

import javax.swing.JOptionPane;

/**
 *
 * @author  __USER__
 */
public class MainFrm2 extends javax.swing.JFrame {

	/** Creates new form MainFrm2 */
	public MainFrm2() {
		initComponents();
		this.setExtendedState(MAXIMIZED_BOTH);
	}

	/** 从构造函数内部调用此方法来初始化表单。
	 * 由表单编辑器重新生成
	 */
	
	private void initComponents() {

		table = new javax.swing.JDesktopPane();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuItem3 = new javax.swing.JMenuItem();
		jMenu3 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenuItem4 = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();
		jMenuItem5 = new javax.swing.JMenuItem();
		jMenuItem6 = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u6d4b\u8bd5");

		jMenu1.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\bookTypeManager.png")); // NOI18N
		jMenu1.setText("\u5b66\u751f\u5165\u4f4f");

		jMenuItem2.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\add.png")); // NOI18N
		jMenuItem2.setText("\u529e\u7406\u5165\u4f4f");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem2);

		jMenuItem3.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\modify.png")); // NOI18N
		jMenuItem3.setText("\u4fe1\u606f\u4fee\u6539");
		jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem3ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem3);

		//jMenuBar1.add(jMenu1);

		jMenu3.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\search.png")); // NOI18N
		jMenu3.setText("\u4fe1\u606f\u67e5\u8be2");

		jMenuItem1.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\search.png")); // NOI18N
		jMenuItem1.setText("\u5bdd\u5ba4\u67e5\u8be2");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem1);

		jMenuItem4.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\search.png")); // NOI18N
		jMenuItem4.setText("\u4eba\u5458\u67e5\u8be2");
		jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem4ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem4);

		jMenuBar1.add(jMenu3);

		jMenu2.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\me.png")); // NOI18N
		jMenu2.setText("\u5e2e\u52a9");

		jMenuItem5.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\about.png")); // NOI18N
		jMenuItem5.setText("\u5173\u4e8e");
		jMenu2.add(jMenuItem5);

		jMenuItem6.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\exit.png")); // NOI18N
		jMenuItem6.setText("\u9000\u51fa\u7cfb\u7edf");
		jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem6ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem6);

		jMenuBar1.add(jMenu2);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(table,
				javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(table,
				javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
		int a = JOptionPane.showConfirmDialog(null, "确定要退出？");
		if (a == 0) {
			this.dispose();
		}
	}

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		RoomSearchInterFrm roomSearch = new RoomSearchInterFrm();
		roomSearch.setVisible(true);
		this.table.add(roomSearch);
	}

	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
		StudentSearchInterFrm StudentSearch = new StudentSearchInterFrm();
		StudentSearch.setVisible(true);
		this.table.add(StudentSearch);
	}

	private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
		StudentModifyInterFrm StudentModify = new StudentModifyInterFrm();
		StudentModify.setVisible(true);
		this.table.add(StudentModify);
	}

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
		StudentInterFrm Student = new StudentInterFrm();
		Student.setVisible(true);
		this.table.add(Student);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainFrm2().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenuItem jMenuItem5;
	private javax.swing.JMenuItem jMenuItem6;
	private javax.swing.JDesktopPane table;
	// End of variables declaration//GEN-END:variables

}