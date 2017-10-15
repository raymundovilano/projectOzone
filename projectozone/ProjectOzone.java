/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectozone;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Raymundo
 */
public class ProjectOzone extends Application {
    
    
    // -- ALL PANES HERE --  //
     BorderPane root = new BorderPane();
     GridPane formPane = new GridPane();   
     GridPane formPane2 = new GridPane();   
     GridPane formPane3 = new GridPane();   
     GridPane formPane4 = new GridPane();   
     GridPane formPane5 = new GridPane();   
     
    
    //  -- ALL BOXES HERE --  // 
    HBox headingBox = new HBox();
    VBox headingText = new VBox();
    VBox leftBox = new VBox();
    VBox centerBox = new VBox();
    VBox gridBox1 = new VBox(); // Personal Info
    VBox gridBox2 = new VBox(); // Personal Questions 
    VBox gridBox3 = new VBox(); // Position
    VBox gridBox4 = new VBox(); // Education
    VBox gridBox5 = new VBox(); // Reference
    HBox leftButtonBox = new HBox(); // Reference
    
    
    // -- ALL IMAGES HERE -- //
    ImageView logo = new ImageView("logo.png");
    
    // -- ALL LABELS HERE -- //
    
    Label heading1 = new Label("University Of Texas Rio Grande Valley");
    Label heading2 = new Label("Application for Employment");
    
    Label leftHeading = new Label("Announcements");
    
    Label centerHeading1 = new Label("Personal Information");
    Label centerHeading2 = new Label("Position");
    Label centerHeading3 = new Label("Education");
    Label centerHeading4 = new Label("References");
    
    
    // Personal Information Form //

    Label citizen = new Label("Are you a U.S. Citizen? ");
    Label felony = new Label("Have You Ever Been Convicted Of A Felony?");
    Label drugScreening = new Label("If Selected For Employment Are You Willing To"
            + " Submit to a Pre-Employment Drug Screening Test? ");
    
 
    
    
    
 // -- ALL TOGGLE GROUPS & BUTTONS HERE -- //

    ToggleGroup usField = new ToggleGroup();
    RadioButton radiobtn1 = new RadioButton("Yes");
    RadioButton radiobtn2 = new RadioButton("No");
    
    ToggleGroup felonyField = new ToggleGroup();
    RadioButton radiobtn3 = new RadioButton("Yes");
    RadioButton radiobtn4 = new RadioButton("No");
    
    ToggleGroup drugScreeningField = new ToggleGroup();
    RadioButton radiobtn5 = new RadioButton("Yes");
    RadioButton radiobtn6 = new RadioButton("No");
    
    String usFieldAns = usField.getSelectedToggle().getUserData().toString();
    String felonyAns = felonyField.getSelectedToggle().getUserData().toString();
    String drugAns = drugScreeningField.getSelectedToggle().getUserData().toString();
    
    //String refName, String title, String company, String refPhone)
// -- ALL TEXTFIELDS HERE -- //
   
     // Personal Information Form //
    TextField firstNameField = new TextField();
    TextField lastNameField = new TextField();
    TextField addressField = new TextField();
    TextField cityField = new TextField();
    TextField stateField = new TextField();
    TextField zipField = new TextField();
    TextField phoneField = new TextField();
    TextField mobileField = new TextField();
    TextField emailField = new TextField();
    
     // Position Info Form //
    TextField position = new TextField();
    TextField startDate = new TextField();
    TextField desiredPay = new TextField();
    
     // Education Form //
    
    TextField schoolName = new TextField();
    TextField location = new TextField();
    TextField yearsAttended = new TextField(); // ComboBox
    TextField degreeRecieved = new TextField(); // ComboBox2
    TextField major = new TextField();
  
   // Reference Form //
    
    TextField refName = new TextField();
    TextField title = new TextField();
    TextField company = new TextField();
    TextField phone = new TextField();
    
    String date;
    String comboOne;
    String comboTwo;
    
    
    // Array List //
    
    ArrayList<Applicant> list = new ArrayList<Applicant>();
    
