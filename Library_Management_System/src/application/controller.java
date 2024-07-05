package application;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

//import application.controller.Book;
//import application.controller.Book;
import javafx.application.Platform;
import javafx.beans.property.ReadOnlyBooleanWrapper;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
//import application.conBook;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

class FetchingBook
{
	private static FetchingBook inst;
    private List<Book> list1;

   
    private FetchingBook() {
        list1 = new ArrayList<>();
    }

    
    public static FetchingBook getInstance() {
        if (inst == null) 
        {
            inst = new FetchingBook();
        }
        return inst;
    }

	
	public List<Book> getbook()
	{
		return list1;
	}
	
	 public void removebook(Book b)
	 {
		 list1.remove(b);
	 }
  public void setbook(Book b)
  {
	  list1.add(b);
  }

public static List<Book> loadBooksFromFile(File seclected) {
	// TODO Auto-generated method stub
	return null;
}
}
 class Book  {
	String title,author,isbn;
	boolean available;
	
	Book()
	{
		title="";
		author="";
		isbn="";
		available=false;
	}
	public 
	Book(String t, String a, String i)
	{
		title=t;
		author=a;
		isbn=i;
		available=true;
	}
	public String gettitle() {
        return title;
    }
	public String getauthor() {
        return author;
    }
	 public String getisbn() {
	        return isbn;
	    }
	 public boolean getavailable() {
	        return available;
	    }
	 
    public void settitle(String t) {
        title = t;
    }

    
    public void setauthor(String a) {
        author = a;
    }

   
    public void setisbn(String i) {
        isbn = i;
    }

    public void setavailable(boolean a) {
        available = a;
    }
    
}


public class controller extends Book
{
	//private FetchingBook fetch=new FetchingBook();
	 public void setFetchingBook(FetchingBook f) {
	//        this.fetch = f;
	    }

private Stage stage;
private Scene scene;
private Parent root;
@FXML // fx:id="pane_home"
private AnchorPane pane_home; // Value injected by FXMLLoader
@FXML // fx:id="pane_home"
private AnchorPane pane_addingbook; // Value injected by FXMLLoader
@FXML // ResourceBundle that was given to the FXMLLoader
private ResourceBundle resources;

@FXML // URL location of the FXML file that was given to the FXMLLoader
private URL location;

@FXML // fx:id="Status_Message_Home"
private TextField  Status_Message_Home; // Value injected by FXMLLoader

@FXML // fx:id="New"
private MenuItem New; // Value injected by FXMLLoader

@FXML // fx:id="Open"
private MenuItem Open; // Value injected by FXMLLoader

@FXML // fx:id="Save"
private MenuItem Save; // Value injected by FXMLLoader

@FXML // fx:id="Save_As"
private MenuItem Save_As; // Value injected by FXMLLoader

@FXML // fx:id="Exit"
private MenuItem Exit; // Value injected by FXMLLoader

@FXML // fx:id="AddBook"
private MenuItem AddBook; // Value injected by FXMLLoader

@FXML // fx:id="EditBook"
private MenuItem EditBook; // Value injected by FXMLLoader

@FXML // fx:id="DeleteBook"
private MenuItem DeleteBook; // Value injected by FXMLLoader

@FXML // fx:id="View_Book"
private MenuItem View_Book; // Value injected by FXMLLoader

@FXML // fx:id="Search_Book"
private MenuItem Search_Book; // Value injected by FXMLLoader

@FXML // fx:id="titlefield_Addbook"
private TextField titlefield_Addbook; // Value injected by FXMLLoader

@FXML // fx:id="authorfield_Addbook"
private TextField authorfield_Addbook; // Value injected by FXMLLoader

@FXML // fx:id="isbnfield_Addbook"
private TextField isbnfield_Addbook; // Value injected by FXMLLoader

@FXML // fx:id="Cancel"
private Button Cancel; // Value injected by FXMLLoader
@FXML // fx:id="Cancel"
private Button Cancel1; // Value injected by FXMLLoader
@FXML // fx:id="Save_Button"
private Button Save_Button; // Value injected by FXMLLoader
@FXML
private AnchorPane main;
 private ArrayList<Book> list = new ArrayList<>();
 Book b=new Book();
 @FXML // fx:id="titlefield_Editbook"
 private TextField titlefield_Editbook; // Value injected by FXMLLoader

