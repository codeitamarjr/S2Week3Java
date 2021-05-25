import javax.swing.*;

public class Password {
    public static void askPassword(String systemPassword){
        String inputPassword = JOptionPane.showInputDialog("Input a Password");

            for (int count = 1; count < 3; count++) {
                if(inputPassword.equals(systemPassword)){
                    JOptionPane.showMessageDialog(null, "Correct password, welcome to the system!");
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid password");
                    inputPassword = JOptionPane.showInputDialog("Input a password again(You have" + (3 - count) + " attempts left):");
                } if(count == 2){
                    JOptionPane.showMessageDialog(null,"I'm sorry you don't have more attempts left!");
                }
            }
        }
    }