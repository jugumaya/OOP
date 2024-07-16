package com.cse.midmoc;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class MidmocController
{
    @javafx.fxml.FXML
    private TableColumn<Complex,Integer> realnoTextField;
    @javafx.fxml.FXML
    private TextField imgTextField;
    @javafx.fxml.FXML
    private TableColumn<Complex,Integer> imgnoTextField;
    @javafx.fxml.FXML
    private TextField realTextField;
    @javafx.fxml.FXML
    private TableView<Complex> tableviewTextField;
    ArrayList<Complex> cnList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        realnoTextField.setCellValueFactory(new PropertyValueFactory<Complex,Integer>("real"));
        imgnoTextField.setCellValueFactory(new PropertyValueFactory<Complex, Integer>("img"));
    }

    @javafx.fxml.FXML
    public void addOnAction(ActionEvent actionEvent) {
        cnList.add(new Complex(Integer.parseInt(realTextField.getText()),Integer.parseInt(imgTextField.getText())));
        realTextField.clear();
        imgTextField.clear();
    }

    @javafx.fxml.FXML
    public void showOnAction(ActionEvent actionEvent) {
        tableviewTextField.getItems().clear();
        for(Complex c: cnList){
            tableviewTextField.getItems().add(c);
        }

    }
}