    @Override
    public void start(Stage primaryStage) {
        
        //Top of Pane: LOGO and Headings 
        headingText.getChildren().addAll(heading1, heading2);
        headingBox.getChildren().addAll(logo, headingText);
        headingBox.setSpacing(50); // Spacing between childern in HBox
        headingBox.setStyle("-fx-background-color: #65646a"); // HBox Background Color
        headingBox.setPadding(new Insets(25)); // HBox spacing on all sides
        heading1.setFont(new Font("Cambria", 28)); // Heading1 Font
        heading1.setTextFill(Color.web("White")); // Heading1 Color
        heading2.setFont(new Font("Cambria", 18));  // Heading2 Font
        heading2.setTextFill(Color.web("White")); // Heading2 Color
        root.setTop(headingBox);
                
        //Left of Pane: IDK WHAT
        
        Button homeButton = new Button("Home");
        Button announcementButton = new Button("Announcements");
        Button profileButton = new Button("Profile");
       
        leftButtonBox.getChildren().addAll(homeButton, announcementButton, profileButton);
        leftButtonBox.setSpacing(10);
        
        leftBox.setSpacing(10); 
        leftBox.setPadding(new Insets(45)); // HBox spacing on all sides
        leftBox.setStyle("-fx-background-color: #031937");
            
        leftHeading.setFont(new Font("Open Sans", 25));  // leftHeading Font
        leftHeading.setTextFill(Color.web("White")); // Heading1 Color

        leftBox.getChildren().addAll(leftButtonBox,leftHeading); // Heading into Box
        root.setLeft(leftBox);
        
        
        // *** CENTER PANE *** 
        centerHeading1.setFont(new Font("Garamond", 20));  
        centerHeading1.setTextFill(Color.web("#12263f")); 
        centerHeading2.setFont(new Font("Garamond", 20));  
        centerHeading2.setTextFill(Color.web("#12263f")); 
        centerHeading3.setFont(new Font("Garamond", 20));  
        centerHeading3.setTextFill(Color.web("#12263f"));
        centerHeading4.setFont(new Font("Garamond", 20));  
        centerHeading4.setTextFill(Color.web("#12263f")); 
        
        centerBox.setSpacing(5); 
        centerBox.setPadding(new Insets(45));
        
        
        firstGrid(); // Call function to add all textfields to grid1
     
        secondGrid(); // Second Grid Function
        
        thirdGrid();  // Third Grid Function
                 
        fourthGrid(); 
        
        fifthGrid();
        
        
        centerBox.getChildren().addAll(gridBox1, gridBox2, gridBox3, gridBox4, gridBox5);
        root.setCenter(centerBox);
        
        
        //Buttons
        radiobtn1.setToggleGroup(usField);
       // radiobtn1.setSelected(true);
        radiobtn2.setToggleGroup(usField);
        
        radiobtn3.setToggleGroup(felonyField);
        radiobtn4.setToggleGroup(felonyField);
        
        radiobtn5.setToggleGroup(drugScreeningField);
        radiobtn6.setToggleGroup(drugScreeningField);
        

        
        Scene scene = new Scene(root, 300, 250);
       
        
        primaryStage.setTitle("UTRGV: Application for Employment");
        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void firstGrid (){
        gridBox1.getChildren().addAll(centerHeading1,formPane);
        formPane.setHgap(5); //horizontal gap in pixels => that's what you are asking for
        formPane.setVgap(5); //vertical gap in pixels
        formPane.setPadding(new Insets(10, 10, 10, 10)); //margins around the whole grid
                                             //(top/right/bottom/left)
        formPane.add(new Label("First Name: ") , 0, 0);
        formPane.add(firstNameField , 1, 0);
        // formPane.add("", 2, 0);
        formPane.add(new Label("Last Name: ") , 2, 0);
        formPane.add(lastNameField , 3, 0);
        
        formPane.add(new Label("Address: ") , 0, 2);
        formPane.add(addressField , 1, 2);
        
        formPane.add(new Label("City:") , 2, 2);
        formPane.add(cityField , 3, 2);
        
        formPane.add(new Label("State:") , 4, 2);
        formPane.add(stateField , 5, 2);
        
        formPane.add(new Label("Zip:") , 6, 2);
        formPane.add(zipField , 7, 2);
        
        formPane.add(new Label("Phone Number:") , 0, 3);
        formPane.add(phoneField , 1, 3);
        
        formPane.add(new Label("Mobile Number:") , 2, 3);
        formPane.add(mobileField , 3, 3);
        
        formPane.add(new Label("Email Address:") , 4, 3);
        formPane.add(emailField , 5, 3);
 
        // Separator
        Separator sepHor = new Separator();
        sepHor.setValignment(VPos.CENTER);
        GridPane.setConstraints(sepHor, 0, 6);
        GridPane.setColumnSpan(sepHor, 10);
        formPane.getChildren().add(sepHor);
    }
    
    public void secondGrid(){
        gridBox2.getChildren().addAll(centerHeading2,formPane2);
        
        formPane2.setHgap(10);
        formPane2.setVgap(5);
        formPane2.add(citizen, 0, 0);
        formPane2.add(radiobtn1, 1, 0);
        formPane2.add(radiobtn2, 2, 0);
        formPane2.add(felony, 0, 3);
        formPane2.add(radiobtn3, 1, 3);
        formPane2.add(radiobtn4, 2, 3);
        formPane2.add(drugScreening, 0, 6);
        formPane2.add(radiobtn5, 1, 6);
        formPane2.add(radiobtn6, 2, 6);
        
        
        
        
        // Separator
        Separator sepHor = new Separator();
        sepHor.setValignment(VPos.CENTER);
        GridPane.setConstraints(sepHor, 0, 8);
        GridPane.setColumnSpan(sepHor, 10);
        formPane2.getChildren().add(sepHor);
    }
    
    public void thirdGrid(){
        gridBox3.getChildren().addAll(centerHeading3,formPane3);
        formPane3.setHgap(10);
        formPane3.setVgap(2);
        formPane3.add(new Label("Position you are Applying For"),0,0 );
        formPane3.add(position , 0, 1 );
        formPane3.add(new Label("Available Start Date"), 2, 0);
       // formPane3.add(startDate, 2, 1);
        
        DatePicker startDatePicker = new DatePicker();
        startDatePicker.setValue(LocalDate.now());
        formPane3.add(startDatePicker, 2, 1);
        
        date = startDatePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        formPane3.add(new Label("Desired Pay"), 4, 0);
        formPane3.add(desiredPay, 4, 1);

        
        ObservableList<String> options = 
        FXCollections.observableArrayList(
        "Full Time",
        "Part Time",
        "Seasonal/Temporary"
    );
         ComboBox comboBox = new ComboBox(options);
         
         
          formPane3.add(new Label("Employment Desired"), 6, 0);
          formPane3.add(comboBox, 6, 1);
         
          //comboBox.getValue() for value of box
      
          
          /*
      Button btn1 = new Button("Pendejo");
        btn1.setOnAction((ActionEvent event) -> {
            System.out.println(comboBox.getValue());
        });
       
         formPane3.add(btn1, 8, 0);
    
          
          */
        Separator sepHor = new Separator();
        sepHor.setValignment(VPos.CENTER);
        GridPane.setConstraints(sepHor, 0, 6);
        GridPane.setColumnSpan(sepHor, 10);
        formPane3.getChildren().add(sepHor);
    }

    public void fourthGrid(){
        gridBox4.getChildren().addAll(centerHeading3,formPane4);
        
        formPane4.setHgap(2);
        formPane4.setVgap(2);
        formPane4.add(new Label("School Name "), 0, 0);
        formPane4.add(schoolName, 0, 1);
        
        formPane4.add(new Label("Location"), 2, 0);
        formPane4.add(location, 2, 1);
        
        ObservableList<String> options = 
        FXCollections.observableArrayList(
        "1 Year",
        "2 Years",
        "3 Years",
        "4+ Years"
    );
        ComboBox comboBox = new ComboBox(options);
        
        formPane4.add(new Label("Years Attended"), 4, 0);
        formPane4.add(comboBox, 4, 1);
        comboOne = (String) comboBox.getValue();
        
        ObservableList<String> options2 = 
        FXCollections.observableArrayList(
        "None",
        "Associate",
        "Bachelor's",
        "Master's",
        "Doctoral"
                
              
    );
        ComboBox comboBox2 = new ComboBox(options2);
        formPane4.add(new Label("Degree Recieved"),5, 0);
        formPane4.add(comboBox2,5, 1);
        
        comboTwo = (String) comboBox2.getValue(); 
         
        formPane4.add(new Label("Major"),7, 0);
        formPane4.add(major,7, 1);
        
        Separator sepHor = new Separator();
        sepHor.setValignment(VPos.CENTER);
        GridPane.setConstraints(sepHor, 0, 6);
        GridPane.setColumnSpan(sepHor, 10);
        formPane4.getChildren().add(sepHor);
        
    }
    
    public void fifthGrid(){
        
        gridBox5.getChildren().addAll(centerHeading4,formPane5);
        
        formPane5.setHgap(2);
        formPane5.setVgap(2);
        formPane5.add(new Label("Name "), 0, 0);
        formPane5.add(refName, 0, 1);
        
        formPane5.add(new Label("Title "), 2, 0);
        formPane5.add(title, 2, 1);
        
        formPane5.add(new Label("Company "), 4, 0);
        formPane5.add(company, 4, 1);
        
        formPane5.add(new Label("Phone "), 6, 0);
        formPane5.add(phone, 6, 1);
        
        
        
        
        /*          
    TextField refName = new TextField();
    TextField title = new TextField();
    TextField company = new TextField();
    TextField phone = new TextField();
        */
        
    }
    
    
    public void getAllFields(){
 list.add(new Applicant (firstNameField.getText(), lastNameField.getText(), addressField.getText(), cityField.getText(), stateField.getText(),
  zipField.getText(), phoneField.getText(), mobileField.getText(), emailField.getText(), position.getText(), date, desiredPay.getText(),
 schoolName.getText(), location.getText(), comboOne, comboTwo, major.getText(), refName.getText(), title.getText(), 
company.getText(), phone.getText()));
        
        
        
    }
    
    
    public static void main(String[] args) {
        
        launch(args);
        

    }
    
}
