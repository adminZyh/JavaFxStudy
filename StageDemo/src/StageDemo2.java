import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StageDemo2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(new Group()));
        primaryStage.setAlwaysOnTop(true);     //窗口始终在上面
        primaryStage.setX(100);        //设置X坐标
        primaryStage.setY(100);         //设置Y坐标

        primaryStage.xProperty().addListener(new ChangeListener<Number>() {    //监听坐标变化
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("newValue:"+newValue.doubleValue());
            }
        });

        primaryStage.show();
    }
}
