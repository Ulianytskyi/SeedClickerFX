package com.example.seedclickerfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Text _score;

    @FXML
    private Button btBuyNewRate;

    @FXML
    private Button btTake;

    @FXML
    private Text currRate;

    @FXML
    private Text hiScore;

    @FXML
    private Label labelHiScore;

    @FXML
    private Label labelPrice;

    @FXML
    private Label labelRate;

    @FXML
    private Label labelScore;

    @FXML
    private Text priceRate;

    private long numHiScore = 0;
    private long numScore = 0;
    private long numScoreIncrement = 1;
    private long numPrice = numScoreIncrement * 50;

    @FXML
    void btnTakeClicked(ActionEvent event) {
        numHiScore += numScoreIncrement;
        numScore += numScoreIncrement;
        hiScore.setText("" + numHiScore + "");
        _score.setText("" + numScore + "");
    }
    @FXML
    void btnBuyClicked(ActionEvent event) {
        if (numScore >= numPrice){
            numScore -= numPrice;
            numScoreIncrement *= 2;
            numPrice = numScoreIncrement * 50;
            currRate.setText("" + numScoreIncrement + "");
            priceRate.setText("" + numPrice + "");
            _score.setText("" + numScore + "");
        }
    }

}
