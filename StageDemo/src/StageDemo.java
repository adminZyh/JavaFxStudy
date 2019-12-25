import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class StageDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.getIcons().add(new Image("/image/a.png"));      //设置图标
        primaryStage.setTitle("Javafx Stage");
        //primaryStage.setIconified(true);       //设置最小化
        //primaryStage.setMaximized(true);         //设置最大化
        primaryStage.setWidth(500);                //宽
        primaryStage.setHeight(500);                //高
        //primaryStage.setResizable(false);          //设置宽高不可改变


        primaryStage.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {     //高属性绑定，当高度变化时打印
                System.out.println("高oldValue:"+oldValue.doubleValue());
                System.out.println("高newValue"+newValue.doubleValue());
                //primaryStage.setOpacity(0.5);        //设置透明度
            }
        });

        primaryStage.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {     //宽度绑定，当宽度变化时绑定
                System.out.println("高oldValue:"+oldValue.doubleValue());
                System.out.println("高newValue"+newValue.doubleValue());
            }
        });

        //全屏
        //primaryStage.setFullScreen(true);              //设置全屏
        primaryStage.setScene(new Scene(new Group()));
        primaryStage.show();                     //显示
        //primaryStage.close();                   //关闭



        primaryStage.setMaxHeight(700);              //最大宽
        primaryStage.setMaxWidth(700);                //最大高
        primaryStage.setMinHeight(100);                 //最小高
        primaryStage.setMinWidth(100);                //最大宽

        //System.out.println("高："+primaryStage.getHeight());
        //System.out.println("宽："+primaryStage.getWidth());


    }
    public static void main(String[] args) {
        launch(args);
    }
}
