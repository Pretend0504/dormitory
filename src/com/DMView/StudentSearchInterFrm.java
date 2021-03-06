/*
 * StudentSearchInterFrm.java
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
import com.DMUtil.StringUtil;
import com.Dao.RoomDao;
import com.Dao.StudentDao;

/**
 *
 * @author  __USER__
 */
public class StudentSearchInterFrm extends javax.swing.JInternalFrame {
	DMUtil dmutil = new DMUtil();
	RoomDao roomdao = new RoomDao();
	StudentDao studentdao = new StudentDao();

	/** Creates new form StudentSearchInterFrm */
	public StudentSearchInterFrm() {
		initComponents();
		this.setLocation(5, 50);
		this.fillRoom();
		this.jb_man.setSelected(true);
	}

	public void fillRoom() {
		Connection con = null;
		Room room = new Room();
		try {
			con = dmutil.getCon();
			ResultSet rs = roomdao.roomList(con, room);
			Room room2 = new Room();
			room2.setMember("��ѡ��...");
			room2.setId(-1 + "");
			this.jcb_roomnum.addItem(room2);
			while (rs.next()) {
				room = new Room();
				room.setId(rs.getInt("id") + "");
				room.setMember(rs.getString("member"));
				room.setLeader(rs.getString("leader"));
				this.jcb_roomnum.addItem(room);
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
				v.add(rs.getString("member"));
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

buttonGroup1 = new javax.swing.ButtonGroup();
jPanel1 = new javax.swing.JPanel();
jLabel1 = new javax.swing.JLabel();
nameTxt = new javax.swing.JTextField();
jLabel2 = new javax.swing.JLabel();
xibieTxt = new javax.swing.JTextField();
jLabel3 = new javax.swing.JLabel();
jb_man = new javax.swing.JRadioButton();
jb_women = new javax.swing.JRadioButton();
jLabel4 = new javax.swing.JLabel();
jcb_roomnum = new javax.swing.JComboBox();
jb_search = new javax.swing.JButton();
jLabel5 = new javax.swing.JLabel();
classTxt = new javax.swing.JTextField();
jLabel6 = new javax.swing.JLabel();
bednumTxt = new javax.swing.JTextField();
jScrollPane1 = new javax.swing.JScrollPane();
table = new javax.swing.JTable();

setClosable(true);
setIconifiable(true);

jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("\u641c\u7d22\u64cd\u4f5c"));

jLabel1.setText("\u59d3\u540d\uff1a");

jLabel2.setText("\u9662\u7cfb\uff1a");

jLabel3.setText("\u6027\u522b\uff1a");

jb_man.setText("\u7537");

jb_women.setText("\u5973");

jLabel4.setText("\u5bdd\u5ba4\u53f7\uff1a");


jb_search.setIcon(new javax.swing.ImageIcon("D:\\Myelipse\\images4\\search.png")); // NOI18N
jb_search.setText("\u67e5\u8be2");
jb_search.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jb_searchActionPerformed(evt);
}
});

jLabel5.setText("\u73ed\u7ea7\uff1a");

jLabel6.setText("\u5e8a\u53f7\uff1a");

javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
jPanel1.setLayout(jPanel1Layout);
jPanel1Layout.setHorizontalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
.addContainerGap()
.addComponent(jLabel1)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jLabel2)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(xibieTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jLabel5)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(classTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jLabel6)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(bednumTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jLabel3)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jb_man, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jb_women, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jLabel4)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jcb_roomnum, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(28, 28, 28)
.addComponent(jb_search))
);
jPanel1Layout.setVerticalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addContainerGap()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel4)
.addComponent(jcb_roomnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jb_search)
.addComponent(jLabel1)
.addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel2)
.addComponent(jb_man)
.addComponent(jb_women)
.addComponent(jLabel3)
.addComponent(xibieTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel5)
.addComponent(classTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel6)
.addComponent(bednumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addContainerGap(28, Short.MAX_VALUE))
);

table.setModel(new javax.swing.table.DefaultTableModel(
	new Object [][] {
		
	},
	new String [] {
		"���", "����", "�Ա�", "Ժϵ", "�༶", "���Һ�", "����"
	}
) {
	boolean[] canEdit = new boolean [] {
		false, false, false, false, false, false, false
	};

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return canEdit [columnIndex];
	}
});
jScrollPane1.setViewportView(table);

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
.addContainerGap()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE))
.addContainerGap())
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap(175, Short.MAX_VALUE))
);

pack();
}// </editor-fold>

	//GEN-END:initComponents
	private void jb_searchActionPerformed(java.awt.event.ActionEvent evt) {
		String name = nameTxt.getText();
		String xibie = xibieTxt.getText();
		String sex = "";
		if (jb_man.isSelected()) {
			sex = "��";
		} else if (jb_women.isSelected()) {
			sex = "Ů";
		}
		String classroom = classTxt.getText();

		Room room = (Room) jcb_roomnum.getSelectedItem();
		String dormitory = room.getId();
		Student student = new Student(name, sex, xibie, classroom,
				Integer.parseInt(dormitory));
		this.fillTable(student);
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JTextField bednumTxt;
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.JTextField classTxt;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JRadioButton jb_man;
	private javax.swing.JButton jb_search;
	private javax.swing.JRadioButton jb_women;
	private javax.swing.JComboBox jcb_roomnum;
	private javax.swing.JTextField nameTxt;
	private javax.swing.JTable table;
	private javax.swing.JTextField xibieTxt;
	// End of variables declaration//GEN-END:variables

}