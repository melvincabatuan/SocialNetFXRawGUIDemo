# SocialNetFXRawGUIDemo

Raw GUI Demo with SceneBuilder

![](https://github.com/melvincabatuan/SocialNetFXRawGUIDemo/blob/master/scenebuilder.JPG)

![](https://github.com/melvincabatuan/SocialNetFXRawGUIDemo/blob/master/RawGUI.JPG)

## Adding style with CSS

- Modify Main.java

```
scene.getStylesheets().add(getClass().getResource("mystyle.css").toExternalForm()); 
```

sample context:

```
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        Scene scene = new Scene(root, 980, 800);
        scene.getStylesheets().add(getClass().getResource("mystyle.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
```

- Sample CSS file

```
.root{
    -fx-font-size: 12pt;
    -fx-font-family: "Palatino Linotype";
    -fx-base: rgb(132, 145, 47);
    -fx-background: rgb(225, 228, 203);
    -fx-background-image: url("witcher.jpg");
    -fx-background-repeat: stretch;
    -fx-background-position: top left;
    -fx-background-size: cover, auto;
}

.button {
  -fx-pref-width: 150px;
  -fx-background-color: #4CAF50; /* Green */
  -fx-border: none;
  -fx-color: white;
  -fx-padding: 15px 32px;
  -fx-text-fill: #ffffff;
  -fx-text-align: center;
  -fx-text-decoration: none;
  -fx-display: inline-block;
  -fx-font-size: 12pt;
  -fx-font-weight: bold;
}


.label {
  -fx-text-fill: #ffffff;
  -fx-effect: dropshadow(three-pass-box, white, 20, 0, 0, 0);
}
```

- Sample Output

![](https://github.com/melvincabatuan/SocialNetFXRawGUIDemo/blob/master/StyleWithCss.png)
