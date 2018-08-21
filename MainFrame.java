import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorListener;
import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import java.awt.Dimension;
import java.awt.GridLayout;

public class MainFrame extends JFrame 
 {
	public JPanel p_loginframe = new JPanel();
	public JPanel p_userframe = new JPanel();
	public JPanel p_userprofile = new JPanel();
	public JPanel p_employeelist = new JPanel();
	public JPanel p_inventorylist = new JPanel();
	public JPanel p_billinglist = new JPanel();
	
	JLabel l_name = new JLabel ("Employee Name: ");
	JLabel l_address = new JLabel ("Address: ");
	JLabel l_phoneno = new JLabel ("Phone No: ");
	JLabel l_id = new JLabel ("ID: ");
	JLabel l_post = new JLabel ("Post: ");
	JLabel l_options = new JLabel ("Options");
	
	JLabel options = new JLabel ("Options");
	
	JButton b_options_update = new JButton("Update");
	
	ImageIcon logout = new ImageIcon ("C:\\Users\\Govinda\\Desktop\\Java Practise\\java Project\\logout.png");
	JButton b_logout = new JButton ("Logout",logout);
	ImageIcon back = new ImageIcon ("C:\\Users\\Govinda\\Desktop\\Java Practise\\java Project\\back.png");
	JButton b_back = new JButton ("Back",back);
	
	
	JLabel l_food_menu = new JLabel("Food Menu");
	JLabel l_item_name1 = new JLabel("Item Name");
	JLabel l_quantity_1 = new JLabel ("Quantity");
	JLabel l_quantity_2 = new JLabel ("Quantity");
	//JLabel l_vat = new JLabel ("VAT");
	//JLabel l_vat15 = new JLabel ("15%");
	JLabel l_total_1 = new JLabel ("Total=");
	JLabel l_total_2 = new JLabel ("Total=");
	JLabel l_cash_given = new JLabel ("Cash Given=");
	JLabel l_change = new JLabel ("Change=");
	JLabel l_reciept = new JLabel ("Reciept");
	JLabel l_item_name2 = new JLabel ("Item Name");
	JLabel l_star = new JLabel ("*");
	JLabel l_price_1 = new JLabel ("Price");
	JLabel l_price_2 = new JLabel ("Price");
	JLabel l_menumsg = new JLabel ("Click to Insert Your Food");
	JLabel l_back = new JLabel ("Back");
	JLabel l_logout = new JLabel ("Logout");
	
	
	JTextField t_quantity = new JTextField("",10);
	JTextField t_cash_given = new JTextField ("",10);
	JTextField t_change = new JTextField ("",10);
	
	
	JLabel name = new JLabel ("Product name");
	JLabel units = new JLabel ("Units");
	JLabel price = new JLabel ("Price (Per Units)");
	
	JButton options_delete = new JButton("Delete");
	JButton options_edit = new JButton ("Edit");
	
	JLabel l1= new JLabel("WELCOME TO RESTURANT");
	JLabel l2= new JLabel("USER ID");
	JLabel l3= new JLabel("PASSWORD");
	 
	JButton b_login= new JButton("LOGIN");
	JButton b_cancel = new JButton ("CANCEL");
	 
	JTextField t=new JTextField();
	JTextField t1=new JTextField();
	
	
	JLabel l=new JLabel("WELCOME EMPLOYEE");
	
	ImageIcon rest_wallp = new ImageIcon ("C:\\Users\\Govinda\\Desktop\\Java Practise\\java Project\\restaurant.jpg");
	JLabel l_rest_wallp = new JLabel (rest_wallp);
	
	ImageIcon userpro = new ImageIcon ("C:\\Users\\Govinda\\Desktop\\Java Practise\\java Project\\user profile.png");
	JButton b_userpro= new JButton("USER PROFILE", userpro);
	ImageIcon invlist = new ImageIcon ("C:\\Users\\Govinda\\Desktop\\Java Practise\\java Project\\inventory list.png");
	JButton b_invlist = new JButton("INVENTORY LIST", invlist);
	ImageIcon billinglist = new ImageIcon ("C:\\Users\\Govinda\\Desktop\\Java Practise\\java Project\\billing list.png");
	JButton b_billinglist= new JButton("BILLING LIST", billinglist);
	ImageIcon emplist = new ImageIcon ("C:\\Users\\Govinda\\Desktop\\Java Practise\\java Project\\employee list.png");
	JButton b_emplist = new JButton ("Employee List", emplist);
	ImageIcon chk_burger = new ImageIcon ("C:\\Users\\Govinda\\Desktop\\Java Practise\\java Project\\Chicken Burger.png");
	JButton b_chk_burger = new JButton (chk_burger);
	JLabel l_chk_burger = new JLabel ("Chicken Burger");
	ImageIcon beef_burger = new ImageIcon ("C:\\Users\\Govinda\\Desktop\\Java Practise\\java Project\\Beef Burger.jpg");
	JButton b_beef_burger = new JButton (beef_burger);
	JLabel l_beef_burger = new JLabel ("Beef Burger");
	ImageIcon chk_sandwich = new ImageIcon ("C:\\Users\\Govinda\\Desktop\\Java Practise\\java Project\\Chicken Sandwich.jpg");
	JButton b_chk_sandwich = new JButton (chk_sandwich);
	JLabel l_chk_sandwich = new JLabel ("Chicken Sandwich");
	ImageIcon pasta = new ImageIcon ("C:\\Users\\Govinda\\Desktop\\Java Practise\\java Project\\Pasta.jpg");
	JButton b_pasta = new JButton (pasta);
	JLabel l_pasta = new JLabel ("Pasta");
	ImageIcon thai_soup = new ImageIcon ("C:\\Users\\Govinda\\Desktop\\Java Practise\\java Project\\Thai Soup.jpg");
	JButton b_thai_soup = new JButton (thai_soup);
	JLabel l_thai_soup = new JLabel ("Thai Soup");
	ImageIcon bbq_chicken_pizza = new ImageIcon ("C:\\Users\\Govinda\\Desktop\\Java Practise\\java Project\\bbq_chicken_pizza.jpg");
	JButton b_bbq_chicken_pizza = new JButton (bbq_chicken_pizza);
	JLabel l_bbq_chicken_pizza = new JLabel ("bbq_chicken_pizza");
	ImageIcon Beef_masala = new ImageIcon ("C:\\Users\\Govinda\\Desktop\\Java Practise\\java Project\\Beef_masala.jpg");
	JButton b_Beef_masala = new JButton (Beef_masala);
	JLabel l_Beef_masala = new JLabel ("Beef_masala");
	ImageIcon beef_pizza = new ImageIcon ("C:\\Users\\Govinda\\Desktop\\Java Practise\\java Project\\beef_pizza.jpg");
	JButton b_beef_pizza = new JButton (beef_pizza);
	JLabel l_beef_pizza = new JLabel ("beef_pizza");
	ImageIcon blueberry_cake = new ImageIcon ("C:\\Users\\Govinda\\Desktop\\Java Practise\\java Project\\blueberry_cake.jpg");
	JButton b_blueberry_cake = new JButton (blueberry_cake);
	JLabel l_blueberry_cake = new JLabel ("blueberry_cake");
	
	//b_chk_burger.addActionListener(new ActionSensor(p_billinglist));
	
	
	//JButton b_options_delete = new JButton ("Options");
	//JButton  b_options_edit = new JButton ("Edit");
	
	//JTable table = new JTable();
	//JScrollPane spTable = new JScrollPane(table);
	 String ps;
	
	public JTextField t_username;
	public JTextField t_password;
	public JPanel login;
	
	
	public MainFrame()
	{
		super("Restaurent Management System");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		login = new JPanel();
		setSize(1600,2000);
		login.setSize(1600,2000);
		login.setLayout(null);
		this.add(login);
		b_login.setBounds(300, 200, 100, 40);
	    //b1.setBorder(new RoundedBorder(10)); //10 is the radius
	    b_login.setBackground(new Color(22, 160, 133));
	    b_login.setForeground(new Color(255,255,255));
	    			
		
		l2.setBounds(180,45, 1000, 100);
		l2.setForeground(new Color(0,0,0));
		l2.setFont(new Font("Calibri", Font.BOLD, 16));
		
		l3.setBounds(180,100, 1000, 100);
		l3.setForeground(new Color(0,0,0));
		l3.setFont(new Font("Calibri", Font.BOLD, 16));
		l_rest_wallp.setBounds(10,10, 1000,1800);
		//setLayout (new FlowLayout(true));
		t_username = new JTextField(20);
		t_password = new JTextField(20);
		t_username.setBounds(300,80, 300, 35);
		t_password.setBounds(300,130, 300, 35);
		
		login.add(l2);
		login.add(t_username);
		login.add(l3);
		login.add(t_password);
		login.add(l_rest_wallp);
		
		login.add(b_login);
		//login.add(b_cancel);
		t_username.addActionListener(new MenuAction(login));
		t_password.addActionListener(new MenuAction(login));		

		b_login.addActionListener(new MenuAction(p_userframe));
				
		//getContentPane().setBackground(new Color(231, 76, 60));
		setLocation(100,100);
		setLayout(null);
		update(getGraphics());
		
	}

	
	public class MenuAction implements ActionListener 
	{
		public DataAccess da;
		public ResultSet rs = null;
		public String i,p;
	    public JPanel panel;
	    public MenuAction(JPanel pnl) 
		{
			da = new DataAccess();
	        panel = pnl;
	       
	    }
		

	public void check()throws SQLException 
	{
				
				String id, pass;
				String sql_access = "select emp_id, emp_password from employee_list where emp_id='"+i+"'";
				rs = da.getData(sql_access);
				while(rs.next())
				{
					id = rs.getString("emp_id");
					ps=rs.getString("emp_id");
					pass = rs.getString("emp_password");
					if (id.equals(i) && pass.equals(p))
					{
						change_p_userframe(panel);
					System.out.println("Logged In");
					}
					else
					{

						/*wrong_info.setSize(100,100);
						//setLayout(100,100);
						JLabel msg = new JLabel ("You Have Entered wrong user name and password");
						JButton ok = new JButton ("OK");
						add(wrong_info);
						add(msg);
						add(ok);
						
						
					} */
						System.out.println("Wrong ID or Password");
				}
				rs.close();
		}	
	}
		
	@Override
	public void actionPerformed(ActionEvent e)
		{
			
			
	    	if (this.panel ==  p_userprofile) 
			{
	    		change_p_userprofile(panel);
	    	}
	    	if (this.panel == p_billinglist) 
			{
				//ps = t_username.getText();
				if(ps == "12542")
				{
					JOptionPane.showMessageDialog(null, "Access Denied");
				}
				else
				{
					change_p_billinglist(panel);
				}
			}
	    	if (this.panel ==  p_employeelist) 
			{
	    		change_p_employeelist(panel);
	    	}
	    	if (this.panel ==  p_inventorylist) 
			{
	    		change_p_inventorylist(panel);
	    	}
			
			if (this.panel == p_loginframe)
			{
				change_p_loginframe(panel);
			}
			if (this.panel == p_userframe)
			{
				i = t_username.getText();
				p = t_password.getText();
				try{
				check();
				}
				catch(Exception x){}
				
				
			//	System.out.println(u);
			//	System.out.println(p);
				
				
			}

	}
 }
 class TableDemo extends JPanel {
    private boolean DEBUG = false;
 
    public TableDemo() {
        super(new GridLayout(1,0));
 
        JTable table = new JTable(new MyTableModel());
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);
 
        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);
 
        //Add the scroll pane to this panel.
        add(scrollPane);
    }
 
    class MyTableModel extends AbstractTableModel {
        public String[] columnNames = {"Employee Name",
                                        "Employee ID",
                                        "Address",
                                        "Phone No",
                                        };
        public Object[][] data = {
        {"Kathy", "Smith",
         "Snowboarding", new Integer(5) },
        {"John", "Doe",
         "Rowing", new Integer(3) },
        {"Sue", "Black",
         "Knitting", new Integer(2) },
        {"Jane", "White",
         "Speed reading", new Integer(20) },
        {"Joe", "Brown",
         "Pool", new Integer(10)}
        };
 
        public int getColumnCount() {
            return columnNames.length;
        }
 
        public int getRowCount() {
            return data.length;
        }
 
        public String getColumnName(int col) {
            return columnNames[col];
        }
 
        public Object getValueAt(int row, int col) {
            return data[row][col];
        }
 
        /*
         * JTable uses this method to determine the default renderer/
         * editor for each cell.  If we didn't implement this method,
         * then the last column would contain text ("true"/"false"),
         * rather than a check box.
         */
        public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
        }
 
        /*
         * Don't need to implement this method unless your table's
         * editable.
         */
        public boolean isCellEditable(int row, int col) {
            //Note that the data/cell address is constant,
            //no matter where the cell appears onscreen.
            if (col < 2) {
                return false;
            } else {
                return true;
            }
        }
 
       
        public void setValueAt(Object value, int row, int col) {
            if (DEBUG) {
                System.out.println("Setting value at " + row + "," + col
                                   + " to " + value
                                   + " (an instance of "
                                   + value.getClass() + ")");
            }
 
            data[row][col] = value;
            fireTableCellUpdated(row, col);
 
            if (DEBUG) {
                System.out.println("New value of data:");
                printDebugData();
            }
        }
 
        public void printDebugData() {
            int numRows = getRowCount();
            int numCols = getColumnCount();
 
            for (int i=0; i < numRows; i++) {
                System.out.print("    row " + i + ":");
                for (int j=0; j < numCols; j++) {
                    System.out.print("  " + data[i][j]);
                }
                System.out.println();
            }
            System.out.println("--------------------------");
        }
    }
 

    public void createAndShowGUI() {
        //Create and set up the window.
        //JFrame frame = new JFrame("TableDemo");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b_back.setBounds(1350,400,150,80);
		b_logout.setBounds(1490,400,150,80);
		l_back.setBounds(1420,600,80,15);
		l_logout.setBounds(1490,600,80,15);
	
		add(b_logout);
		add(b_back);
		
		b_logout.addActionListener(new MenuAction(p_loginframe));
		b_back.addActionListener(new MenuAction(p_userframe));	
		
		setSize(1700,800);
		setLocation(100,100);
		setLayout(null);
        //Create and set up the content pane.
        TableDemo newContentPane = new TableDemo();
        newContentPane.setOpaque(true); //content panes must be opaque
        setContentPane(newContentPane);
 
        //Display the window.
       // frame.pack();
        //frame.setVisible(true);
		
		
    }
 
    public void table() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    } 
}
public class TableDemo2 extends JPanel {
    private boolean DEBUG = false;
 
