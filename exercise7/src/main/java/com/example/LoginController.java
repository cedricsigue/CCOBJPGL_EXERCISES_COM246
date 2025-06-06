package com.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class LoginController {

    @FXML
    TextField usernametextfield;

    @FXML
    TextField passwordfield;

    @FXML
    Button loginButton;
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    public static User user;

    public void loginButtonHandler(ActionEvent event) throws IOException {

        // Get text from text field
        String username = usernametextfield.getText();
        String password = passwordfield.getText();  

        user = new User(username, password,"","" );

        File accountsfile = new File("accounts.txt");

        if (accountsfile.exists()) {

            Scanner filescanner = new Scanner(accountsfile);
            while (filescanner.hasNextLine()) {

                String data = filescanner.nextLine();
    
                String username_from_file = data.split(",")[0];
                String password_from_file = data.split(",")[1];

                if (username_from_file.equals(user.getUsername()) && password_from_file.equals(user.getPassword())) {
                    
                    System.out.println("Login successful");

                    // Load Scene2.fxml when login button is clicked
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
                    // Load the FXML file
                    root = loader.load();
                    // Load stage and scene
                    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                    break;
                } 
            }
            filescanner.close();
        }
        
    }
    
}