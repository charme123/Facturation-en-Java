package crm;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.IntegerStringConverter;

/**
 * FXML Controller class
 *
 * @author CHARME
 */
public class FactureController implements Initializable {
    @FXML
    TableView<LigneFacture> TViewLigneFacture;
    @FXML
    TableColumn<LigneFacture,Integer> colQuantite;
    @FXML
    TableColumn<LigneFacture,String> colProduit;
    @FXML
    TableColumn<LigneFacture,String> colDescription;
    @FXML
    TableColumn<LigneFacture,String> colPrix;
    @FXML
     TableColumn<LigneFacture,String> colCategorie;
    @FXML
    TableColumn<LigneFacture,String> colMontant;
    @FXML
    TableColumn<LigneFacture,String> colTaxe;
    @FXML
    private Label lblTotal;
   

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ObservableList<LigneFacture> lignes =FXCollections.observableArrayList() ;//Lignes de facture
        Facture mafacture=new Facture("2022/11/3","FACT1","Av,De L'Eglise n°89",200,356,90,93);//Facture en cours
        lignes.add(new LigneFacture(mafacture,3,"prod1","description1","ustensiles",4,4));//produit 1
        lignes.add(new LigneFacture(mafacture,3,"prod2","description2","telephones",10,4));//produit 2
        lignes.add(new LigneFacture(mafacture,3,"prod3","description3","habits",21,4));//produit 3
        lignes.add(new LigneFacture(mafacture,3,"prod4","description4","accessoires",43,4));//produit 4
        TViewLigneFacture.setEditable(true);//Rendre le tableView Editable
        TViewLigneFacture.getItems().addAll(lignes);
        colQuantite.setCellValueFactory(new PropertyValueFactory<>("quantite"));
        colProduit.setCellValueFactory(new PropertyValueFactory<>("produit"));
        colDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
        colPrix.setCellValueFactory(new PropertyValueFactory<>("prix"));
        colCategorie.setCellValueFactory(new PropertyValueFactory<>("categorie"));
        colMontant.setCellValueFactory(new PropertyValueFactory<>("total"));
        colTaxe.setCellValueFactory(new PropertyValueFactory<>("taxe"));
        IntegerStringConverter quantiteconverter=new IntegerStringConverter();
        colQuantite.setCellFactory(TextFieldTableCell.<LigneFacture,Integer>forTableColumn(quantiteconverter));
      
        colQuantite.setOnEditCommit(e->{
            e.getTableView().getItems().get(e.getTablePosition().getRow()).setTotal(e.getNewValue());
            lblTotal.setText(Integer.toString(lignes.stream().mapToInt(LigneFacture::getTotal).sum()));
            colMontant.setCellValueFactory(new PropertyValueFactory<>("total"));
        });   
    }
    @FXML
    void eventClickEffacer(ActionEvent event) { //Effacer toutes les lignes de facture
        
    }
    @FXML
    void eventClickEnregistrerFermer(ActionEvent event) {
//          Stage popup = new Stage();
//        HBox root = new HBox();
//        root.setSpacing(20);
//        Scene scene = new Scene(root);
//        popup.setScene(scene);
//        popup.show();
    }
    @FXML
    void eventClickEnregistrerNouveau(ActionEvent event) {

    }    
    
}
