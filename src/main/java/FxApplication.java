import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.SnapshotResult;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class FxApplication extends Application {


    /**
     * Testing code lifted from the site https://www.mkyong.com/javafx/javafx-hello-world-example/
     *
     * @param stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        createStage(stage);
        createPng(stage.getScene());
    }

    private void createPng(Scene scene) {
        WritableImage image = scene.snapshot(null);


        try {
            File file = File.createTempFile("test", ".png");
            ImageIO.write(SwingFXUtils.fromFXImage(image, null), "png", file);
            System.out.println(file.getAbsolutePath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void createStage(Stage stage) {
        stage.setTitle("Hello World!");

        GridPane grid = new GridPane();
        grid.setHgap(0);
        grid.setVgap(0);

        Rectangle r1 = new Rectangle();
        r1.setFill(Color.DARKKHAKI);
        r1.setHeight(125);
        r1.setWidth(125);

        Rectangle r2 = new Rectangle();
        r2.setFill(Color.rgb(189, 40, 40));
        r2.setHeight(125);
        r2.setWidth(125);

        Rectangle r3 = new Rectangle();
        r3.setFill(Color.hsb(235, 0.52, 0.36));
        r3.setHeight(125);
        r3.setWidth(125);

        Rectangle r4 = new Rectangle();
        r4.setFill(Color.web("b894cc"));
        r4.setHeight(125);
        r4.setWidth(125);

        grid.add(r1, 0, 0);
        grid.add(r2, 0, 1);
        grid.add(r3, 1, 0);
        grid.add(r4, 1, 1);

        Label l = new Label();
        l.setFont(new Font("Calibri", 15));
        l.setTextFill(Color.BLACK);

        Button button = new Button();
        button.setFont(new Font("Calibri", 15));
        button.setText("Say 'Hello World'");

        button.setOnAction(event -> l.setText("You said Hello to the world"));

        BorderPane bp = new BorderPane();
        bp.setBottom(l);
        BorderPane.setAlignment(l, Pos.CENTER);
        bp.setCenter(button);

        StackPane root = new StackPane();
        root.getChildren().add(grid);
        root.getChildren().add(bp);
        stage.setScene(new Scene(root, 250, 250));
        stage.show();
    }

}