 @FXML // fx:id="authorfield_Editbook"
 private TextField authorfield_Editbook; // Value injected by FXMLLoader

 @FXML // fx:id="isbnfield_Editbook"
 private TextField isbnfield_Editbook; // Value injected by FXMLLoader

 //@FXML // fx:id="Cancel"
 //private Button Cancel; // Value injected by FXMLLoader

 @FXML // fx:id="Save_Edit_Button"
 private Button Save_Edit_Button; // Value injected by FXMLLoader

 @FXML // fx:id="title_Editbook"
 private TextField title_Editbook; // Value injected by FXMLLoader

 @FXML // fx:id="Save_Button1"
 private Button Save_Button1; // Value injected by FXMLLoader

 @FXML // fx:id="Status_Message_Edit"
 private TextField Status_Message_Edit; // Value injected by FXMLLoader

 private String usertext;

 @FXML // fx:id="title_deletebook"
 private TextField title_deletebook; // Value injected by FXMLLoader

 @FXML // fx:id="delete_Ok"
 private Button delete_Ok; // Value injected by FXMLLoader

 @FXML // fx:id="Status_Message_Delete"
 private TextField Status_Message_Delete; // Value injected by FXMLLoader
 @FXML // fx:id="TableView"
 private TableView<Book> TableView= new TableView<>(); // Value injected by FXMLLoader

 @FXML // fx:id="Title"
 private TableColumn<Book, String> Title=new TableColumn<>("Title");; // Value injected by FXMLLoader

 @FXML // fx:id="Author"
 private TableColumn<Book, String> Author=new TableColumn<>("Author");; // Value injected by FXMLLoader

 @FXML // fx:id="ISBN"
 private TableColumn<Book, String> ISBN=new TableColumn<>("ISBN");; // Value injected by FXMLLoader

 @FXML // fx:id="Availability"
 private TableColumn<Book, String> Availability=new TableColumn<>("Availability");; // Value injected by FXMLLoader

 @FXML // fx:id="TableView_Search"
 private TableView<Book> TableView_Search; // Value injected by FXMLLoader

 @FXML // fx:id="Title"
 private TableColumn<Book, String> Title1=new TableColumn<>("Title1");; // Value injected by FXMLLoader

 @FXML // fx:id="Author"
 private TableColumn<Book, String> Author1=new TableColumn<>("Author1");; // Value injected by FXMLLoader

 @FXML // fx:id="ISBN"
 private TableColumn<Book, String> ISBN1=new TableColumn<>("ISBN1");; // Value injected by FXMLLoader

 @FXML // fx:id="Availability"
 private TableColumn<Book, String> Availability1=new TableColumn<>("Availability1");; // Value injected by FXMLLoader


 @FXML // fx:id="Status_Message_Search"
 private TextField Status_Message_Search; // Value injected by FXMLLoader

 @FXML // fx:id="title_Editbook"
 private TextField title_Searchbook; // Value injected by FXMLLoader

 @FXML // fx:id="Ok_SearchButton"
 private Button Ok_SearchButton; // Value injected by FXMLLoader

 @FXML // fx:id="Box"
 private ComboBox<String> Box; // Value injected by FXMLLoader


