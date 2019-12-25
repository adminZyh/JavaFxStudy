import javafx.application.Application;
import javafx.stage.Stage;

public class ApplicationStart2 extends Application {
    public static void main(String[] args) {
        Application.launch(ApplicationStart2.class,args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("启动方式");
        primaryStage.show();
    }
}
