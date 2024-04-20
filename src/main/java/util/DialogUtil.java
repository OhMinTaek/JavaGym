package util;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;
import java.util.ResourceBundle;

import static thread.InactivityManager.registerDialog;
import static util.AnimationUtil.*;
import static util.PageUtil.*;

public class DialogUtil {

    private static final ResourceBundle errorMessage = ResourceBundle.getBundle("message.error");
    private static final ResourceBundle basicMessage = ResourceBundle.getBundle("message.basic");

    public static void showDialog(String message) {
        Dialog<String> dialog = new Dialog<>();
        registerDialog(dialog);
        dialog.setTitle(basicMessage.getString("alert"));

        Label label = new Label(message);
        label.getStyleClass().add("BasicLabel");

        VBox vbox = new VBox();
        vbox.getChildren().add(label);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);

        dialog.getDialogPane().setContent(vbox);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getStylesheets().add(DialogUtil.class.getResource("/css/DialogPopUp.css").toExternalForm());

        applyFadeInDialog(vbox);

        // 아이콘 적용
        Stage dialogStage = (Stage) dialog.getDialogPane().getScene().getWindow();
        Image icon = new Image(DialogUtil.class.getResourceAsStream("/image/JavaGym_Logo.jpeg"));
        dialogStage.getIcons().add(icon);

