/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectozone;

/*
DONE	Allow the user to add an applicant
-	Allow the user to look for an application based on
            - Job application number or Applicant last and first names
-	Allow the user to delete an application based on the job number or applicants name
DONE	Allow the user to view applicants by clicking << or >> buttons for navigating the pool of applicants
-	Allow the user to send any application to a file (Text file is fine for now)



*/


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
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
     GridPane pane = new GridPane();
     GridPane displayPane = new GridPane();
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
    HBox girdBox5Vertical = new HBox();
    VBox blank = new VBox();
    
    
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
    //TextField startDate = new TextField();
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
    
    // Global Strings
    
    String date;
    String comboOne;
    String comboTwo;
    String usFieldAns;
    String felonyAns;
    String drugAns;
    
    // Array Lists //
    
    ArrayList<Applicant> list = new ArrayList<>();
    
    List<TextField> tfList = new ArrayList<>();
    
    // Array Index Variables
    int x = 0;
    
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
        
           homeButton.setOnAction((ActionEvent event) -> {
               
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText("Look, an Information Dialog");
                alert.setContentText("I have a great message for you!");
                alert.showAndWait();
                
              root.setCenter(centerBox);
        });
        Button announcementButton = new Button("Announcements");
        Button displayApplicants = new Button("Applicants");
       
         displayApplicants.setOnAction((ActionEvent event) -> {
             
               if (list.isEmpty())
                 System.out.println("Error! No applicants");
               else{
                
                displayInfo(x);
             }
        });
         
        leftButtonBox.getChildren().addAll(homeButton, announcementButton, displayApplicants);
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
        
        // getAllFields(); // Add all data to an object and store in ArrayList
        
        centerBox.getChildren().addAll(gridBox1, gridBox2, gridBox3, gridBox4, pane);
        root.setCenter(centerBox);
        
        blank.getChildren().addAll(displayPane);
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
        tfList.add(firstNameField);
        // formPane.add("", 2, 0);
        formPane.add(new Label("Last Name: ") , 2, 0);
        formPane.add(lastNameField , 3, 0);
        tfList.add(lastNameField);
        formPane.add(new Label("Address: ") , 0, 2);
        formPane.add(addressField , 1, 2);
        tfList.add(addressField);
        formPane.add(new Label("City:") , 2, 2);
        formPane.add(cityField , 3, 2);
        tfList.add(cityField);
        formPane.add(new Label("State:") , 4, 2);
        formPane.add(stateField , 5, 2);
        tfList.add(stateField);
        formPane.add(new Label("Zip:") , 6, 2);
        formPane.add(zipField , 7, 2);
        tfList.add(zipField);
        formPane.add(new Label("Phone Number:") , 0, 3);
        formPane.add(phoneField , 1, 3);
        tfList.add(phoneField);
        formPane.add(new Label("Mobile Number:") , 2, 3);
        formPane.add(mobileField , 3, 3);
        tfList.add(mobileField);
        formPane.add(new Label("Email Address:") , 4, 3);
        formPane.add(emailField , 5, 3);
        tfList.add(emailField);
        
        // Separator
        Separator sepHor = new Separator();
        sepHor.setValignment(VPos.CENTER);
        GridPane.setConstraints(sepHor, 0, 6);
        GridPane.setColumnSpan(sepHor, 10);
        formPane.getChildren().add(sepHor);
    }
    
    public void secondGrid(){
        
        
         ObservableList<String> options = 
        FXCollections.observableArrayList(
        "Yes",
        "No"
    );
         ComboBox comboBox = new ComboBox(options);
         ComboBox comboBox2 = new ComboBox(options);
         ComboBox comboBox3 = new ComboBox(options);
         
         
         
        gridBox2.getChildren().addAll(centerHeading2,formPane2);
        formPane2.setHgap(10);
        formPane2.setVgap(5);
        formPane2.add(citizen, 0, 0);
        formPane2.add(comboBox, 1, 0);
        formPane2.add(felony, 0, 3);
        formPane2.add(comboBox2, 1, 3);       
        formPane2.add(drugScreening, 0, 6);
        formPane2.add(comboBox3, 1, 6);
       
        usFieldAns = (String) comboBox.getValue();
        felonyAns = (String) comboBox2.getValue();
        drugAns = (String) comboBox3.getValue();
       
         
         
    
        
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
        tfList.add(position);
        formPane3.add(new Label("Available Start Date"), 2, 0);
       // formPane3.add(startDate, 2, 1);
        
        DatePicker startDatePicker = new DatePicker();
        startDatePicker.setValue(LocalDate.now());
        formPane3.add(startDatePicker, 2, 1);
        
        date = startDatePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        formPane3.add(new Label("Desired Pay"), 4, 0);
        formPane3.add(desiredPay, 4, 1);
        tfList.add(desiredPay);
        
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
        tfList.add(schoolName);
        formPane4.add(new Label("Location"), 2, 0);
        formPane4.add(location, 2, 1);
        tfList.add(location);
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
        tfList.add(major);
        
        //Separator
        Separator sepHor = new Separator();
        sepHor.setValignment(VPos.CENTER);
        GridPane.setConstraints(sepHor, 0, 6);
        GridPane.setColumnSpan(sepHor, 10);
        formPane4.getChildren().add(sepHor);
        
    }
    
    public void fifthGrid(){
        
        gridBox5.getChildren().addAll(centerHeading4,formPane5);
        
        formPane5.setHgap(2);
        //formPane5.setVgap(2);
        formPane5.add(new Label("Name "), 0, 0);
        formPane5.add(refName, 0, 1);
        tfList.add(refName);
        formPane5.add(new Label("Title "), 2, 0);
        formPane5.add(title, 2, 1);
        tfList.add(title);
        formPane5.add(new Label("Company "), 4, 0);
        formPane5.add(company, 4, 1);
        tfList.add(company);
        formPane5.add(new Label("Phone "), 6, 0);
        formPane5.add(phone, 6, 1);
        tfList.add(phone);
        
        Button addButton = new Button("Add Applicant");
       
        formPane5.add(addButton, 7, 1);
        
         addButton.setOnAction((ActionEvent event) -> {
             getAllFields();
        });
   
        Button clrButton = new Button("Clear Fields");
       
        formPane5.add(clrButton, 8, 1);
        
         clrButton.setOnAction((ActionEvent event) -> {
             ClearFields();
        });
        
       
      // buttonBox.getChildren().addAll(addButton, clrButton);
       
        pane.setHgap(5); //horizontal gap in pixels => that's what you are asking for
        pane.setVgap(5); //vertical gap in pixels
        pane.setPadding(new Insets(10, 10, 10, 10)); //margins around the whole grid
        
        pane.add(gridBox5, 0, 0);
        pane.add(addButton, 8, 0);
        pane.add(clrButton, 10, 0);
       
    }
    
    // Function for clearing all text fields -> clrButton
    public void ClearFields(){
        
       for (TextField tf : tfList) {
                tf.setText("");
}
    }
    
    
    // Function to get all text from fields -> addButton
    public void getAllFields(){
       
        Applicant applicant = new Applicant (firstNameField.getText(), lastNameField.getText(), addressField.getText(), cityField.getText(), stateField.getText(),
         zipField.getText(), phoneField.getText(), mobileField.getText(), emailField.getText(), usFieldAns, felonyAns, drugAns, position.getText(), date, desiredPay.getText(),
         schoolName.getText(), location.getText(), comboOne, comboTwo, major.getText(), refName.getText(), title.getText(), 
         company.getText(), phone.getText());
        
        list.add(applicant);
 
 
        
    }
    
    
    
    public void displayInfo(int i){
         
        
        
        displayPane.setHgap(2);
        displayPane.setVgap(5);
        
        displayPane.setPadding(new Insets(10, 10, 10, 10));
        
        displayPane.add(new Label("Applicant Number: ["+ (i + 1) +"]"),0 , 0);
        displayPane.add(new Label("Full Name:"),0 , 1);
        displayPane.add(new Label(list.get(i).getFname()),1 , 1);
        displayPane.add(new Label(list.get(i).getLname()),2 , 1);
        displayPane.add(new Label("Address:"),0 , 2);
        displayPane.add(new Label(list.get(i).getAddress()),1 , 2);
        displayPane.add(new Label(list.get(i).getCity()),2 , 2);
        displayPane.add(new Label(list.get(i).getState()),3 , 2);
        displayPane.add(new Label(list.get(i).getZipCode()),4 , 2);
        
    
        
        
        Button previous = new Button("<<");
        
         previous.setOnAction((ActionEvent event) -> {
            try{ 
             if (list.isEmpty())
                 System.out.println("Error! No applicants");
             else{
             displayPane.getChildren().clear();
             displayInfo(--x);
             }
             
            }
            catch(Exception e){
        System.out.println("Warning: there are no previous appicants");
     }
        });
         
        Button next = new Button(">>");
        
         next.setOnAction((ActionEvent event) -> {
           
             try{
                if (list.isEmpty())
                 System.out.println("Error! No applicants");
                else{
                     displayPane.getChildren().clear();
                     displayInfo(++x);
               }
             }
             catch(Exception e){
        System.out.println("Warning: there are no more applicants");
     }
        });
         
        HBox buttonBox = new HBox();
        buttonBox.getChildren().addAll(previous, next);
        
        
        root.setBottom(buttonBox);
        root.setCenter(blank);
    }
    
    public static void main(String[] args) {
        
        launch(args);
        

    }
    
}
