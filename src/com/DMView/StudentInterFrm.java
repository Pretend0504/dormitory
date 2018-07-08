/*
 * StudentInterFrm.java
 *
 * Created on __DATE__, __TIME__
 */

package com.DMView;

import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import com.DMModel.Room;
import com.DMModel.Student;
import com.DMUtil.DMUtil;
import com.Dao.RoomDao;
import com.Dao.StudentDao;

/**
 *
 * @author  __USER__
 */
public class StudentInterFrm extends javax.swing.JInternalFrame {
	DMUtil dmutil = new DMUtil();
	RoomDao roomdao = new RoomDao();
	StudentDao studentdao = new StudentDao();

	/** Creates new form StudentInterFrm */
	public StudentInterFrm() {
		initComponents();
		this.setLocation(200, 50);
		this.fillTable();
		this.jb_man.setSelected(true);
	}

	public void fillTable() {
		Connection con = null;
		Student student = null;
		Room room = new Room();
		try {
			con = dmutil.getCon();
			ResultSet rs = roomdao.roomList(con, room);
			Room room2 = new Room();
			room2.setMember("��ѡ��...");
			room2.setId(-1 + "");
			this.jcb_room.addItem(room2);
			while (rs.next()) {
				room = new Room();
				room.setId(rs.getInt("id") + "");
				room.setMember(rs.getString("member"));
				room.setLeader(rs.getString("leader"));
				this.jcb_room.addItem(room);
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

buttonGroup1 = new javax.swing.ButtonGroup();
jLabel1 = new javax.swing.JLabel();
nameTxt = new javax.swing.JTextField();
jLabel2 = new javax.swing.JLabel();
jb_man = new javax.swing.JRadioButton();
jb_women = new javax.swing.JRadioButton();
jLabel3 = new javax.swing.JLabel();
jLabel4 = new javax.swing.JLabel();
jLabel5 = new javax.swing.JLabel();
jLabel6 = new javax.swing.JLabel();
jb_regist = new javax.swing.JButton();
jb_exit = new javax.swing.JButton();
jcb_room = new javax.swing.JComboBox();
jLabel7 = new javax.swing.JLabel();
xibieTxt = new javax.swing.JTextField();
classTxt = new javax.swing.JTextField();
bedTxt = new javax.swing.JTextField();

setClosable(true);
setIconifiable(true);
setResizable(true);
setTitle("\u5b66\u751f\u767b\u8bb0");

jLabel1.setText("\u59d3\u540d\uff1a");

jLabel2.setText("\u6027\u522b\uff1a");

buttonGroup1.add(jb_man);
jb_man.setText("\u7537");

buttonGroup1.add(jb_women);
jb_women.setText("\u5973");

jLabel3.setText("\u7cfb\u522b\uff1a");

jLabel4.setText("\u73ed\u7ea7\uff1a");

jLabel5.setText("\u5bdd\u5ba4\u53f7\uff1a");

jLabel6.setText("\u5e8a\u53f7\uff1a");

jb_regist.setIcon(new javax.swing.ImageIcon("D:\\Myelipse\\images4\\add.png")); // NOI18N
jb_regist.setText("\u767b\u8bb0");
jb_regist.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jb_registActionPerformed(evt);
}
});

jb_exit.setIcon(new javax.swing.ImageIcon("D:\\Myelipse\\images4\\exit.png")); // NOI18N
jb_exit.setText("\u9000\u51fa");
jb_exit.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jb_exitActionPerformed(evt);
}
});


jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Documents and Settings\\Administrator\\����\\��ֽ.jpg")); // NOI18N
//jLabel7.setText("jLabel7");

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jLabel6)
.addGap(192, 192, 192))
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel1)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel2)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jb_man, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jb_women, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel4)
.addGap(20, 20, 20))
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel5)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
.addComponent(jLabel3))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(jcb_room, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(bedTxt)
.addComponent(classTxt)
.addComponent(xibieTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jb_regist))
.addGroup(layout.createSequentialGroup()
.addGap(125, 125, 125)
.addComponent(jb_exit)))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(32, 32, 32))
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(layout.createSequentialGroup()
.addGap(26, 26, 26)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel1)
.addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(32, 32, 32)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel2)
.addComponent(jb_man)
.addComponent(jb_women))
.addGap(29, 29, 29)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel3)
.addComponent(xibieTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(26, 26, 26)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel4)
.addComponent(classTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(30, 30, 30)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel6)
.addComponent(bedTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(29, 29, 29)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel5)
.addComponent(jcb_room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(jb_regist)
.addComponent(jb_exit))))
.addContainerGap(18, Short.MAX_VALUE))
);

pack();
}// </editor-fold>

	//GEN-END:initComponents
	private void jb_registActionPerformed(java.awt.event.ActionEvent evt) {
		String name = nameTxt.getText();
		String xibie = xibieTxt.getText();
		String classroom = classTxt.getText();
		String bed = bedTxt.getText();
		String sex = "";
		if (jb_man.isSelected()) {
			sex = "��";
		} else if (jb_women.isSelected()) {
			sex = "Ů";
		}
		Room room = (Room) this.jcb_room.getSelectedItem();
		String dormitory = room.getId();
		Connection con = null;
		try {
			con = dmutil.getCon();
			Student student = new Student(name, sex, xibie, classroom,
					Integer.parseInt(dormitory), Integer.parseInt(bed));
			int a = studentdao.StudentAdd(con, student);
			if (a == 1) {
				JOptionPane.showMessageDialog(null, "�Ǽǳɹ���");
				this.resetValue();
			} else {
				JOptionPane.showMessageDialog(null, "�Ǽ�ʧ�ܣ�");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "�Ǽ�ʧ�ܣ�");
			e.printStackTrace();
		}
	}

	private void resetValue() {
		nameTxt.setText("");
		xibieTxt.setText("");
		classTxt.setText("");
		bedTxt.setText("");
		this.jb_man.setSelected(true);
		this.jcb_room.setSelectedIndex(0);

	}

	private void jb_exitActionPerformed(java.awt.event.ActionEvent evt) {
		int result = JOptionPane.showConfirmDialog(null, "�Ƿ��˳�ϵͳ");
		if (result == 0) {
			this.dispose();
		}
	}

	
	private javax.swing.JTextField bedTxt;
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.JTextField classTxt;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JButton jb_exit;
	private javax.swing.JRadioButton jb_man;
	private javax.swing.JButton jb_regist;
	private javax.swing.JRadioButton jb_women;
	private javax.swing.JComboBox jcb_room;
	private javax.swing.JTextField nameTxt;
	private javax.swing.JTextField xibieTxt;
	

}