import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class LogIn extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Text t=new Text("User Id");
        TextField tf=new TextField();
        Text pass=new Text("Password");
        PasswordField p=new PasswordField();
        Button btn=new Button("Submit");
        Text output=new Text(" ---");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("ID: "+tf.getText());
                System.out.println("Pass: "+p.getText());
                //output.setText(tf.getText()+" "+p.getText());
                Text text=new Text(tf.getText()+" "+p.getText());
                HBox hBox=new HBox();
                hBox.getChildren().add(text);
                Scene s=new Scene(hBox,300,200);
                stage.setScene(s);
            }
        });
        HBox hBox1=new HBox();
        hBox1.getChildren().add(t);
        hBox1.getChildren().add(tf);
        HBox hBox2=new HBox();
        hBox2.getChildren().add(pass);
        hBox2.getChildren().add(p);
        HBox hBox3=new HBox();
        hBox3.getChildren().add(btn);
        HBox hBox4=new HBox();
        hBox4.getChildren().add(output);
        VBox vBox=new VBox();
        vBox.getChildren().add(hBox1);
        vBox.getChildren().add(hBox2);
        vBox.getChildren().add(hBox3);
        vBox.getChildren().add(hBox4);
        Scene scene=new Scene(vBox,500,300);
        stage.setScene(scene);
        stage.setTitle("Log In");
        stage.show();
    }
}