 @FXML
 private TextField Status_Message_View;


@FXML
void Home(ActionEvent event) throws IOException {
	//Platform.exit();
	
	String message="Book Added";
    loadScene("home.fxml",message);
}

@FXML
void Save_adding(ActionEvent event) throws IOException
{
	if(Cancel==event.getSource())
	{
		String msg=" ";
		stage.close();
		loadScene("home.fxml",msg);
	}
	if(Save_Button==event.getSource())
	{
		String Isbn=isbnfield_Addbook.getText();
		 Isbn=Isbn.replaceAll("-", "");
		if ((Isbn.length() != 10 && Isbn.length() != 13&&Isbn.matches("[0-9X]+"))||titlefield_Addbook.getText().isEmpty() || authorfield_Addbook.getText().isEmpty() )
		{
            Alert alrt = new Alert(AlertType.ERROR);
            alrt.setTitle("Error!");
            alrt.setContentText("Kindly Fill all the Required Fields given properly.");
            alrt.setHeaderText("Book cannot be Added in the library!");
         
            alrt.showAndWait();
        } else 
        {
        	b.settitle(titlefield_Addbook.getText());
        	b.setauthor(authorfield_Addbook.getText());
        	b.setisbn(isbnfield_Addbook.getText());
        	b.setavailable(true);
        	FetchingBook.getInstance().setbook(b);

            // Reload the TableView to reflect the changes
        	loadingbook();
        	list.add(b);
        	//list1.add(b);
        	
            Alert alrt = new Alert(AlertType.INFORMATION);
            alrt.setTitle("Success");
            alrt.setHeaderText("Congratulations to you!");
            alrt.setContentText("Book is Added Successfully!");
            alrt.showAndWait();
        }


		
	String msg=" ";
	stage.close();
	loadScene("home.fxml",msg);
	
	}
}
@FXML
void AddingBook(ActionEvent event) throws IOException {
	String message=" ";
    loadScene("addbook.fxml",message);
}

private void loadScene(String fxml,String msg) throws IOException {
	
	if (stage != null) {
		 stage.close(); 
		
		 }
	 //Platform.exit();
	 FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
	    Parent root = loader.load();
	    Scene scene = new Scene(root);
	    stage =new Stage();
	    stage.setScene(scene);
	  // msg="hi";
	    stage.show();
	    
	    /*if(msg!=" ")
	    {
	    	Status_Message_Home.setText(msg);
	    	scene.setOnMouseEntered(Status_Message_Home);
	    }*/
}
@FXML
void DeletingBook(ActionEvent event) throws IOException {
	String message=" ";
    loadScene("deletebook.fxml",message);
}
@FXML
void Checking_Delete_Title(ActionEvent event) {
	
	if(FetchingBook.getInstance().getbook() == null)
	{
		Status_Message_Edit.setText("No Book exit");
		return;
		
	}
	else
	{
		for (Book bo : FetchingBook.getInstance().getbook()) 
		{
		 System.out.println("Title: " + bo.gettitle());
		 System.out.println("Title: " + title_deletebook.getText());
		//Status_Message_Edit.setText(bo.gettitle());
		 if (title_deletebook.getText().equals(bo.gettitle()))
		 {
			 FetchingBook.getInstance().removebook(bo);
			
    	Status_Message_Delete.setText("Book removed");
    	return;
		}
    	
		//Status_Message_Edit.setText("Book existt");
	    }
Status_Message_Edit.setText("Book not exit");
//return;	
	}
	}

@FXML
void EditingBook(ActionEvent event) throws IOException {
	String message=" ";
    loadScene("editingbook.fxml",message);
}

@FXML
void Checking_Edit_Title(ActionEvent event) {
   	if(FetchingBook.getInstance().getbook() == null)
		{
   		Status_Message_Edit.setText("No Book exit");
			return;
			
		}
   	else
   		{
   		for (Book bo : FetchingBook.getInstance().getbook()) 
    	{
    		 System.out.println("Title: " + bo.gettitle());
    		 System.out.println("Title: " + title_Editbook.getText());
    		//Status_Message_Edit.setText(bo.gettitle());
    		 if (title_Editbook.getText().equals(bo.gettitle()))
    		{
    			titlefield_Editbook.setDisable(false);
    			authorfield_Editbook.setDisable(false);
    			isbnfield_Editbook.setDisable(false);
        	titlefield_Editbook.setEditable(true);
        	authorfield_Editbook.setEditable(true);
        	isbnfield_Editbook.setEditable(true);
        	//bo.settitle=titlefield.getText();
        	
        //	bo.author=authorfield.getText();
        	//bo.isbn=isbnfield.getText();
        	//bo.available=true;
        	//((Book) bo)
        	Status_Message_Edit.setText("Book exist");
        	return;
    		}
        	
    		//Status_Message_Edit.setText("Book existt");
    	}
    //	Status_Message_Edit.setText("Book not exit");
	//return;	
   		}
}
@FXML
void Save_Editing(ActionEvent event) throws IOException {
	if(Cancel1==event.getSource())
	{
		String msg=" ";
		stage.close();
		loadScene("home.fxml",msg);
	}
	if(Save_Edit_Button==event.getSource())
	{
	for (Book bo : FetchingBook.getInstance().getbook()) 
	{
		//MessageInformation.setText(bo.gettitle());
		if (title_Editbook.getText().equals(bo.gettitle()))
		{
			String Isbn=isbnfield_Editbook.getText();
			 Isbn=Isbn.replaceAll("-", "");
			if ((Isbn.length() != 10 && Isbn.length() != 13&&Isbn.matches("[0-9X]+"))||titlefield_Editbook.getText().isEmpty() || authorfield_Editbook.getText().isEmpty() )
			{
	            Alert alrt = new Alert(AlertType.ERROR);
	            alrt.setTitle("Error!");
	            alrt.setContentText("Kindly Fill all the Required Fields given properly.");
	            alrt.setHeaderText("Book cannot be Edited in the library!");
	         
	            alrt.showAndWait();
	        }else 
	        {
	        	 bo.settitle(titlefield_Editbook.getText());
					//((Book) bo)
					bo.setauthor(authorfield_Editbook.getText());
					bo.setisbn(isbnfield_Editbook.getText());
					bo.setavailable(true);
					Status_Message_Edit.setText("Book edited");
	        	
	        	//list.add(b);
	            Alert alrt = new Alert(AlertType.INFORMATION);
	            alrt.setTitle("Success");
	            alrt.setHeaderText("Congratulations to you!");
	            alrt.setContentText("Book is Edited Successfully in the library");
	            alrt.showAndWait();
	        }

			break;
		}
		
    	
	}
		
	}
	
	String msg=" ";
	stage.close();
	loadScene("home.fxml",msg);
}
@FXML
void HandlingView_Book(ActionEvent event) throws IOException {
	String msg=" ";
	loadScene("viewallbook.fxml",msg);
}
@FXML
void Allow_viewBooks(ActionEvent event) {
	  Title.setCellValueFactory(new PropertyValueFactory<>("title"));
	    Author.setCellValueFactory(new PropertyValueFactory<>("author"));
	    ISBN.setCellValueFactory(new PropertyValueFactory<>("isbn"));
	    Availability.setCellValueFactory(new PropertyValueFactory<>("available"));
	    ObservableList<Book> allbook = FXCollections.observableArrayList( FetchingBook.getInstance().getbook());
	         
		    TableView.setItems(allbook);
		            Title.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().gettitle()));
		            Author.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getauthor()));
		            ISBN.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(String.valueOf(cellData.getValue().getisbn())));
		            Availability.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(String.valueOf(cellData.getValue().getavailable()))); 
		
		            Status_Message_View.setText("Books Displayed");
		        	for (Book bo : FetchingBook.getInstance().getbook()) 
		        	{
		            System.out.println("isbn: " + bo.getisbn());
		        	}
		            
  // loadingbook();
     

}

