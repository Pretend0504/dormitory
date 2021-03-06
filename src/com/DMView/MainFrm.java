/*
 * MainFrm.java
 *
 * Created on __DATE__, __TIME__
 */

package com.DMView;

import javax.swing.JOptionPane;

/**
 *
 * @author  __USER__
 */
public class MainFrm extends javax.swing.JFrame {

	/** Creates new form MainFrm */
	public MainFrm() {
		initComponents();
		this.setExtendedState(MAXIMIZED_BOTH);
	}

	private void initComponents() {

		jMenuBar2 = new javax.swing.JMenuBar();
		jMenu3 = new javax.swing.JMenu();
		jMenu4 = new javax.swing.JMenu();
		jMenuBar3 = new javax.swing.JMenuBar();
		jMenu5 = new javax.swing.JMenu();
		jMenu6 = new javax.swing.JMenu();
		table = new javax.swing.JDesktopPane();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuItem3 = new javax.swing.JMenuItem();
		jMenu9 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenuItem5 = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();
		jMenuItem4 = new javax.swing.JMenuItem();
		enter = new javax.swing.JMenuItem();
		jMenu7 = new javax.swing.JMenu();
		jMenuItem6 = new javax.swing.JMenuItem();
		jMenuItem7 = new javax.swing.JMenuItem();
		jMenu8 = new javax.swing.JMenu();
		jMenuItem8 = new javax.swing.JMenuItem();
		exit = new javax.swing.JMenuItem();

		jMenu3.setText("File");
		jMenuBar2.add(jMenu3);

		jMenu4.setText("Edit");
		jMenuBar2.add(jMenu4);

		jMenu5.setText("File");
		jMenuBar3.add(jMenu5);

		jMenu6.setText("Edit");
		jMenuBar3.add(jMenu6);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u5b66\u751f\u5bbf\u820d\u7ba1\u7406\u7cfb\u7edf");

		jMenu1.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\bookTypeManager.png")); 
		jMenu1.setText("\u623f\u95f4\u7ba1\u7406");

		jMenuItem2.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\modify.png")); 
		jMenuItem2.setText("\u623f\u95f4\u4fe1\u606f\u4fee\u6539");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem2);

		jMenuItem3.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\delete.png")); 
		jMenuItem3.setText("\u623f\u95f4\u5220\u9664");
		jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem3ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem3);

		jMenuBar1.add(jMenu1);

		jMenu9.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\bookManager.png")); 
		jMenu9.setText("\u5b66\u751f\u4fe1\u606f\u7ba1\u7406");

		jMenuItem1.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\modify.png")); 
		jMenuItem1.setText("\u5b66\u751f\u4fe1\u606f\u4fee\u6539");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu9.add(jMenuItem1);

		jMenuItem5.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\delete.png")); 
		jMenuItem5.setText("\u5b66\u751f\u4fe1\u606f\u5220\u9664");
		jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem5ActionPerformed(evt);
			}
		});
		jMenu9.add(jMenuItem5);

		jMenuBar1.add(jMenu9);

		jMenu2.setIcon(new javax.swing.ImageIcon(
				"C:\\Documents and Settings\\Administrator\\桌面\\寝室管理.jpg")); // NOI18N
		jMenu2.setText("\u4f4f\u5bbf\u7ba1\u7406");

		jMenuItem4.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\bookManager.png")); 
		jMenuItem4.setText("\u5bdd\u5ba4\u7ba1\u7406");
		jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem4ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem4);

		enter.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images3\\add.png")); // NOI18N
		enter.setText(" \u529e\u7406\u5165\u4f4f");
		enter.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				enterActionPerformed(evt);
			}
		});
		jMenu2.add(enter);

		jMenuBar1.add(jMenu2);

		jMenu7.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\search.png")); 
		jMenu7.setText("\u4fe1\u606f\u67e5\u8be2");

		jMenuItem6.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\search.png")); 
		jMenuItem6.setText("\u4eba\u7269\u67e5\u8be2");
		jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem6ActionPerformed(evt);
			}
		});
		jMenu7.add(jMenuItem6);

		jMenuItem7.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\search.png")); 
		jMenuItem7.setText("\u623f\u95f4\u67e5\u8be2");
		jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem7ActionPerformed(evt);
			}
		});
		jMenu7.add(jMenuItem7);

		jMenuBar1.add(jMenu7);

		jMenu8.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\me.png")); 
		jMenu8.setText("\u5e2e\u52a9");

		jMenuItem8.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images2\\images\\about.png"));
		jMenuItem8.setText("\u5173\u4e8e");
		jMenu8.add(jMenuItem8);

		exit.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images3\\exit.png"));
		exit.setText("\u9000\u51fa\u7cfb\u7edf");
		exit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				exitActionPerformed(evt);
			}
		});
		jMenu8.add(exit);

		jMenuBar1.add(jMenu8);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(table,
				javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(table,
				javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE));

		pack();
	}
	//GEN-END:initComponents

	private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
		StudentDeleteInterFrm StudentDelete = new StudentDeleteInterFrm();
		StudentDelete.setVisible(true);
		this.table.add(StudentDelete);
	}

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		StudentModifyInterFrm StudentModify = new StudentModifyInterFrm();
		StudentModify.setVisible(true);
		this.table.add(StudentModify);
	}

	private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
		StudentSearchInterFrm StudentSearch = new StudentSearchInterFrm();
		StudentSearch.setVisible(true);
		this.table.add(StudentSearch);
	}

	private void enterActionPerformed(java.awt.event.ActionEvent evt) {
		StudentInterFrm Student = new StudentInterFrm();
		Student.setVisible(true);
		this.table.add(Student);
	}

	private void exitActionPerformed(java.awt.event.ActionEvent evt) {
		int a = JOptionPane.showConfirmDialog(null, "确定要退出？");
		if (a == 0) {
			this.dispose();
		}
	}

	private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
		RoomDeleteInterFrm roomDelete = new RoomDeleteInterFrm();
		roomDelete.setVisible(true);
		this.table.add(roomDelete);
	}

	private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {
		RoomSearchInterFrm roomSearch = new RoomSearchInterFrm();
		roomSearch.setVisible(true);
		this.table.add(roomSearch);
	}

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
		RoomManagerInterFrm roommanager = new RoomManagerInterFrm();
		roommanager.setVisible(true);
		this.table.add(roommanager);
	}

	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {

		RoomInterFrm room = new RoomInterFrm();
		room.setVisible(true);
		this.table.add(room);
	}

	
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainFrm().setVisible(true);
			}
		});
	}

	
	// 下面声明变量
	private javax.swing.JMenuItem enter;
	private javax.swing.JMenuItem exit;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenu jMenu5;
	private javax.swing.JMenu jMenu6;
	private javax.swing.JMenu jMenu7;
	private javax.swing.JMenu jMenu8;
	private javax.swing.JMenu jMenu9;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuBar jMenuBar2;
	private javax.swing.JMenuBar jMenuBar3;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenuItem jMenuItem5;
	private javax.swing.JMenuItem jMenuItem6;
	private javax.swing.JMenuItem jMenuItem7;
	private javax.swing.JMenuItem jMenuItem8;
	private javax.swing.JDesktopPane table;
	// 声明变量

}