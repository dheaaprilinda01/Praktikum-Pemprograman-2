package com.example.praktikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    public class Mahasiswa {

        private String NIM = null;
        private String Nama = null;
        private Integer id = null;

        public Mahasiswa() {
        }

        public Mahasiswa(Integer ID,String nim, String nama) {
            this.id = ID;
            this.NIM = nim;
            this.Nama = nama;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNIM() {
            return NIM;
        }

        public void setNIM(String NIM) {
            this.NIM = NIM;
        }

        public String getNama() {
            return Nama;
        }

        public void setNama(String nama) {
            Nama = nama;
        }
    }

    @Override
    public void start(Stage primaryStage) {

        TableView tableView = new TableView();

        TableColumn<Mahasiswa, String> column1 =
                new TableColumn<>("NIM");

        column1.setCellValueFactory(
                new PropertyValueFactory<>("NIM"));


        TableColumn<Mahasiswa, String> column2 =
                new TableColumn<>("NAMA");

        column2.setCellValueFactory(
                new PropertyValueFactory<>("nama"));


        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);

        tableView.getItems().add(
                new Mahasiswa(1, "123", "Doe"));
        tableView.getItems().add(
                new Mahasiswa(2, "134", "Deer"));
        tableView.getItems().add(
                new Mahasiswa(3, "164", "Door"));
        tableView.getItems().add(
                new Mahasiswa(4, "164", "Door"));
        tableView.getItems().add(
                new Mahasiswa(5, "164", "Door"));
        tableView.getItems().add(
                new Mahasiswa(6, "164", "Door"));
        tableView.getItems().add(
                new Mahasiswa(7, "164", "Door"));
        tableView.getItems().add(
                new Mahasiswa(8, "164", "Door"));
        tableView.getItems().add(
                new Mahasiswa(9, "164", "Door"));
        tableView.getItems().add(
                new Mahasiswa(10, "164", "Door"));

        VBox vbox = new VBox(tableView);

        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}