import javax.swing.*;
import java.sql.*;


public class CancellationForm {

    CancellationForm(){

        JFrame frame = new JFrame("Cancellation Form");

        JTextField pnrField = new JTextField();
        JTextArea details = new JTextArea();

        JButton search = new JButton("Search");
        JButton cancel = new JButton("Cancel Ticket");

        pnrField.setBounds(150,50,150,30);
        search.setBounds(320,50,80,30);

        details.setBounds(50,100,350,120);

        cancel.setBounds(150,240,150,30);

        frame.add(new JLabel("Enter PNR")).setBounds(50,50,100,30);
        frame.add(pnrField);
        frame.add(search);
        frame.add(details);
        frame.add(cancel);

        // SEARCH PNR
        search.addActionListener(e -> {

            try{

                Connection con = DBConnection.getConnection();

                String query = "SELECT * FROM reservations WHERE pnr=?";

                PreparedStatement ps = con.prepareStatement(query);

                ps.setInt(1,Integer.parseInt(pnrField.getText()));

                ResultSet rs = ps.executeQuery();

                if(rs.next()){

                    details.setText(
                        "Name: "+rs.getString("name")+"\n"+
                        "Train: "+rs.getString("train_name")+"\n"+
                        "From: "+rs.getString("source")+"\n"+
                        "To: "+rs.getString("destination")
                    );

                } else {

                    details.setText("PNR Not Found");

                }

            }catch(Exception ex){
                System.out.println(ex);
            }

        });

        // CANCEL
        cancel.addActionListener(e -> {

            int confirm = JOptionPane.showConfirmDialog(frame,"Confirm Cancellation?");

            if(confirm==0){

                try{

                    Connection con = DBConnection.getConnection();

                    String query = "DELETE FROM reservations WHERE pnr=?";

                    PreparedStatement ps = con.prepareStatement(query);

                    ps.setInt(1,Integer.parseInt(pnrField.getText()));

                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(frame,"Ticket Cancelled");

                }catch(Exception ex){
                    System.out.println(ex);
                }

            }

        });

        frame.setSize(450,350);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}