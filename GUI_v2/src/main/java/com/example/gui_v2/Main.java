package com.example.gui_v2;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import  java.util.Date;

public class Main extends Application {
int a = 0;
//total number of calories
int b = 1;
//total number of grams
int c;
	int d;
	int e;
	int f;
	int g;
	public  static GridPane initRootLayout(){
		GridPane root = new GridPane();
		root.setAlignment(Pos.CENTER);
		root.setHgap(10);
		root.setVgap(10);
		root.setPadding(new Insets(25));

		Text scenetitle = new Text("Calculation of calories");
		Font fontBig = Font.font("Tahoma", FontWeight.NORMAL, 26);
		scenetitle.setFont(fontBig);

		root.add(scenetitle, 0, 0, 2, 1);

		Label sausage = new Label("Number of gramms");
		sausage.setFont(fontBig);
		root.add(sausage, 0, 1);

		TextField sausageTextField = new TextField();
		sausageTextField.setFont(fontBig);
		root.add(sausageTextField, 1, 1);

		Text result = new Text("Result");
		result.setFont(fontBig);
		root.add(result, 0, 6);
		Button btn1 = new Button("добавить индейку");
		btn1.setOnAction(event -> {
			int c = 198;
				});
		root.add(btn1, 1, 7);
		Button btn2 = new Button("добавить омлет");
		btn2.setOnAction(event -> {
			int d = 209;
		});
		root.add(btn2, 1, 8);
		Button btn3 = new Button("добавить вафли");
		btn3.setOnAction(event -> {
			int e = 543;
		});
		root.add(btn3, 1, 9);

		Button btn4 = new Button("добавить вишню");
		btn4.setOnAction(event -> {
			int f = 52;
		});
		root.add(btn4, 1, 10);
		Button btn5 = new Button("добавить индейку");
		btn5.setOnAction(event -> {
			int g = 13;
		});
		root.add(btn5, 1, 11);
		Button btn = new Button("calculate");
		btn.setFont(fontBig);
		btn.setOnAction(event -> {
			int a = (a * b) + c + d + e + f + g;
		});
		root.add(btn, 1, 5);
		return root;
	}

	@Override
	public void start(Stage primaryStage) {
		GridPane root = initRootLayout();
		Scene scene = new Scene(root, 600, 500);
		primaryStage.setTitle("Bullshit Calories");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static  void main(String[] args) {
		launch();
	}
}


