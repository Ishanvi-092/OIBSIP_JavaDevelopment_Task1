import javax.swing.*;

public class MainMenu {

    MainMenu(){

        JFrame frame = new JFrame("Main Menu");

        JButton reserve = new JButton("Reservation");
        reserve.setBounds(100,50,200,40);

        JButton cancel = new JButton("Cancellation");
        cancel.setBounds(100,120,200,40);

        reserve.addActionListener(e -> new ReservationForm());
        cancel.addActionListener(e -> new CancellationForm());

        frame.add(reserve);
        frame.add(cancel);

        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}