private void loadingbook()
{
	List<Book> books = FetchingBook.getInstance().getbook();

    
    TableView.getItems().clear();

   
    TableView.getItems().addAll(books);
	//List<Book> b = FetchingBook.getInstance().getbook();
	/*if (FetchingBook.getInstance().getbook() != null) {
        TableView.setItems(FetchingBook.getInstance().getbook());
    }

    */
}
@FXML // fx:id="Enable_combobox"
private Button Enable_combobox; // Value injected by FXMLLoader

@FXML
void Enabling_combobox(ActionEvent event) {
Box.setDisable(false);
title_Searchbook.setDisable(false);
title_Searchbook.setEditable(true);
List<String> item = Arrays.asList("Title", "Author");
Box.getItems().addAll(item);
}
@FXML
void Checking_Search(ActionEvent event) {
	if("Title"==Box.getValue())
	{
		for (Book bo : FetchingBook.getInstance().getbook()) 
		{
			//MessageInformation.setText(bo.gettitle());
			if (title_Searchbook.getText().equals(bo.gettitle()))
			{
				Title1.setCellValueFactory(new PropertyValueFactory<>("title"));
			    Author1.setCellValueFactory(new PropertyValueFactory<>("author"));
			    ISBN1.setCellValueFactory(new PropertyValueFactory<>("isbn"));
			    Availability1.setCellValueFactory(new PropertyValueFactory<>("available"));
			    List<Book> seachbook=new ArrayList<>();
			    seachbook.add(bo);
			    ObservableList<Book> all = FXCollections.observableArrayList( seachbook);
			      
			    // FilteredList<Book> fList = new FilteredList<>(FetchingBook.getInstance().getbook());
			    
			   // TableView_Search.setItems(fList);


			    TableView_Search.setItems(all);
				            Title1.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().gettitle()));
				            Author1.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getauthor()));
				            ISBN1.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(String.valueOf(cellData.getValue().getisbn())));
				            Availability1.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(String.valueOf(cellData.getValue().getavailable()))); 
				            Status_Message_Search.setText("Book Searched");
				           
				            System.out.println("title: " + bo.gettitle());
				        	
				            return;
			}
			
			
		}
		 Status_Message_Search.setText("Book not Exit");
         return;
	}
	else if("Author"==Box.getValue())
	{
		for (Book bo : FetchingBook.getInstance().getbook()) 
		{
			//MessageInformation.setText(bo.gettitle());
			if (title_Searchbook.getText().equals(bo.getauthor()))
			{
				Title1.setCellValueFactory(new PropertyValueFactory<>("title"));
			    Author1.setCellValueFactory(new PropertyValueFactory<>("author"));
			    ISBN1.setCellValueFactory(new PropertyValueFactory<>("isbn"));
			    Availability1.setCellValueFactory(new PropertyValueFactory<>("available"));
			    List<Book> seachbook=new ArrayList<>();
			    seachbook.add(bo);
			    ObservableList<Book> all = FXCollections.observableArrayList( seachbook);
			         
			    TableView_Search.setItems(all);
				            Title1.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().gettitle()));
				            Author1.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getauthor()));
				            ISBN1.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(String.valueOf(cellData.getValue().getisbn())));
				            Availability1.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(String.valueOf(cellData.getValue().getavailable()))); 
				            Status_Message_Search.setText("Book Searched");
				            
				            System.out.println("title: " + bo.gettitle());
				        	return;
				            //break;
			}
			
			
		}
		Status_Message_Search.setText("Book not Exit");
        return;
	}
	else {
		
	}
}
@FXML
void HandlingSave(ActionEvent event) throws IOException{
	if (currFile == null) {
		HandlingSave_As(event);
            String msg;
        
    } else {
    	
    	//	FetchingBook.saveBooksToFile(TableView.getItems(), currFile);
    		String msg;
        }
    

} 

