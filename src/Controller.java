import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    public TextField nameField;
    public Label statusLabel;
    public TextField statusChangeLabel;
    public TextField pictureLabel;
    public TextField friendLabel;
    public TextField unfriendLabel;
    public TextField quoteLabel;
    public ImageView pictureView;
    public ListView listView;

    ObservableList<String> friendList;

    @FXML
    private  void initialize(){
        friendList = FXCollections.observableArrayList();
        listView.setItems(friendList);
    }

    public void handleAdd(ActionEvent actionEvent) {
        if (!nameField.getText().trim().isEmpty()) {
            statusLabel.setText(nameField.getText() + " added");
        }
    }

    public void handleDelete(ActionEvent actionEvent) {
        if (!nameField.getText().trim().isEmpty()) {
            statusLabel.setText(nameField.getText() + " deleted");
        }
    }

    public void handleLookup(ActionEvent actionEvent) {
        if (!nameField.getText().trim().isEmpty()) {
            statusLabel.setText(nameField.getText() + " lookup");
        }
    }

    public void handleStatus(ActionEvent actionEvent) {
        if (!statusChangeLabel.getText().trim().isEmpty()) {
            statusLabel.setText("status changed to " + statusChangeLabel.getText());
        }
    }

    public void handlePicture(ActionEvent actionEvent) {
        if (!pictureLabel.getText().trim().isEmpty()) {
            pictureView.setImage(new Image(pictureLabel.getText()));
            statusLabel.setText("picture changed to " + pictureLabel.getText());
        }
    }

    public void handleAddFriend(ActionEvent actionEvent) {
        if (!friendLabel.getText().trim().isEmpty()) {
            friendList.add(friendLabel.getText());
            statusLabel.setText(friendLabel.getText() + " added as friend");
        }
    }

    public void handleUnfriend(ActionEvent actionEvent) {
        if (!unfriendLabel.getText().trim().isEmpty()) {
            friendList.remove(unfriendLabel.getText());
            statusLabel.setText(unfriendLabel.getText() + " removed as friend");
        }
    }

    public void handleQuote(ActionEvent actionEvent) {
        if (!quoteLabel.getText().trim().isEmpty()) {
            statusLabel.setText("Quote changed to " + quoteLabel.getText());
        }
    }
}
