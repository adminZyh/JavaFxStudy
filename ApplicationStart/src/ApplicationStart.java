import javafx.application.Application;
import javafx.stage.Stage;

/**
 * javafx的启动方式
 */
public class ApplicationStart extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("这是第一个javafx 程序");
        primaryStage.show();
        System.out.println("test");
    }
    public static void main(String[] args) {
        launch(args);
    }
}