@FXML
void HandleSearch_Book(ActionEvent event) throws IOException {
	String msg=" ";
//Box.accessibleTextProperty();
	 //Box.getItems().addAll("Title", "Author");
	loadScene("searchbook.fxml",msg);
	//Box.setItems(FXCollections.observableArrayList("Title", "Author"));
	
}

@FXML
void HandlingExit(ActionEvent event) {
Platform.exit();
}

@FXML
void HandlingNew(ActionEvent event) throws IOException {
	Alert confirm = new Alert(AlertType.CONFIRMATION);
	confirm.setHeaderText("Starting a New File");
	confirm.setTitle("New File");
    confirm.showAndWait();
    TableView.getItems().clear();
}
private File currFile;

@FXML
void HandlingOpen(ActionEvent event) throws IOException{
	FileChooser choose = new FileChooser();
	choose.setTitle("Open the Book file");
    File seclected = choose.showOpenDialog(null);
    if (seclected == null) { 
    	String msg;   
    }
    else
    {
    	  currFile = seclected;
        List<Book> loadedBooks = FetchingBook.loadBooksFromFile(seclected);
        String msg;
    }

}


@FXML
void HandlingSave_As(ActionEvent event) {
	FileChooser choose = new FileChooser();
    choose.setTitle("Save Book File");
    File selcted = choose.showSaveDialog(null);
    if (selcted == null) {
    	String msg;
    }
    else
    {
    	String msg;	
        	//FetchingBook.saveBooksToFile(TableView.getItems(), selcted);
            currFile = selcted;
            String msg1;
    }
}


@FXML // This method is called by the FXMLLoader when initialization is complete
void initialize() {
	 stage = new Stage();
	 
}

}