        dialog.showAndWait();
    }

    public static void showDialogErrorMessage(String messageCode) {
        Dialog<String> dialog = new Dialog<>();
        registerDialog(dialog);
        dialog.setTitle(basicMessage.getString("alert"));

        Label label = new Label(errorMessage.getString(messageCode));
        label.getStyleClass().add("BasicLabel");

        VBox vbox = new VBox();
        vbox.getChildren().add(label);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);

        dialog.getDialogPane().setContent(vbox);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getStylesheets().add(DialogUtil.class.getResource("/css/DialogPopUp.css").toExternalForm());

        applyFadeInDialog(vbox);

        Stage dialogStage = (Stage) dialog.getDialogPane().getScene().getWindow();
        dialogStage.getIcons().add(new Image(DialogUtil.class.getResourceAsStream("/image/JavaGym_Logo.jpeg")));

        dialog.showAndWait();
    }

    public static void showDialogBasicMessage(String messageCode) {
        Dialog<String> dialog = new Dialog<>();
        registerDialog(dialog);
        dialog.setTitle(basicMessage.getString("alert"));

        Label label = new Label(basicMessage.getString(messageCode));
        label.getStyleClass().add("BasicLabel");

        VBox vbox = new VBox();
        vbox.getChildren().add(label);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);

        dialog.getDialogPane().setContent(vbox);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getStylesheets().add(DialogUtil.class.getResource("/css/DialogPopUp.css").toExternalForm());

        applyFadeInDialog(vbox);

        Stage dialogStage = (Stage) dialog.getDialogPane().getScene().getWindow();
        dialogStage.getIcons().add(new Image(DialogUtil.class.getResourceAsStream("/image/JavaGym_Logo.jpeg")));

        dialog.showAndWait();
    }

    public static void showDialogAndMovePage(String message, String viewPath, ActionEvent event) throws IOException {
        Dialog<ButtonType> dialog = new Dialog<>();
        registerDialog(dialog);
        dialog.setTitle(basicMessage.getString("alert"));

        Label label = new Label(message);
        label.getStyleClass().add("BasicLabel");

        VBox vbox = new VBox();
        vbox.getChildren().add(label);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);

        dialog.getDialogPane().setContent(vbox);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getStylesheets().add(DialogUtil.class.getResource("/css/DialogPopUp.css").toExternalForm());

        applyFadeInDialog(vbox);

        Stage dialogStage = (Stage) dialog.getDialogPane().getScene().getWindow();
        dialogStage.getIcons().add(new Image(DialogUtil.class.getResourceAsStream("/image/JavaGym_Logo.jpeg")));

        dialog.showAndWait();
        movePage(event, viewPath);
    }

    public static void showDialogAndMovePageMessage(String messageCode, String viewPath, ActionEvent event) throws IOException {
        Dialog<ButtonType> dialog = new Dialog<>();
        registerDialog(dialog);
        dialog.setTitle(basicMessage.getString("alert"));

        Label label = new Label(basicMessage.getString(messageCode));
        label.getStyleClass().add("BasicLabel");

        VBox vbox = new VBox();
        vbox.getChildren().add(label);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);

        dialog.getDialogPane().setContent(vbox);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getStylesheets().add(DialogUtil.class.getResource("/css/DialogPopUp.css").toExternalForm());

        applyFadeInDialog(vbox);

        Stage dialogStage = (Stage) dialog.getDialogPane().getScene().getWindow();
        dialogStage.getIcons().add(new Image(DialogUtil.class.getResourceAsStream("/image/JavaGym_Logo.jpeg")));

        dialog.showAndWait();
        movePage(event, viewPath);
    }

    public static void showDialogAndMovePageTimerOff(String message, String viewPath, ActionEvent event) throws IOException {
        Dialog<ButtonType> dialog = new Dialog<>();
        registerDialog(dialog);
        dialog.setTitle(basicMessage.getString("alert"));

        Label label = new Label(message);
        label.getStyleClass().add("BasicLabel");

        VBox vbox = new VBox();
        vbox.getChildren().add(label);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);

        dialog.getDialogPane().setContent(vbox);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getStylesheets().add(DialogUtil.class.getResource("/css/DialogPopUp.css").toExternalForm());

        applyFadeInDialog(vbox);

        Stage dialogStage = (Stage) dialog.getDialogPane().getScene().getWindow();
        dialogStage.getIcons().add(new Image(DialogUtil.class.getResourceAsStream("/image/JavaGym_Logo.jpeg")));

        dialog.showAndWait();
        movePageTimerOff(event, viewPath);
    }

    public static void showDialogAndMovePageTimerOffMessage(String messageCode, String viewPath, ActionEvent event) throws IOException {
        Dialog<ButtonType> dialog = new Dialog<>();
        registerDialog(dialog);
        dialog.setTitle(basicMessage.getString("alert"));

        Label label = new Label(basicMessage.getString(messageCode));
        label.getStyleClass().add("BasicLabel");

        VBox vbox = new VBox();
        vbox.getChildren().add(label);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);

        dialog.getDialogPane().setContent(vbox);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getStylesheets().add(DialogUtil.class.getResource("/css/DialogPopUp.css").toExternalForm());

        applyFadeInDialog(vbox);

        Stage dialogStage = (Stage) dialog.getDialogPane().getScene().getWindow();
        dialogStage.getIcons().add(new Image(DialogUtil.class.getResourceAsStream("/image/JavaGym_Logo.jpeg")));

        dialog.showAndWait();
        movePageTimerOff(event, viewPath);
    }

    public static void showDialogAndMoveMainPage(String message, ActionEvent event) throws IOException {

        Dialog<ButtonType> dialog = new Dialog<>();
        registerDialog(dialog);
        dialog.setTitle(basicMessage.getString("alert"));

        Label label = new Label(message);
        label.getStyleClass().add("BasicLabel");

        VBox vbox = new VBox();
        vbox.getChildren().add(label);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);

        dialog.getDialogPane().setContent(vbox);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getStylesheets().add(DialogUtil.class.getResource("/css/DialogPopUp.css").toExternalForm());

        applyFadeInDialog(vbox);

        Stage dialogStage = (Stage) dialog.getDialogPane().getScene().getWindow();
        dialogStage.getIcons().add(new Image(DialogUtil.class.getResourceAsStream("/image/JavaGym_Logo.jpeg")));

        dialog.showAndWait();
        moveToMainPage(event);
    }

    public static void showDialogAndMoveMainPageMessage(String messageCode, ActionEvent event) throws IOException {

        Dialog<ButtonType> dialog = new Dialog<>();
        registerDialog(dialog);
        dialog.setTitle(basicMessage.getString("alert"));

        Label label = new Label(basicMessage.getString(messageCode));
        label.getStyleClass().add("BasicLabel");

        VBox vbox = new VBox();
        vbox.getChildren().add(label);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);

        dialog.getDialogPane().setContent(vbox);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getStylesheets().add(DialogUtil.class.getResource("/css/DialogPopUp.css").toExternalForm());

        applyFadeInDialog(vbox);

        Stage dialogStage = (Stage) dialog.getDialogPane().getScene().getWindow();
        dialogStage.getIcons().add(new Image(DialogUtil.class.getResourceAsStream("/image/JavaGym_Logo.jpeg")));

        dialog.showAndWait();
        moveToMainPage(event);
    }

    public static Optional<ButtonType> showDialogChoose(String message) {
        Dialog<ButtonType> dialog = new Dialog<>();
        registerDialog(dialog);
        dialog.setTitle(basicMessage.getString("alert"));

        dialog.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);

        DialogPane dialogPane = dialog.getDialogPane();
        dialogPane.setContent(new Label(message));


        dialogPane.getButtonTypes().clear();
        Button yesButton = (Button) dialogPane.lookupButton(ButtonType.YES);
        Button noButton = (Button) dialogPane.lookupButton(ButtonType.NO);
        dialogPane.getButtonTypes().addAll(ButtonType.YES, ButtonType.NO);
        dialog.getDialogPane().getStylesheets().add(DialogUtil.class.getResource("/css/DialogPopUp_2Btn.css").toExternalForm());

        applyFadeInDialog(dialogPane);

        Stage dialogStage = (Stage) dialog.getDialogPane().getScene().getWindow();
        Image icon = new Image(DialogUtil.class.getResourceAsStream("/image/JavaGym_Logo.jpeg"));
        dialogStage.getIcons().add(icon);

        return dialog.showAndWait();
    }

    public static Optional<ButtonType> showDialogChooseMessage(String messageCode) {
        Dialog<ButtonType> dialog = new Dialog<>();
        registerDialog(dialog);
        dialog.setTitle(basicMessage.getString("alert"));

        dialog.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);

        DialogPane dialogPane = dialog.getDialogPane();
        dialogPane.setContent(new Label(basicMessage.getString(messageCode)));

        dialogPane.getButtonTypes().clear();
        Button yesButton = (Button) dialogPane.lookupButton(ButtonType.YES);
        Button noButton = (Button) dialogPane.lookupButton(ButtonType.NO);
        dialogPane.getButtonTypes().addAll(ButtonType.YES, ButtonType.NO);
        dialog.getDialogPane().getStylesheets().add(DialogUtil.class.getResource("/css/DialogPopUp_2Btn.css").toExternalForm());

        applyFadeInDialog(dialogPane);

        Stage dialogStage = (Stage) dialog.getDialogPane().getScene().getWindow();
        dialogStage.getIcons().add(new Image(DialogUtil.class.getResourceAsStream("/image/JavaGym_Logo.jpeg")));

        return dialog.showAndWait();
    }
}