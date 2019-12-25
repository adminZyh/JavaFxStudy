import javafx.application.Application;
import javafx.stage.Stage;

/**
 * 生命周期
 * main()->init()->start()->stop()
 * 窗口关闭调用stop()
 */
public class Application3 extends Application {
    public static void main(String[] args) {
        System.out.println("main:"+Thread.currentThread().getName());
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("start:"+Thread.currentThread().getName());
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("init:"+Thread.currentThread().getName());
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("stop:"+Thread.currentThread().getName());
    }
}
