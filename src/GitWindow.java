import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GitWindow {

	private JFrame frame;
	private JTextField usernameInput;
	private JTextField folderInput;
	private JPasswordField passwordInput;
	private JTextField uriInput;
	private JTextField commitInput;
	Magic magic;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GitWindow window = new GitWindow();
					window.frame.setVisible(true);
					window.frame.setTitle("Github Helper");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GitWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 529, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel usernameLabel = new JLabel("Username:");
		usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		usernameLabel.setBounds(10, 31, 72, 14);
		frame.getContentPane().add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password: ");
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		passwordLabel.setBounds(10, 71, 72, 14);
		frame.getContentPane().add(passwordLabel);
		
		JLabel lblFolderToUpload = new JLabel("Folder to upload:");
		lblFolderToUpload.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFolderToUpload.setBounds(262, 31, 114, 14);
		frame.getContentPane().add(lblFolderToUpload);
		
		JLabel lblUri = new JLabel("URI:");
		lblUri.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUri.setBounds(341, 71, 35, 14);
		frame.getContentPane().add(lblUri);
		
		usernameInput = new JTextField();
		usernameInput.setText(" myUsername");
		usernameInput.setBounds(92, 29, 160, 20);
		frame.getContentPane().add(usernameInput);
		usernameInput.setColumns(10);
		
		folderInput = new JTextField();
		folderInput.setText(" myFolder");
		folderInput.setBounds(386, 29, 117, 20);
		frame.getContentPane().add(folderInput);
		folderInput.setColumns(10);
		
		passwordInput = new JPasswordField();
		passwordInput.setEchoChar('*');
		passwordInput.setBounds(92, 70, 160, 18);
		frame.getContentPane().add(passwordInput);
		
		uriInput = new JTextField();
		uriInput.setText(" URI");
		uriInput.setBounds(386, 69, 117, 20);
		frame.getContentPane().add(uriInput);
		uriInput.setColumns(10);
		
		JLabel lblCommitMessage = new JLabel("Commit message:");
		lblCommitMessage.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCommitMessage.setBounds(92, 143, 114, 14);
		frame.getContentPane().add(lblCommitMessage);
		
		commitInput = new JTextField();
		commitInput.setText(" Commit message");
		commitInput.setBounds(216, 141, 189, 20);
		frame.getContentPane().add(commitInput);
		commitInput.setColumns(10);
		
		JButton magicButton = new JButton("Magic");
		magicButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				magic = new Magic(usernameInput.getText(), passwordInput.getPassword(), uriInput.getText(), folderInput.getText(), commitInput.getText());
				
			}
		});
		magicButton.setBounds(216, 203, 89, 23);
		frame.getContentPane().add(magicButton);
	}
}
