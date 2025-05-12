package Presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import LogicaNegocio.CustomerService;
import LogicaNegocio.Customer;
import java.time.LocalDate;

/**
 * Aplicación gráfica para registrar clientes.
 */
public class CustomerForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registro de Cliente");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(10, 10, 150, 25);
        panel.add(idLabel);

        JTextField idText = new JTextField(20);
        idText.setBounds(180, 10, 165, 25);
        panel.add(idText);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(10, 40, 150, 25);
        panel.add(emailLabel);

        JTextField emailText = new JTextField(20);
        emailText.setBounds(180, 40, 165, 25);
        panel.add(emailText);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(10, 70, 150, 25);
        panel.add(passwordLabel);

        JTextField passwordText = new JTextField(20);
        passwordText.setBounds(180, 70, 165, 25);
        panel.add(passwordText);


        

        JLabel lastLoginLabel = new JLabel("Último Login:");
        lastLoginLabel.setBounds(10, 100, 150, 25);
        panel.add(lastLoginLabel);

        JTextField lastLoginText = new JTextField(20);
        lastLoginText.setBounds(180, 100, 165, 25);
        panel.add(lastLoginText);



        
        JLabel nameLabel = new JLabel("Nombre:");
        nameLabel.setBounds(10, 130, 150, 25);
        panel.add(nameLabel);

        JTextField nameText = new JTextField(20);
        nameText.setBounds(180, 130, 165, 25);
        panel.add(nameText);

        JLabel billingAddressLabel = new JLabel("Dirección de Facturación:");
        billingAddressLabel.setBounds(10, 160, 150, 25);
        panel.add(billingAddressLabel);

        JTextField billingAddressText = new JTextField(20);
        billingAddressText.setBounds(180, 160, 165, 25);
        panel.add(billingAddressText);

        JLabel defaultShippingLabel = new JLabel("Dirección de Envío:");
        defaultShippingLabel.setBounds(10, 190, 150, 25);
        panel.add(defaultShippingLabel);

        JTextField defaultShippingText = new JTextField(20);
        defaultShippingText.setBounds(180, 190, 165, 25);
        panel.add(defaultShippingText);

        JButton registerButton = new JButton("Registrar");
        registerButton.setBounds(10, 230, 150, 25);
        panel.add(registerButton);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CustomerService service = new CustomerService();
                Customer customer = new Customer(
                    Integer.parseInt(idText.getText()),
                    emailText.getText(),
                    passwordText.getText(),
                    LocalDate.parse(lastLoginText.getText()),
                    nameText.getText(),
                    billingAddressText.getText(),
                    defaultShippingText.getText()
                );
                service.registerCustomer(customer);
                JOptionPane.showMessageDialog(null, "Cliente registrado con éxito!");
            }
        });
    }
}
