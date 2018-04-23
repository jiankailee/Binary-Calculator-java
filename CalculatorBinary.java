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

public class CalculatorBinary extends Application {
   
	private String first;
	private String operator;
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
       Button button0 = new Button("0");
       Button buttonDIV = new Button("/");
       Button buttonMUL = new Button("*");
       Button buttonSUB = new Button("-");
       Button buttonADD = new Button("+");
       Button buttonEQU = new Button("=");
       Button buttonC = new Button("C");
       Button buttonShiftLeft = new Button("<<");
       Button buttonShiftRight = new Button(">>");
       Button buttonAND = new Button("&");
       Button buttonOR = new Button("|");
       Button buttonNOT = new Button("~");
       
       setButtonSize(button1);
       setButtonSize(button0);
       setButtonSize(buttonDIV);
       setButtonSize(buttonMUL);
       setButtonSize(buttonSUB);
       setButtonSize(buttonADD);
       setButtonSize(buttonEQU);
       setButtonSize(buttonC);
       setButtonSize(buttonShiftLeft);
       setButtonSize(buttonShiftRight);
       setButtonSize(buttonAND);
       setButtonSize(buttonOR);
       setButtonSize(buttonNOT);
 
       gp.add(button0, 0, 0);
       gp.add(button1, 1, 0);
       gp.add(buttonDIV, 0, 1);
       gp.add(buttonMUL, 1, 1);
       gp.add(buttonSUB, 2, 1);
       gp.add(buttonADD, 3, 1);
       gp.add(buttonEQU, 0, 2);
       gp.add(buttonC, 1, 2);
       gp.add(buttonShiftLeft, 2, 2);
       gp.add(buttonShiftRight, 3, 2);
       gp.add(buttonAND, 0, 3);
       gp.add(buttonOR, 1, 3);
       gp.add(buttonNOT, 2, 3);

       /*
        * Event Handling
        */
       //String text=tf.getText();
       
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
   		  
//   		 System.out.println("tf.getText: "+tf.getText());
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
      		 int secondNum=Integer.parseInt(text,2);
      		 int firstNum=Integer.parseInt(first,2);
      		 String total;
      		 System.out.println("second: "+secondNum+"first:"+firstNum);
      		 if(operator=="+") {
      			 total=Integer.toBinaryString(firstNum+secondNum);
      			 
      			 tf.setText(total);
      			 //first=total;
      			 reset=true;
      			 System.out.println(total);
      		 }
      		 if(operator=="-") {
      			total=Integer.toBinaryString(firstNum-secondNum);
      			 
      			 tf.setText(total);
      			 //first=total;
      			 reset=true;
      			 System.out.println(total);
      		 }
      		 if(operator=="*") {
      			total=Integer.toBinaryString(firstNum*secondNum);
      			 
      			 tf.setText(total);
      			 //first=total;
      			 reset=true;
      			 System.out.println(total);
      		 }
      		 if(operator=="/") {
      			total=Integer.toBinaryString(firstNum/secondNum);
      			 
      			 tf.setText(total);
      			 //first=total;
      			 reset=true;
      			 System.out.println(total);
      		 }
      		if(operator=="&") {
      			total=Integer.toBinaryString(firstNum & secondNum);
      			 
      			 tf.setText(total);
      			 //first=total;
      			 reset=true;
      			 System.out.println(total);
      		 }
      		if(operator=="|") {
      			total=Integer.toBinaryString(firstNum | secondNum);
      			 
      			 tf.setText(total);
      			 //first=total;
      			 reset=true;
      			 System.out.println(total);
      		 }
      		
      		 first="";
      	  }
  	  }	  
     });
    buttonShiftLeft.setOnAction(new EventHandler<ActionEvent>(){
    	 @Override
   	  public void handle(ActionEvent e) {
   		  
   		 if(!tf.getText().isEmpty()) { 
	       		 String text=tf.getText();
	       		 text=text+"0";
	       		  tf.setText(text);
   		 }
   	  }
    });
    
    buttonShiftRight.setOnAction(new EventHandler<ActionEvent>(){
   	 @Override
  	  public void handle(ActionEvent e) {
  		  
  		 if(!tf.getText().isEmpty()) { 
	       		 String text=tf.getText();
	       		int length=text.length();
	       		String newtext=text.substring(0, length-1);
	       		  tf.setText(newtext);
  		 }
  	  }
   });
    buttonAND.setOnAction(new EventHandler<ActionEvent>(){
      	 @Override
     	  public void handle(ActionEvent e) {
     		  
     		 if(!tf.getText().isEmpty()) { 
     			 String text=tf.getText();
	       		 first=text;
	       		 operator=buttonAND.getText();
	       		 System.out.println(text+operator);
	       		  tf.setText("");
     		 }
     	  }
      });
    buttonOR.setOnAction(new EventHandler<ActionEvent>(){
     	 @Override
    	  public void handle(ActionEvent e) {
    		  
    		 if(!tf.getText().isEmpty()) { 
    			 String text=tf.getText();
	       		 first=text;
	       		 operator=buttonOR.getText();
	       		 System.out.println(text+operator);
	       		  tf.setText("");
    		 }
    	  }
     });
    buttonNOT.setOnAction(new EventHandler<ActionEvent>(){
    	 @Override
   	  public void handle(ActionEvent e) {
   		  
   		 if(!tf.getText().isEmpty()) { 
   			 String text=tf.getText();
   			 int length= text.length();
   			 String result="";
   			 for(int i=0;i<length;i++) {
   				 if(text.charAt(i)=='1') {
   					result=result+"0";
   				 }else {
   					result=result+"1";
   				 }
   			 }
   			 System.out.println("result:"+result);
   			 tf.setText(result);
   		 }
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
