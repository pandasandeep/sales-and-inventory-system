import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class Phone2 implements ActionListener
{

JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21;

JFrame F1;

JOptionPane msg;

Connection con;
Statement st,st1;
ResultSet rs;

//JLabel lblheader;

Box vb,hb;

JButton btnclear,btnsave,btnsearch;

 JLabel lbldimen,lblweigh;
 JTextField txtdimen,txtweigh;

JLabel lblos,lblgra;
JTextField txtos,txtgra;

JLabel lblresolu,lbldisplay,lblsize,lblpixel,lbltouch,lblcolor,lblscreen;
JTextField txtresolu,txtdisplay,txtsize,txtpixel,txttouch,txtcolor,txtscreen;

JLabel lblprimary,lblfront,lblvideo;
JTextField txtprimary,txtfront,txtvideo;

JLabel lblinternal,lblram,lblexpandable;
JTextField txtinternal,txtram,txtexpandable;

JLabel lbltype,lblcapacity;
JTextField txttype,txtcapacity;

JLabel lblblue,lblwifi,lblhotspot,lbl3g,lbl4g,lblwired;
JTextField txtblue,txtwifi,txthotspot,txt3g,txt4g,txtwired;

JLabel lbloem,lblcores,lblfrequency,lblgpu;
JTextField txtoem,txtcores,txtfrequency,txtgpu;

JLabel lblprox,lblacc,lblgyro,lblambi;
JTextField txtprox,txtacc,txtgyro,txtambi;

JLabel lblbrand,lblmodel;
JTextField txtbrand,txtmodel;

 public Phone2()
{

	p1 = new JPanel();
	p2 = new JPanel();
	p3 = new JPanel();
	p4 = new JPanel();
    p5 = new JPanel();
    p6 = new JPanel();
	p7 = new JPanel();
	p8 = new JPanel();
	p9 = new JPanel();
	p10 = new JPanel();
	p11 = new JPanel();
	p12 = new JPanel();
	p13 = new JPanel();
	p14 = new JPanel();
	p15 = new JPanel();
	p16 = new JPanel();
	p17 = new JPanel();
	p18 = new JPanel();
	p19 = new JPanel();
	p20 = new JPanel();
    p21 = new JPanel();


p21.setLayout(new FlowLayout());
F1 = new JFrame("SPECIFICATION");

//JLabel lbldimen, lblweigh;
//JTextField txtdimen, txtweigh;

 JLabel lbldesign = new JLabel("(DESIGN AND BUILD)");
 p1.add(lbldesign);
 p1.setLayout(new FlowLayout());

// p2.add(p1);


 lbldimen = new JLabel("Dimensions  ");
txtdimen = new JTextField();
lblweigh = new JLabel("Weight");
txtweigh = new JTextField();
 p2.setLayout(new GridLayout(1,4,5,5));
  p2.add(lbldimen);
  p2.add(txtdimen);
  p2.add(lblweigh);
  p2.add(txtweigh);


//JLabel lblos,lblgra;
//JTextField txtos,txtgra;

JLabel lblsoft = new JLabel("(SOFTWARE)",JLabel.CENTER);
p3.add(lblsoft);
p3.setLayout(new GridLayout());


lblos = new JLabel("Operating System");
txtos = new JTextField();
lblgra = new JLabel("Upgrade");
txtgra = new JTextField();
p4.setLayout(new GridLayout(1,4,5,5));
  p4.add(lblos);
  p4.add(txtos);
  p4.add(lblgra);
  p4.add(txtgra);

//p5.setLayout(new GridLayout(4,1));

//JLabel lblresolu,lbldisplay,lblsize,lblpixel,lbltouch,lblcolor,lblscreen;
//JTextField txtresolu,txtdisplay,txtsize,txtpixel,txttouch,txtcolor,txtscreen;

JLabel lbldis = new JLabel("(DISPLAY)");
p5.add(lbldis);
p5.setLayout(new FlowLayout());


lblresolu = new JLabel("Resolution");
txtresolu = new JTextField();
lbldisplay = new JLabel("Display Type");
txtdisplay = new JTextField();
lblsize = new JLabel("Size (in inches)");
txtsize  = new JTextField();
lblpixel = new JLabel("Pixel Density");
txtpixel = new JTextField();
lbltouch = new JLabel("Touchscreen Type");
txttouch = new JTextField();
lblcolor = new JLabel("Color Reprodution");
txtcolor = new JTextField();
lblscreen = new JLabel("Screen To Body Percentage");
txtscreen = new JTextField();
p6.setLayout(new GridLayout(4,4,5,5));
  p6.add(lblresolu);
  p6.add(txtresolu);
  p6.add(lbldisplay);
  p6.add(txtdisplay);
  p6.add(lblsize);
  p6.add(txtsize);
  p6.add(lblpixel);
  p6.add(txtpixel);
  p6.add(lbltouch);
  p6.add(txttouch);
  p6.add(lblcolor);
  p6.add(txtcolor);
  p6.add(lblscreen);
  p6.add(txtscreen);

//p7.setLayout(new GridLayout(6,1));


//JLabel lblprimary,lblfront,lblvideo;
//JTextField txtprimary,txtfront,txtvideo;

JLabel lblcam = new JLabel("(CAMERA)");
p7.add(lblcam);
p7.setLayout(new FlowLayout());


lblprimary = new JLabel("Primary");
txtprimary = new JTextField();
lblfront = new JLabel("Front");
txtfront = new JTextField();
lblvideo = new JLabel("Video");
txtvideo = new JTextField();
p8.setLayout(new GridLayout(1,6,5,5));

p8.add(lblprimary);
p8.add(txtprimary);
p8.add(lblfront);
p8.add(txtfront);
p8.add(lblvideo);
p8.add(txtvideo);

//p9.setLayout(new GridLayout(8,1));

//JLabel lblinternal,lblram,lblexpandable;
//JTextField txtinternal,txtram,txtexpandable;

JLabel lblstorage = new JLabel("(STORAGE)");
p9.add(lblstorage);
p9.setLayout(new FlowLayout());

lblinternal = new JLabel("Internal");
txtinternal = new JTextField();
lblram = new JLabel("RAM");
txtram = new JTextField();
lblexpandable = new JLabel("Expandable");
txtexpandable = new JTextField();
p10.setLayout(new GridLayout(1,6,5,5));

p10.add(lblinternal);
p10.add(txtinternal);
p10.add(lblram);
p10.add(txtram);
p10.add(lblexpandable);
p10.add(txtexpandable);

//p11.setLayout(new GridLayout(10,1));

//JLabel lbltype,lblcapacity;
//JTextField txttype,txtcapacity;

JLabel lblbatt = new JLabel("(BATTERY)");
p11.add(lblbatt);
p11.setLayout(new FlowLayout());
p19.add(p11);

lbltype = new JLabel("Type");
txttype = new JTextField();
lblcapacity = new JLabel("Capacity");
txtcapacity = new JTextField();
p12.setLayout(new GridLayout(1,4,5,5));

p12.add(lbltype);
p12.add(txttype);
p12.add(lblcapacity);
p12.add(txtcapacity);

//p13.setLayout(new GridLayout(12,1));

//JLabel lblblue,lblwifi,lblhotspot,lbl3g,lbl4g,lblwired;
//JTextField txtblue,txtwifi,txthotspot,txt3g,txt4g,txtwired;

JLabel lblconn = new JLabel("(CONNECTIVITY)");
p13.add(lblconn);
p13.setLayout(new FlowLayout());


lblblue = new JLabel("Bluetooth");
txtblue = new JTextField();
lblwifi = new JLabel("WiFi");
txtwifi = new JTextField();
lblhotspot = new JLabel("Hotspot");
txthotspot = new JTextField();
lbl3g = new JLabel("3G");
txt3g = new JTextField();
lbl4g = new JLabel("4G");
txt4g = new JTextField();
lblwired = new JLabel("Wired");
txtwired = new JTextField();
p14.setLayout(new GridLayout(2,4,5,5));

p14.add(lblblue);
p14.add(txtblue);
p14.add(lblwifi);
p14.add(txtwifi);
p14.add(lblhotspot);
p14.add(txthotspot);
p14.add(lbl3g);
p14.add(txt3g);
p14.add(lbl4g);
p14.add(txt4g);
p14.add(lblwired);
p14.add(txtwired);

//p15.setLayout(new GridLayout(14,1));

//JLabel lbloem,lblcores,lblfrequency,lblgpu;
//JTextField txtoem,txtcores,txtfrequency,txtgpu;

JLabel lblprocessor = new JLabel("(PROCESSOR)");
p15.add(lblprocessor);
p15.setLayout(new FlowLayout());
p19.add(p15);

lbloem= new JLabel("OEM");
txtoem = new JTextField();
lblcores = new JLabel("No. Of Cores");
txtcores = new JTextField();
lblfrequency = new JLabel("Frequency");
txtfrequency = new JTextField();
lblgpu = new JLabel("GPU");
txtgpu = new JTextField();
p16.setLayout(new GridLayout(1,8,6,6));

p16.add(lbloem);
p16.add(txtoem);
p16.add(lblcores);
p16.add(txtcores);
p16.add(lblfrequency);
p16.add(txtfrequency);
p16.add(lblgpu);
p16.add(txtgpu);

//p17.setLayout(new GridLayout(16,1));

//JLabel lblprox,lblacc,lblgyro,lblambi;
//JTextField txtprox,txtacc,txtgyro,txtambi;

JLabel lblsensor = new JLabel("(SENSOR)");
p17.add(lblsensor);
p17.setLayout(new FlowLayout());

lblprox= new JLabel("Proximity");
txtprox = new JTextField();
lblacc = new JLabel("Accelerometer");
txtacc = new JTextField();
lblgyro = new JLabel("Gyroscope");
txtgyro = new JTextField();
lblambi = new JLabel("Ambient Light");
txtambi = new JTextField();
p18.setLayout(new GridLayout(2,4,5,5));

p18.add(lblprox);
p18.add(txtprox);
p18.add(lblacc);
p18.add(txtacc);
p18.add(lblgyro);
p18.add(txtgyro);
p18.add(lblambi);
p18.add(txtambi);

JLabel lblmodel = new JLabel("  ");
p19.add(lblmodel);
p19.setLayout(new FlowLayout());

lblbrand= new JLabel("Brand");
txtbrand = new JTextField();
lblmodel = new JLabel("Model");
txtmodel = new JTextField();
p20.setLayout(new GridLayout(1,4,5,5));

p20.add(lblbrand);
p20.add(txtbrand);
p20.add(lblmodel);
p20.add(txtmodel);


       btnclear=new JButton("CLEAR");
       btnsave=new JButton("SAVE");
       btnsearch=new JButton("SEARCH");
       p21.add(btnclear);
       p21.add(btnsave);
       p21.add(btnsearch);

 vb=Box.createVerticalBox();
          vb.add(Box.createVerticalStrut(10));
          vb.add(p20);
          vb.add(p1);

          vb.add(p2);
            vb.add(Box.createVerticalStrut(10));
          vb.add(p3);
          vb.add(p4);
          vb.add(p5);
          vb.add(p6);
          vb.add(p11);
          vb.add(p12);
          vb.add(p15);
          vb.add(p16);
          vb.add(p17);
          vb.add(p18);


          vb.add(p7);
          vb.add(p8);
          vb.add(p9);
          vb.add(p10);
          vb.add(p13);
          vb.add(p14);
          vb.add(p19);
          vb.add(p21);

          hb=Box.createHorizontalBox();
          hb.add(Box.createHorizontalStrut(50));
          hb.add(vb);
          hb.add(Box.createHorizontalStrut(50));

       btnclear.addActionListener(this);
       btnsave.addActionListener(this);
       btnsearch.addActionListener(this);

  //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  F1.add(hb);

   dbconnect();
//F1.setSize(5000,5000);
         F1.setBounds(92,109,900,550);
           // F1.setResizable(false);
          F1.setVisible(true);
 }

  public void actionPerformed(ActionEvent ae)
       {
         if(ae.getSource() == btnsearch)
		    	 {
		 		String brand;
		 		 brand=txtbrand.getText();

		 		 try
		 		     {
		 		 		rs=st1.executeQuery("select * from phone where Brand=('"+brand+"')");

		 		 if(rs.next())
		 		 {
				 txtmodel.setText(rs.getString("Model"));
		 		 txtdimen.setText(rs.getString("Dimension"));
		 		 txtweigh.setText(rs.getString("weight"));
		 		 txtos.setText(rs.getString("OperatingSystem"));
		 		 txtgra.setText(rs.getString("Upgrade"));
		 		 txtresolu.setText(rs.getString("Resolution"));
		 		 txtdisplay.setText(rs.getString("DisplayType"));
		 		 txtsize.setText(rs.getString("Size(in inches)"));
		 		 txtpixel.setText(rs.getString("PixelDensity"));
		 		 txttouch.setText(rs.getString("Touchscreen"));
		 		 txtcolor.setText(rs.getString("Color"));
		 		 txtscreen.setText(rs.getString("ScreenTo"));
		 		 txtprimary.setText(rs.getString("Primary"));
		 		 txtfront.setText(rs.getString("Front"));
		 		 txtvideo.setText(rs.getString("Video"));
		 		 txtinternal.setText(rs.getString("Internal"));
		 		 txtram.setText(rs.getString("RAM"));
		 		 txtexpandable.setText(rs.getString("Expandable"));
		 		 txttype.setText(rs.getString("Type"));
		 		 txtcapacity.setText(rs.getString("Capacity"));
		 		 txtblue.setText(rs.getString("Bluetooth"));
		 		 txtwifi.setText(rs.getString("Wifi"));
		 		 txthotspot.setText(rs.getString("Hotspot"));
		 		 txt3g.setText(rs.getString("3G"));
		 		 txt4g.setText(rs.getString("4G"));
		 		 txtwired.setText(rs.getString("Wired"));
		 		 txtoem.setText(rs.getString("OEM"));
		 		 txtcores.setText(rs.getString("Cores"));
		 		 txtfrequency.setText(rs.getString("Frequency"));
		 		 txtgpu.setText(rs.getString("GPU"));
		 		 txtprox.setText(rs.getString("Proximity"));
		 		 txtacc.setText(rs.getString("Accelerometer"));
		 		 txtgyro.setText(rs.getString("Gyroscope"));
		 		 txtambi.setText(rs.getString("Ambientlight"));

		 		 		}
		 		 		else
		 		 		{
		 		 	msg.showMessageDialog(F1,"NOT FOUND","Alert",JOptionPane.WARNING_MESSAGE);
		 		 		}


		 		 	}
		 		 	catch(SQLException se)
		 		 	{
		 		 msg.showMessageDialog(F1,se,"Alert",JOptionPane.WARNING_MESSAGE);
		 		 	}

	 }


      if(ae.getSource() == btnclear)
    {
        txtdimen.setText("  ");
        txtweigh.setText("  ");
        txtos.setText("  ");
        txtgra.setText("  ");
        txtresolu.setText("  ");
        txtdisplay.setText("  ");
        txtsize.setText("  ");
        txtpixel.setText("  ");
        txttouch.setText("  ");
        txtcolor.setText("  ");
        txtscreen.setText("  ");
        txtprimary.setText("  ");
        txtfront.setText("  ");
        txtvideo.setText("  ");
        txtinternal.setText("  ");
        txtram.setText("  ");
        txtexpandable.setText("  ");
        txttype.setText("  ");
        txtcapacity.setText("  ");
        txtblue.setText("  ");
        txtwifi.setText("  ");
        txthotspot.setText("  ");
        txt3g.setText("  ");
        txt4g.setText("  ");
        txtwired.setText("  ");
        txtoem.setText("  ");
        txtcores.setText("  ");
        txtfrequency.setText("  ");
        txtgpu.setText("  ");
        txtprox.setText("  ");
        txtacc.setText("  ");
        txtgyro.setText("  ");
        txtambi.setText("  ");
        txtbrand.setText("  ");
        txtmodel.setText("  ");

    }
   if(ae.getSource() == btnsave)
  {
	  String brand,model,dimensions,weight,operating,upgrade,resolution,displaytype,size,pixel,touchscreen,color,screento,primary,front,video,internal,RAM,expandable,type,capacity,bluetooth,wifi,hotspot,g,gg,wired,OEM,cores,frequency,GPU,proximity,accelerometer,gyroscope,ambient;

    brand=txtbrand.getText();
    model=txtmodel.getText();
    dimensions=txtdimen.getText();
    weight=txtweigh.getText();
    operating=txtos.getText();
    upgrade=txtgra.getText();
    resolution=txtresolu.getText();
    displaytype=txtdisplay.getText();
    size=txtsize.getText();
    pixel=txtpixel.getText();
    touchscreen=txttouch.getText();
    color=txtcolor.getText();
    screento=txtscreen.getText();
    primary=txtprimary.getText();
    front=txtfront.getText();
    video=txtvideo.getText();
    internal=txtinternal.getText();
    RAM=txtram.getText();
    expandable=txtexpandable.getText();
    type=txttype.getText();
    capacity=txtcapacity.getText();
    bluetooth=txtblue.getText();
    wifi=txtwifi.getText();
    hotspot=txthotspot.getText();
    g=txt3g.getText();
    gg=txt4g.getText();
    wired=txtwired.getText();
    OEM=txtoem.getText();
    cores = txtcores.getText();
    frequency = txtfrequency.getText();
    GPU = txtgpu.getText();
    proximity = txtprox.getText();
    accelerometer = txtacc.getText();
    gyroscope = txtgyro.getText();
    ambient = txtambi.getText();

 try
 {

 	st.executeUpdate("insert into Phone values('"+dimensions+"','"+weight+"','"+operating+"','"+upgrade+"','"+resolution+"','"+displaytype+"','"+size+"','"+pixel+"','"+touchscreen+"','"+color+"','"+screento+"','"+primary+"','"+front+"','"+video+"','"+internal+"','"+RAM+"','"+expandable+"','"+type+"','"+capacity+"','"+bluetooth+"','"+wifi+"','"+hotspot+"','"+g+"','"+gg+"','"+wired+"','"+OEM+"','"+cores+"','"+frequency+"','"+GPU+"','"+proximity+"','"+accelerometer+"','"+gyroscope+"','"+ambient+"','"+brand+"','"+model+"')");
 	msg.showMessageDialog(F1,"Saved","Alert",JOptionPane.WARNING_MESSAGE);
 }
 catch(SQLException se)
 {
 msg.showMessageDialog(F1,se,"Alert",JOptionPane.WARNING_MESSAGE);
 }

    }
    }

 public void dbconnect()
 	{

     try
 	          {
 	          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 	          }
 	     catch(ClassNotFoundException cnfe)
 	          {
 	          msg.showMessageDialog(F1,"Unable to find Loader","Alert",JOptionPane.WARNING_MESSAGE);
 	          }
 	     try
 	          {
 	          con=DriverManager.getConnection("jdbc:odbc:phone","","");
 	           msg.showMessageDialog(F1,"Connected","Alert",JOptionPane.WARNING_MESSAGE);

 	           st=con.createStatement();
				      st1=con.createStatement();

 	          }
 	     catch(SQLException sq)
 	          {
 	          msg.showMessageDialog(F1,"Unable to connect","Alert",JOptionPane.WARNING_MESSAGE);
 	          }

 }


 public static void main(String[] args)
 {
  new Phone2();
 }
}