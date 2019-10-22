package dad.javafx.buscarYReemplazar;




import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYReemplazar extends Application {
	Label buscarLabel,reemplazarLabel;
	TextField buscarText,reemplazarText;
	Button buscarBtn,reemplazarBtn,reemplazarAllBtn, cerrarBtn,ayudaBtn;
	CheckBox mayusculasRadio,buscarAtrásRadio,expresiónRegularRadio,resaltarResultadosRadio;
	public void start(Stage primaryStage) throws Exception {
		
		buscarLabel=new Label();
		buscarLabel.setText("Buscar");
		
		reemplazarLabel=new Label();
		reemplazarLabel.setText("Remplazar con");
		
		buscarText=new TextField();
		
		reemplazarText=new TextField();
		
		
		reemplazarAllBtn=new Button();
		reemplazarAllBtn.setText("Reemplazar todo");
		reemplazarAllBtn.setMaxWidth(Double.MAX_VALUE);
		//reemplazarAllBtn.setPadding(new Insets(5));
		
		buscarBtn=new Button();
		buscarBtn.setText("Buscar");
		buscarBtn.setMaxWidth(Double.MAX_VALUE);
		
		reemplazarBtn=new Button();
		reemplazarBtn.setText("Reemplazar");
		reemplazarBtn.setMaxWidth(reemplazarAllBtn.getMaxWidth());
		
	
		
		cerrarBtn=new Button();
		cerrarBtn.setText("Cerrar");
		cerrarBtn.setMaxWidth(Double.MAX_VALUE);
		
		ayudaBtn=new Button();
		ayudaBtn.setText("Ayuda");
		ayudaBtn.setMaxWidth(Double.MAX_VALUE);
		
		
		mayusculasRadio=new CheckBox();
		mayusculasRadio.setText("Mayúsculas y minúsculas");
		
		buscarAtrásRadio=new CheckBox();
		buscarAtrásRadio.setText("Buscar hacia atrás");
		
		expresiónRegularRadio=new CheckBox();
		expresiónRegularRadio.setText("Expresión regurar");
		
		resaltarResultadosRadio=new CheckBox();
		resaltarResultadosRadio.setText("Resaltar resultados");
		
//		ToggleGroup ficheroGroup=new ToggleGroup();//para que solo se pueda selecionar carpeta o fichero
//		ficheroGroup.getToggles().addAll(mayusculasRadio,buscarAtrásRadio);
		
		VBox colum1=new VBox(5,buscarLabel,reemplazarLabel);
		colum1.setPadding(new Insets(5));
		colum1.setAlignment(Pos.BASELINE_LEFT);
		
		
		VBox rootBtn1=new VBox(4,mayusculasRadio,resaltarResultadosRadio);
		
		
		VBox rootBtn2=new VBox(4,expresiónRegularRadio,buscarAtrásRadio);
		rootBtn2.setAlignment(Pos.CENTER_LEFT);
		HBox rootH=new HBox(rootBtn1,rootBtn2);
		
		
		VBox colum2=new VBox(5,buscarText,reemplazarText,rootH);
		colum2.setPadding(new Insets(5));
		VBox colum3=new VBox(5,buscarBtn,reemplazarBtn,reemplazarAllBtn,cerrarBtn,ayudaBtn);
		colum3.setPadding(new Insets(5));
		
		HBox root1 =new HBox(5,colum1,colum2);
		
		
		GridPane root =new GridPane();
		root.addColumn(0, colum1);
		root.addColumn(1, colum2);
		root.addColumn(2,colum3);
		//HBox root=new HBox(root1,root2);
		root.setHgap(5);
		root.setVgap(5);
		root.setPadding(new Insets(8));
		root.setGridLinesVisible(true);
		/*root.addRow(0, rutaLabel,rutaTextF);
		root.addRow(1, fila);
		root.addRow(2, elegidoTextF);
		root.addRow(3, verFichYCarpBtn);
		root.addRow(4, listadoListV);
		root.addRow(5, columna1,contenidoFichTextA);*/
		
		ColumnConstraints[] cols= {
				new ColumnConstraints(),
				new ColumnConstraints(),
				new ColumnConstraints()
		};
		
		cols[1].setFillWidth(true);
		cols[1].setHgrow(Priority.ALWAYS);//para que se modifique el tamño de la segunda columna 
		root.getColumnConstraints().setAll(cols);
		
		/*GridPane.setMargin(rutaLabel,new Insets(3));
		GridPane.setMargin(verFichYCarpBtn,new Insets(3));
		GridPane.setMargin(columna1,new Insets(3));
		//GridPane.setFillWidth(columna1, true);
		//GridPane.setFillWidth(listadoActListV, true);
		GridPane.setColumnSpan(elegidoTextF,2);
		GridPane.setColumnSpan(listadoListV,2);
		GridPane.setColumnSpan(fila,2);
		GridPane.setMargin(elegidoTextF, new Insets(5));*/
		
		Scene scene=new  Scene(root,480,220);
		primaryStage.setTitle("BuscarYReemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
