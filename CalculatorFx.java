import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
 

public class CalculatorFx extends Application {
   
	private String first;
	private String operator;
	private String memory="";
	private boolean reset=false;
   @Override
   public void start(Stage primaryStage) {
	   TextField tf = new TextField();
       BorderPane root = new BorderPane();
       GridPane gp = new GridPane();
       gp.setAlignment(Pos.CENTER);
       gp.setHgap(10.0);
       gp.setVgap(10.0);
       root.setTop(tf);

       Button button1 = new Button("1");
       Button button2 = new Button("2");
       Button button3 = new Button("3");
       Button button4 = new Button("4");
       Button button5 = new Button("5");
       Button button6 = new Button("6");
       Button button7 = new Button("7");
       Button button8 = new Button("8");
       Button button9 = new Button("9");
       Button button0 = new Button("0");
       Button buttonDOT = new Button(".");
       Button buttonDIV = new Button("/");
       Button buttonMUL = new Button("*");
       Button buttonSUB = new Button("-");
       Button buttonADD = new Button("+");
       Button buttonEQU = new Button("=");
       Button buttonC = new Button("C");
       Button buttonMR = new Button("MR");
       Button buttonMsub = new Button("M-");
       Button buttonMadd = new Button("M+");
       Button buttonMC = new Button("MC");
       
       setButtonSize(button1);
       setButtonSize(button2);
       setButtonSize(button3);
       setButtonSize(button4);
       setButtonSize(button5);
       setButtonSize(button6);
       setButtonSize(button7);
       setButtonSize(button8);
       setButtonSize(button9);
       setButtonSize(button0);
       setButtonSize(buttonDOT);
       setButtonSize(buttonDIV);
       setButtonSize(buttonMUL);
       setButtonSize(buttonSUB);
       setButtonSize(buttonADD);
       setButtonSize(buttonEQU);
       setButtonSize(buttonC);
       setButtonSize(buttonMR);
       setButtonSize(buttonMsub);
       setButtonSize(buttonMadd);
       setButtonSize(buttonMC);

       gp.add(button7, 0, 0);
       gp.add(button8, 1, 0);
       gp.add(button9, 2, 0);
       gp.add(buttonDIV, 3, 0);

       gp.add(button4, 0, 1);
       gp.add(button5, 1, 1);
       gp.add(button6, 2, 1);
       gp.add(buttonMUL, 3, 1);

       gp.add(button1, 0, 2);
       gp.add(button2, 1, 2);
       gp.add(button3, 2, 2);
       gp.add(buttonSUB, 3, 2);

       gp.add(button0, 0, 3);
       gp.add(buttonDOT, 1, 3);
       gp.add(buttonEQU, 2, 3);
       gp.add(buttonADD, 3, 3);
       
       gp.add(buttonC, 0, 4);
       gp.add(buttonMR, 1, 4);
       gp.add(buttonMsub, 2, 4);
       gp.add(buttonMadd, 3, 4);
       
       gp.add(buttonMC, 0, 5);
       
       /*
        * Event Handling
        */
       //String text=tf.getText();
       
       
       button7.setOnAction(new EventHandler<ActionEvent>(){
      	  @Override
      	  public void handle(ActionEvent e) {
      		  if(reset) {
      			  reset=false;
      			  tf.setText("");
      		  }
      		  String text=tf.getText();
      		  tf.setText(text+"7");
      	  }
         });
       button8.setOnAction(new EventHandler<ActionEvent>(){
       	  @Override
       	  public void handle(ActionEvent e) {
       		  if(reset) {
      			  reset=false;
      			  tf.setText("");
      		  }
       		String text=tf.getText();
       		  tf.setText(text+"8");
       	  }
          });
       button9.setOnAction(new EventHandler<ActionEvent>(){
       	  @Override
       	  public void handle(ActionEvent e) {
       		  if(reset) {
      			  reset=false;
      			  tf.setText("");
      		  }
       		String text=tf.getText();
       		  tf.setText(text+"9");
       	  }
          });
       button4.setOnAction(new EventHandler<ActionEvent>(){
       	  @Override
       	  public void handle(ActionEvent e) {
       		  
       		  if(reset) {
      			  reset=false;
      			  tf.setText("");
      		  }
       		String text=tf.getText();
       		  tf.setText(text+"4");
       	  }
          });
       button5.setOnAction(new EventHandler<ActionEvent>(){
       	  @Override
       	  public void handle(ActionEvent e) {
       		  if(reset) {
      			  reset=false;
      			  tf.setText("");
      		  }
       		String text=tf.getText();
       		  tf.setText(text+"5");
       	  }
          });
       button6.setOnAction(new EventHandler<ActionEvent>(){
       	  @Override
       	  public void handle(ActionEvent e) {
       		  if(reset) {
      			  reset=false;
      			  tf.setText("");
      		  }
       		String text=tf.getText();
       		  tf.setText(text+"6");
       	  }
          });
       button1.setOnAction(new EventHandler<ActionEvent>(){
       	  @Override
       	  public void handle(ActionEvent e) {
       		  if(reset) {
      			  reset=false;
      			  tf.setText("");
      		  }
       		String text=tf.getText();
       		  tf.setText(text+"1");
       	  }
          });
       button2.setOnAction(new EventHandler<ActionEvent>(){
       	  @Override
       	  public void handle(ActionEvent e) {
       		  if(reset) {
      			  reset=false;
      			  tf.setText("");
      		  }
       		String text=tf.getText();
       		  tf.setText(text+"2");
       	  }
          });
       button3.setOnAction(new EventHandler<ActionEvent>(){
       	  @Override
       	  public void handle(ActionEvent e) {
       		  if(reset) {
      			  reset=false;
      			  tf.setText("");
      		  }
       		String text=tf.getText();
       		  tf.setText(text+"3");
       	  }
          });
       button0.setOnAction(new EventHandler<ActionEvent>(){
       	  @Override
       	  public void handle(ActionEvent e) {
       		  if(reset) {
      			  reset=false;
      			  tf.setText("");
      		  }
       		String text=tf.getText();
       		  tf.setText(text+"0");
       	  }
          });
       buttonDOT.setOnAction(new EventHandler<ActionEvent>(){
       	  @Override
       	  public void handle(ActionEvent e) {
       		  if(reset) {
      			  reset=false;
      			  tf.setText("");
      		  }
       		String text=tf.getText();
       		  tf.setText(text+".");
       	  }
          });
       buttonC.setOnAction(new EventHandler<ActionEvent>(){
        	  @Override
        	  public void handle(ActionEvent e) {
        		  first="";
        		  operator="";
        		  tf.setText("");
        	  }
           });
       buttonADD.setOnAction(new EventHandler<ActionEvent>(){
     	  @Override
     	  public void handle(ActionEvent e) {
     		  
     		 if(!tf.getText().isEmpty()) { 
	     		 String text=tf.getText();
	     		 first=text;
	     		 operator=buttonADD.getText();
	     		 System.out.println(text+operator);
	     		  tf.setText("");
     		 }
     	  }
        });
       buttonSUB.setOnAction(new EventHandler<ActionEvent>(){
      	  @Override
      	  public void handle(ActionEvent e) {
      		  
//      		 System.out.println("tf.getText: "+tf.getText());
      		 if(tf.getText().isEmpty()) {
      			System.out.println(false);
      			 first="-";
      			 tf.setText("-");
      		 }
      		 else{
      			 //System.out.println(false);
	      		 String text=tf.getText();
	      		 first=text;
	      		 operator=buttonSUB.getText();
	      		 System.out.println(text+operator);
	      		 tf.setText("");
      		 }
      	  }
         });
       buttonDIV.setOnAction(new EventHandler<ActionEvent>(){
       	  @Override
       	  public void handle(ActionEvent e) {
       		  
       		 if(!tf.getText().isEmpty()) { 
	       		 String text=tf.getText();
	       		 first=text;
	       		 operator=buttonDIV.getText();
	       		 System.out.println(text+operator);
	       		  tf.setText("");
       		 }
       	  }
          });
       buttonMUL.setOnAction(new EventHandler<ActionEvent>(){
       	  @Override
       	  public void handle(ActionEvent e) {
       		  
       		 if(!tf.getText().isEmpty()) { 
	       		 String text=tf.getText();
	       		 first=text;
	       		 operator=buttonMUL.getText();
	       		 System.out.println(text+operator);
	       		  tf.setText("");
       		 }
       	  }
          });
       buttonEQU.setOnAction(new EventHandler<ActionEvent>(){
        	  @Override
        	  public void handle(ActionEvent e) {
        		  
        		  if(!tf.getText().isEmpty()) {
	        		 String text=tf.getText();
	        		 double secondNum=Double.parseDouble(text);
	        		 double firstNum=Double.parseDouble(first);
	        		 String total;
	        		 if(operator=="+") {
	        			 total=Double.toString(firstNum+secondNum);
	        			 
	        			 tf.setText(total);
	        			 //first=total;
	        			 reset=true;
	        			 System.out.println(total);
	        		 }
	        		 if(operator=="-") {
	        			 total=Double.toString(firstNum-secondNum);
	        			 
	        			 tf.setText(total);
	        			 //first=total;
	        			 reset=true;
	        			 System.out.println(total);
	        		 }
	        		 if(operator=="*") {
	        			 total=Double.toString(firstNum*secondNum);
	        			 
	        			 tf.setText(total);
	        			 //first=total;
	        			 reset=true;
	        			 System.out.println(total);
	        		 }
	        		 if(operator=="/") {
	        			 total=Double.toString(firstNum/secondNum);
	        			 
	        			 tf.setText(total);
	        			 //first=total;
	        			 reset=true;
	        			 System.out.println(total);
	        		 }
	        		 first="";
	        	  }
        	  }	  
           });
       buttonMadd.setOnAction(new EventHandler<ActionEvent>(){
        	  @Override
        	  public void handle(ActionEvent e) {
        		  
        		 String text=tf.getText();
        		 double secondNum=Double.parseDouble(text);
        		 double firstNum;
        		 if(memory!="") {
        			 firstNum=Double.parseDouble(memory);
        		 }else {
        			 firstNum=0;
        		 }
        		 String total=Double.toString(firstNum+secondNum);
        		 memory=total;
//        		 //first=text;
//        		 
//        		 //operator=buttonMUL.getText();
        		 System.out.println("Madd:"+text);
        		 System.out.println("MaddTotal:"+memory);
        		  tf.setText("");
        	  }
           });
       
       buttonMsub.setOnAction(new EventHandler<ActionEvent>(){
     	  @Override
     	  public void handle(ActionEvent e) {
     		  
     		 String text=tf.getText();
     		 double secondNum=Double.parseDouble(text);
     		 double firstNum;
     		 if(memory!="") {
     			 firstNum=Double.parseDouble(memory);
     		 }else {
     			 firstNum=0;
     		 }
     		 String total=Double.toString(firstNum-secondNum);
     		 memory=total;
//     		 //first=text;
//     		 
//     		 //operator=buttonMUL.getText();
     		 System.out.println("Msub:"+text);
     		 System.out.println("MsubTotal:"+memory);
     		  tf.setText("");
     	  }
        });
       buttonMR.setOnAction(new EventHandler<ActionEvent>(){
      	  @Override
      	  public void handle(ActionEvent e) {
      		    
	      		 tf.setText(memory);
	      		 System.out.println("memory: "+memory);
      	  }
         });
       buttonMC.setOnAction(new EventHandler<ActionEvent>(){
       	  @Override
       	  public void handle(ActionEvent e) {
       		  
	       		memory="";
	       		System.out.println("memory: "+memory);
       	  	}
          });
       
       
       root.setCenter(gp);

       primaryStage.setScene(new Scene(root, 300, 350));
       primaryStage.show();
       
   }
   
   public void setButtonSize(Button button){
       button.setPrefHeight(42.0);
       button.setPrefWidth(42.0);
   }
  
 
   public static void main(String[] args) {
       launch(args);
   }
   
}