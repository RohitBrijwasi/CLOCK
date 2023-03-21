/**
 * Author: Rohit Brijwasi
 * Designation: Software Engineer
 */
package ClockApp;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	//Calendar calendar;
	SimpleDateFormat timeformat;
	SimpleDateFormat dayformat;
	SimpleDateFormat dateformat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;

	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Clock Programme");
		this.setLayout(new FlowLayout());
		this.setSize(400, 200);
		this.setResizable(false);

		// https://docs.oracle.com/javase/7/docs...
		timeformat = new SimpleDateFormat("hh:mm:ss a z");

		dayformat = new SimpleDateFormat("EEEE");

		dateformat = new SimpleDateFormat("MMMMM  dd,  Y");

		timeLabel = new JLabel();
		timeLabel.setFont(new Font("Verdana", Font.PLAIN, 44));
		timeLabel.setForeground(new Color(0x00FF00)); // hexvalue
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);

		dayLabel = new JLabel();
		dayLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));

		dateLabel = new JLabel();
		dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 25));

		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		this.setVisible(true);

		setTime();

	}

	public void setTime() {
		while (true) {
			time = timeformat.format(Calendar.getInstance().getTime());
			timeLabel.setText(time);

			day = dayformat.format(Calendar.getInstance().getTime());
			dayLabel.setText(day);

			date = dateformat.format(Calendar.getInstance().getTime());
			dateLabel.setText(date);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	private void format(Date time2) {

	}
}
