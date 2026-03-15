import javax.swing.*;
import java.sql.*;
import java.util.Random;


public class ReservationForm {

    ReservationForm(){

        JFrame frame = new JFrame("Reservation Form");

        JTextField name = new JTextField();
        JTextField trainNo = new JTextField();
        JTextField trainName = new JTextField();
        JTextField classType = new JTextField();
        JTextField date = new JTextField();
        JTextField from = new JTextField();
        JTextField to = new JTextField();

        JButton insert = new JButton("Insert");

        name.setBounds(150,50,150,30);
        trainNo.setBounds(150,90,150,30);
        trainName.setBounds(150,130,150,30);
        classType.setBounds(150,170,150,30);
        date.setBounds(150,210,150,30);
        from.setBounds(150,250,150,30);
        to.setBounds(150,290,150,30);

        insert.setBounds(150,340,100,30);

        // AUTO TRAIN NAME
        trainNo.addActionListener(e -> {

            String tno = trainNo.getText();

            if(tno.equals("101"))
                trainName.setText("Chennai Express");
            else if(tno.equals("102"))
                trainName.setText("Delhi Mail");
            else
                trainName.setText("Unknown Train");

        });

        insert.addActionListener(e -> {

            try{

                Connection con = DBConnection.getConnection();

                int pnr = new Random().nextInt(900000)+100000;

                String query = "INSERT INTO reservations VALUES(?,?,?,?,?,?,?,?)";

                PreparedStatement ps = con.prepareStatement(query);

                ps.setInt(1,pnr);
                ps.setString(2,name.getText());
                ps.setString(3,trainNo.getText());
                ps.setString(4,trainName.getText());
                ps.setString(5,classType.getText());
                ps.setString(6,date.getText());
                ps.setString(7,from.getText());
                ps.setString(8,to.getText());

                ps.executeUpdate();

                JOptionPane.showMessageDialog(frame,"Reservation Successful\nPNR: "+pnr);

            }catch(Exception ex){
                System.out.println(ex);
            }

        });

        frame.add(new JLabel("Name")).setBounds(50,50,100,30);
        frame.add(name);

        frame.add(new JLabel("Train No")).setBounds(50,90,100,30);
        frame.add(trainNo);

        frame.add(new JLabel("Train Name")).setBounds(50,130,100,30);
        frame.add(trainName);

        frame.add(new JLabel("Class")).setBounds(50,170,100,30);
        frame.add(classType);

        frame.add(new JLabel("Date")).setBounds(50,210,100,30);
        frame.add(date);

        frame.add(new JLabel("From")).setBounds(50,250,100,30);
        frame.add(from);

        frame.add(new JLabel("To")).setBounds(50,290,100,30);
        frame.add(to);

        frame.add(insert);

        frame.setSize(400,450);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}