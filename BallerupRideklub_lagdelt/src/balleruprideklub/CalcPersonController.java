/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balleruprideklub;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author CasaRol
 */
public class CalcPersonController implements Initializable {
    
    private Person person = new Person();
    private Horse horse = new Horse();

    @FXML
    private RadioButton rbtn_balanceYes;
    @FXML
    private ToggleGroup balance;
    @FXML
    private RadioButton rbtn_balanceNo;
    @FXML
    private Button btn_calculate;
    @FXML
    private Button btn_cancel;
    @FXML
    private ComboBox<?> comb_weight;
    @FXML
    private ComboBox<?> comb_height;
    @FXML
    private ComboBox<?> comb_level;
    @FXML
    private Label label_warning;
    @FXML
    private Label label_gradeInfo;
    @FXML
    private Label label_grade;
    @FXML
    private AnchorPane anchor;
    @FXML
    private Label label_title;
    @FXML
    private ListView<Horse> listView_horseList;
    
    private ObservableList<Horse> horseList;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        this.horseList = FXCollections.observableArrayList();
        listView_horseList.setItems(horseList);
        
        horse.fillArray();
        
        //Fill weightBox and set visible limit
        comb_weight.getItems().addAll(fillWeightBox());
        comb_weight.setVisibleRowCount(10);
        comb_weight.getSelectionModel().selectFirst();

        //Fill heightBox and set visible limit
        comb_height.getItems().addAll(fillHeightBox());
        comb_height.setVisibleRowCount(10);
        comb_height.getSelectionModel().selectFirst();

        //Fill levelBox
        comb_level.getItems().addAll(fillLevelBox());
        comb_level.getSelectionModel().selectFirst();
        
        label_gradeInfo.setVisible(false);
        label_grade.setVisible(false);
    }

    private List fillWeightBox() {
        ArrayList weightList = new ArrayList();
        weightList.add("Vælg kg");
        for (int i = 40; i <= 130; i++) {
            weightList.add(i);
        }

        return weightList;
    }

    private List fillHeightBox() {
        ArrayList heightList = new ArrayList();
        heightList.add("Vælg cm");
        for (int i = 50; i <= 230; i++) {
            heightList.add(i);
        }

        return heightList;
    }

    private List fillLevelBox() {
        ArrayList levelList = new ArrayList();
        levelList.add("Vælg niveau");
        levelList.add("Begynder");
        levelList.add("Let øvet");
        levelList.add("Øvet");

        return levelList;
    }
    
    private boolean balance() {
        boolean selection = false;
        if(rbtn_balanceYes.isSelected()){
            selection = true;
        } else if(rbtn_balanceNo.isSelected()) {
            selection = false;
        }
        
        return selection;
    }

    @FXML
    private void calcScore(ActionEvent event) {
        if (!(comb_weight.getSelectionModel().getSelectedItem().toString().equals("Vælg kg")) && !(comb_height.getSelectionModel().getSelectedItem().toString().equals("Vælg cm")) && !(comb_level.getSelectionModel().getSelectedItem().toString().equals("Vælg niveau"))) {
            label_warning.setText("");
            label_gradeInfo.setVisible(true);
            label_grade.setVisible(true);
            int score = person.calcScore((Integer.parseInt(comb_weight.getSelectionModel().getSelectedItem().toString())), (Integer.parseInt(comb_height.getSelectionModel().getSelectedItem().toString())), (comb_level.getSelectionModel().getSelectedItem().toString()), balance());
            label_grade.setText(score + "");
            fillListView(score);
        } else {
            label_warning.setText("Udfyld venligst alle informationerne");
        }
    }

    @FXML
    private void clearInfo(ActionEvent event) {
        rbtn_balanceYes.setSelected(false);
        rbtn_balanceNo.setSelected(false);
        comb_weight.getSelectionModel().selectFirst();
        comb_height.getSelectionModel().selectFirst();
        comb_level.getSelectionModel().selectFirst();
        label_grade.setText("");
        label_grade.setVisible(false);
        label_gradeInfo.setVisible(false);
        label_warning.setText("");
        listView_horseList.getItems().clear();
    }
    
    private void fillListView(int score) {
        for(int i = 0; i<horse.horses.size(); i++) {
            if(horse.horses.get(i).getNiveau() >= score) {
                horseList.add(new Horse(horse.horses.get(i).getName(), horse.horses.get(i).getNiveau()));
            }
        }
    }

}