    public TableDemo2() {
        super(new GridLayout(1,0));
 
        JTable table = new JTable(new MyTableModel());
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);
 
        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);
 
        //Add the scroll pane to this panel.
        add(scrollPane);
    }
 
    class MyTableModel extends AbstractTableModel {
        public String[] columnNames = {"Employee Name",
                                        "Employee ID",
                                        "Address",
                                        "Phone No",
                                        };
        public Object[][] data = {
        {"Kathy", "Smith",
         "Snowboarding", new Integer(5) },
        {"John", "Doe",
         "Rowing", new Integer(3) },
        {"Sue", "Black",
         "Knitting", new Integer(2) },
        {"Jane", "White",
         "Speed reading", new Integer(20) },
        {"Joe", "Brown",
         "Pool", new Integer(10)}
        };
 
        public int getColumnCount() {
            return columnNames.length;
        }
 
        public int getRowCount() {
            return data.length;
        }
 
        public String getColumnName(int col) {
            return columnNames[col];
        }
 
        public Object getValueAt(int row, int col) {
            return data[row][col];
        }
 
        /*
         * JTable uses this method to determine the default renderer/
         * editor for each cell.  If we didn't implement this method,
         * then the last column would contain text ("true"/"false"),
         * rather than a check box.
         */
        public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
        }
 
        /*
         * Don't need to implement this method unless your table's
         * editable.
         */
        public boolean isCellEditable(int row, int col) {
            //Note that the data/cell address is constant,
            //no matter where the cell appears onscreen.
            if (col < 2) {
                return false;
            } else {
                return true;
            }
        }
 
       
        public void setValueAt(Object value, int row, int col) {
            if (DEBUG) {
                System.out.println("Setting value at " + row + "," + col
                                   + " to " + value
                                   + " (an instance of "
                                   + value.getClass() + ")");
            }
 
            data[row][col] = value;
            fireTableCellUpdated(row, col);
 
            if (DEBUG) {
                System.out.println("New value of data:");
                printDebugData();
            }
        }
 
        public void printDebugData() {
            int numRows = getRowCount();
            int numCols = getColumnCount();
 
            for (int i=0; i < numRows; i++) {
                System.out.print("    row " + i + ":");
                for (int j=0; j < numCols; j++) {
                    System.out.print("  " + data[i][j]);
                }
                System.out.println();
            }
            System.out.println("--------------------------");
        }
    }
 

    public void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("TableDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b_back.setBounds(1350,400,150,80);
		b_logout.setBounds(1490,400,150,80);
		l_back.setBounds(1420,600,80,15);
		l_logout.setBounds(1490,600,80,15);
	
		frame.add(b_logout);
		frame.add(b_back);
		
		b_logout.addActionListener(new MenuAction(p_loginframe));
		b_back.addActionListener(new MenuAction(p_userframe));	
		
		setSize(1700,800);
		setLocation(100,100);
		setLayout(null);
		//setContentPane(newContentPane);
        //Create and set up the content pane.
        TableDemo newContentPane = new TableDemo();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public void table() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    } 
}
	
	public void change_p_userprofile (JPanel panel)
	{
		getContentPane().removeAll();
		
		l_name.setBounds(250,150,100,50);
		l_address.setBounds(250,190,100,50);
		l_phoneno.setBounds(250,230,100,50);
		l_id.setBounds(250,270,100,50);
		l_post.setBounds(250,310,100,50);
		
		
		b_back.setBounds(500,10,150,80);
		b_logout.setBounds(650,10,150,80);
		b_options_update.setBounds(350,450,90,20);
		
		add(l_name);
		add(l_address);
		add(l_phoneno);
		add(l_id);
		add(l_post);
		
		add(b_options_update);
		add(b_back);
		add(b_logout);
		
		b_back.addActionListener(new MenuAction(p_userframe));
		b_logout.addActionListener(new MenuAction(p_loginframe));
		
		setSize(1300,700);
		setLocation(100,100);
		setLayout(null);
		
		getContentPane().add(panel, BorderLayout.CENTER);
	    getContentPane().doLayout();
		update(getGraphics());
	}
	
	public void change_p_userframe (JPanel panel)
	{
		getContentPane().removeAll();
		
		l.setBounds(320,50,300,30);
		l.setFont(new Font("Calibri", Font.BOLD, 20));
		
		b_userpro.setBounds(300,150,200,80);
		b_invlist.setBounds(300,250,200,80);
		b_emplist.setBounds(300,350,200,80);
		b_billinglist.setBounds(300,450,200,80);
		b_logout.setBounds(300,550,200,80);
		
	
		add(b_userpro);
		add(b_invlist);		
		add(b_emplist);	
		add(b_billinglist);	
		add(b_logout);		
		add(l);
		
		b_userpro.addActionListener(new MenuAction(p_userprofile));
		b_invlist.addActionListener(new MenuAction(p_inventorylist));
		b_emplist.addActionListener(new MenuAction(p_employeelist));
		b_billinglist.addActionListener(new MenuAction(p_billinglist));
		b_logout.addActionListener(new MenuAction(p_loginframe));		
		
		setSize(800,800);
		setLocation(100,100);
		setLayout(null);
		setVisible (true);
		//setLayout (new FlowLayout(null));
		
		getContentPane().add(panel, BorderLayout.CENTER);
	    getContentPane().doLayout();
		update(getGraphics());
	}

	public void change_p_loginframe (JPanel panel)
	{
		getContentPane().removeAll();
		
		
		b_login.setBounds(250, 200, 100, 40);
	    //b1.setBorder(new RoundedBorder(10)); //10 is the radius
	    b_login.setBackground(new Color(22, 160, 133));
	    b_login.setForeground(new Color(255,255,255));
	    			
	    b_cancel.setBounds(370, 200, 100, 40);
	    //b2.setBorder(new RoundedBorder(10)); //10 is the radius
		b_cancel.setBackground(new Color(22, 160, 133));
		b_cancel.setForeground(new Color(255,255,255));
		
		l2.setBounds(80,50, 1000, 100);
		l2.setForeground(new Color(0,0,0));
		l2.setFont(new Font("Courier New", Font.BOLD, 16));
		
		l3.setBounds(80,100, 1000, 100);
		l3.setForeground(new Color(0,0,0));
		l3.setFont(new Font("Courier New", Font.BOLD, 16));
		t_username = new JTextField(20);
		t_password = new JTextField(20);
		t_username.setBounds(300,80, 300, 35);
		t_password.setBounds(300,130, 300, 35);
		
		l_rest_wallp.setBounds(10,10, 1000,1800);
		

		
		add(l2);
		add(t_username);
		add(l3);
		add(t_password);
		
		add(b_login);
		add(l_rest_wallp);
		
		b_login.addActionListener(new MenuAction(p_userframe));
		//b_cancel.addActionListener(new MenuAction2(this));	

		setSize(1600,2000);
		setLocation(100,100);
		//setLayout(null); 
		
		getContentPane().add(panel, BorderLayout.CENTER);
	    getContentPane().doLayout();
		update(getGraphics());
	}
	
	public void change_p_employeelist (JPanel panel)
	{
		
		getContentPane().removeAll();
		
		
		TableDemo td = new TableDemo();
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
         public void run() {
        //JFrame frame = new JFrame("TableDemo");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        TableDemo newContentPane = new TableDemo();
        newContentPane.setOpaque(true); //content panes must be opaque
       setContentPane(newContentPane);
 
        //Display the window.
        /*frame.pack();
        frame.setVisible(true); */
            }
        });
		
		/*l_name.setBounds(100,50,190,20);
		l_id.setBounds(400,50,190,20);
		l_address.setBounds(600,50,190,20);
		l_phoneno.setBounds(950,50,190,20);
		l_options.setBounds(1100,50,190,20);
		l_back.setBounds(1420,60,80,15);
		l_logout.setBounds(1490,60,80,15); */
		
		//b_options_delete.setBounds(1100,70,90,20);
		//b_options_edit.setBounds(1190,70,90,20);
		
		b_back.setBounds(1370,10,150,80);
		b_logout.setBounds(1520,10,150,80);
		
		//add(l_name);
		//add(l_address);
		//add(l_phoneno);
		//add(l_options);
		//add(l_id);
		//add(l_back);
		//add(l_logout);
		
		//add(b_options_delete);
		//add(b_options_edit);
		
		add(b_back);
		add(b_logout);
		
		b_logout.addActionListener(new MenuAction(p_loginframe));
		b_back.addActionListener(new MenuAction(p_userframe));
		
		setSize(1700,900);
		setLocation(100,100);
		setLayout(null);				
		
		getContentPane().add(panel, BorderLayout.CENTER);
	    getContentPane().doLayout();
		update(getGraphics());
		
	}
	
	public void change_p_inventorylist (JPanel panel)
	{
		getContentPane().removeAll();
		
		/*name.setBounds(100,50,190,20);
		units.setBounds(400,50,190,20);
		price.setBounds(500,50,190,20);
		options.setBounds(600,50,190,20);
		options_delete.setBounds(600,70,90,20);
		options_edit.setBounds(700,70,90,20);*/
		
		TableDemo2 td = new TableDemo2();
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
         public void run() {
        //JFrame frame = new JFrame("TableDemo");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        TableDemo2 newContentPane = new TableDemo2();
        newContentPane.setOpaque(true); //content panes must be opaque
		setContentPane(newContentPane);
		
		/* b_back.setBounds(1350,400,150,80);
		b_logout.setBounds(1490,400,150,80);
		l_back.setBounds(1420,600,80,15);
		l_logout.setBounds(1490,600,80,15);
	
		add(b_logout);
		add(b_back);
		
		b_logout.addActionListener(new MenuAction(p_loginframe));
		b_back.addActionListener(new MenuAction(p_userframe));	
		
		setSize(1700,800);
		setLocation(100,100);
		setLayout(null);
		setContentPane(newContentPane);
        //Display the window.
        /*frame.pack();
        frame.setVisible(true); */
            }
        });
		
		
	
		//add(name);
		//add(units);
		//add(price);
		//add(options);
		//add(l_back);
		//add(l_logout);
		//add(options_delete);
		//add(options_edit);
		
		
		getContentPane().add(panel, BorderLayout.CENTER);
	    getContentPane().doLayout();
		update(getGraphics());
	}
	
	public void change_p_billinglist (JPanel panel)
	{
		getContentPane().removeAll();
		
		l_item_name1.setBounds(100,50,120,20);
		l_quantity_1.setBounds(300,50,250,20);
		l_price_1.setBounds(410,50,250,20);
		//l_vat.setBounds(400,50,50,20);
		//l_vat15.setBounds(400,100,50,20);
		l_total_1.setBounds(310,450,250,20);
		l_total_2.setBounds(310,900,250,20);
		l_cash_given.setBounds(310,480,250,20);
		l_change.setBounds(310,510,250,20);
		l_item_name2.setBounds(100,545,250,20);
		l_star.setBounds(250,547,350,20);
		l_quantity_2.setBounds(310,545,250,20);	
		l_price_2.setBounds(410,545,250,20);
			
		l_back.setBounds(1420,60,80,15);
		l_logout.setBounds(1490,60,80,15);	
		l_food_menu.setBounds(1200,170,90,20);
		l_food_menu.setFont(new Font("Calibri", Font.BOLD, 16));

		
		t_cash_given.setBounds(390,480,100,20);
		t_quantity.setBounds(300,70,50,25);
		t_change.setBounds(390,510,100,20);	
		
		b_back.setBounds(1370,10,150,80);
		b_logout.setBounds(1520,10,150,80);
		
//food items:		
		b_chk_burger.setBounds(1200,200,120,100);
		l_chk_burger.setBounds(1220,260,100,100);
		b_beef_burger.setBounds(1330,200,120,100);
		l_beef_burger.setBounds(1330,260,100,100);
		b_pasta.setBounds(1460,200,120,100);
		l_pasta.setBounds(1500,260,100,100);
		b_thai_soup.setBounds(1590,200,120,100);
		l_thai_soup.setBounds(1620,260,100,100);
		b_chk_sandwich.setBounds(1720,200,120,100);
		l_chk_sandwich.setBounds(1720,260,100,100);
		b_Beef_masala.setBounds(1200,350,120,100);
		l_Beef_masala.setBounds(1220,410,100,100);
		b_bbq_chicken_pizza.setBounds(1330,350,120,100);
		l_bbq_chicken_pizza.setBounds(1330,410,100,100);
		b_blueberry_cake.setBounds(1460,350,120,100);
		l_blueberry_cake.setBounds(1500,410,100,100);
		
		add(l_food_menu);
		add(l_item_name1);
		add(l_quantity_1);
		add(l_quantity_2);

		add(l_total_1);
		add(l_total_2);
		add(l_cash_given);
		add(l_change);
		add(l_reciept);
		add(l_item_name2);
		add(l_star);
		add(l_price_1);
		add(l_price_2);
		add(l_menumsg);
		add(l_chk_burger);
		add(l_beef_burger);
		add(l_chk_sandwich);
		add(l_pasta);
		add(l_thai_soup);
		add(l_Beef_masala);
		add(l_bbq_chicken_pizza);
		add(l_blueberry_cake);
		
		add(t_quantity);
		add(t_cash_given);
		add(t_change);	
		add(t_quantity);
		add(t_cash_given);
		add(t_change);
		
		add(b_chk_burger);
		add(b_beef_burger);
		add(b_chk_sandwich);
		add(b_pasta);
		add(b_thai_soup);
		add(b_back);
		add(b_logout);
		add(b_Beef_masala);
		add(b_bbq_chicken_pizza);
		add(b_blueberry_cake);
		
		
		b_logout.addActionListener(new MenuAction(p_loginframe));
		b_back.addActionListener(new MenuAction(p_userframe));	
		
		setSize(1900,1700);
		setLocation(100,100);
		setLayout(null);
		
		getContentPane().add(panel, BorderLayout.CENTER);
	    getContentPane().doLayout();
		update(getGraphics());
	}
	
 }
 
 




/*class ActionSensor extends ActionListener{
		JPanel p;
		String q;
		String food1 = "Chicken Burger";
		String item1,price1;
		public ActionSensor(JPanel pa){
				p = pa;
		}
		public void actionPerformed(){
			DataAccess da = new DataAccess();
			ResultSet rs;
			q = "select * from inventory_list where item_name='"+food1+"'";
			rs = da.getData(q);
			while(rs.next()){
				item1 = rs.getString("");
				price1 = rs.getString("");
				if (item1 == food1)
					itemadd();
			}
		}
		public void itemadd(){
			JLabel iteml1 = new JLabel(item1);
			iteml1.setBounds(100,60,120,20);
			JLabel itemp1 = new JLabel(price1);
			itemp1.setBounds(410,70,250,20);
			p.add(iteml1);
			p.add(itemp1);
		}
		
	} */