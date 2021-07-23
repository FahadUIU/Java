import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Empty extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Text t=new Text("User ID:");
        TextField tf=new TextField();
        Text pass=new Text("Password");
        PasswordField pf=new PasswordField();
        HBox hBox1=new HBox();
        hBox1.getChildren().add(t);
        hBox1.getChildren().add(tf);
        HBox hBox2=new HBox();
        hBox2.getChildren().add(pass);
        hBox2.getChildren().add(pf);
        Button b=new Button("Submit");
        VBox vBox=new VBox();
        vBox.getChildren().add(hBox1);
        vBox.getChildren().add(hBox2);
        vBox.getChildren().add(b);
        Scene scene=new Scene(vBox,800,500);
        stage.setScene(scene);
        stage.setTitle("My App");
        stage.show();

    }
}
