package com.example.hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.SVGPath;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class AntEatersController implements Initializable {
    @FXML
    private Text startText;
    @FXML
    private Polygon startButton = new Polygon();
    @FXML
    private Button randomHat, anteaterButton, randomizeAll;
    @FXML
    private Accordion closet = new Accordion();

    // CLOTHING VARIABLE DELCARATIONS __________________________________________________________________________________

    @FXML
    private Pane epicRotationPane;
    private ArrayList<Pane> plungerShoesRotationPane;
    @FXML
    private ColorPicker shirtColors, pantsColors, shoesColors, hatsColors, extrasColors;
    private SVGPath currentClothing, currentClothing2;

    @FXML
    private SVGPath plainShirtSVG, PEShirt1, noHandsAstronautSus, jeanShirt;
    private ArrayList<SVGPath> shirtSVGS = new ArrayList<SVGPath>();
    private ArrayList<Pane> shirtPanes = new ArrayList<Pane>();
    @FXML
    private Pane shirtPaneOne, shirtPaneTwo, shirtPaneThree, shirtPaneFour;

    @FXML
    private SVGPath pantsJeans, shortsSVG;
    private ArrayList<SVGPath> pantsSVGS = new ArrayList<SVGPath>();
    private ArrayList<Pane> pantsPanes = new ArrayList<Pane>();
    @FXML
    private Pane pantsPaneOne, pantsPaneTwo;

    @FXML
    private SVGPath plungerShoesSVG, leftSnowshoeSVG, rightSnowshoeSVG, leftSneakerSVG, rightSneakerSVG, leftBootSVG, rightBootSVG;
    private ArrayList<SVGPath> shoesSVGS = new ArrayList<SVGPath>();
    private ArrayList<Pane> shoesPanes = new ArrayList<Pane>();
    @FXML
    private Pane shoesPaneOne, shoesPaneTwo, shoesPaneThree, plungerShoesFakePane;

    @FXML
    private ImageView topHatImage, propellerHatImage, tinfoilHatImage;
    private ArrayList<ImageView> hatsImages = new ArrayList<ImageView>();
    private ArrayList<Pane> hatsPanes = new ArrayList<Pane>();
    @FXML
    private Pane hatsPaneOne, hatsPaneTwo, hatsPaneThree;

    @FXML
    private ImageView extraTermiteMoundImage, extraGlassesImage, extraSmallAnteaterImage;
    private ArrayList<ImageView> extrasImages = new ArrayList<ImageView>();
    private ArrayList<Pane> extrasPanes = new ArrayList<Pane>();
    @FXML
    private Pane extraTermiteMoundPane, extraGlassesPane, extraSmallAnteaterPane;
    // CLOTHING VARIABLE DELCARATIONS __________________________________________________________________________________

    // EVERY SINGLE IMAGE PATH _________________________________________________________________________________________

    private Image houseImage = new Image("C:\\Users\\chris\\IdeaProjects\\demo\\HelloFX\\src\\main\\java\\com\\example\\hellofx\\images\\bg1.png");
    private Image anteaterJacked = new Image("C:\\Users\\chris\\IdeaProjects\\demo\\HelloFX\\src\\main\\java\\com\\example\\hellofx\\images\\anteaterJacked.png");
    private String extraAnteater = new String("C:\\Users\\chris\\IdeaProjects\\demo\\HelloFX\\src\\main\\java\\com\\example\\hellofx\\images\\anteaterJacked.png");
    private String plainShirt = new String("C:\\Users\\chris\\IdeaProjects\\demo\\HelloFX\\src\\main\\java\\com\\example\\hellofx\\images\\shirtIcon.png");
    private String bipedAstronaut = new String("C:\\Users\\chris\\IdeaProjects\\demo\\HelloFX\\src\\main\\java\\com\\example\\hellofx\\images\\bipedAstronaut.png");
    private String placeholderOne = new String("C:\\Users\\chris\\IdeaProjects\\demo\\HelloFX\\src\\main\\java\\com\\example\\hellofx\\images\\tester.png");
    private String placeholderTwo = new String("C:\\Users\\chris\\IdeaProjects\\demo\\HelloFX\\src\\main\\java\\com\\example\\hellofx\\images\\tester.png");
    private String PEShirt = new String("C:\\Users\\chris\\IdeaProjects\\demo\\HelloFX\\src\\main\\java\\com\\example\\hellofx\\images\\PEShirt.png");
    private String jeanShirtIMG = new String("C:\\Users\\chris\\IdeaProjects\\demo\\HelloFX\\src\\main\\java\\com\\example\\hellofx\\images\\jeanShirt.png");
    private String plungerShoes = new String("C:\\Users\\chris\\IdeaProjects\\demo\\HelloFX\\src\\main\\java\\com\\example\\hellofx\\images\\plungerShoes.png");
    private String snowShoes = new String("C:\\Users\\chris\\IdeaProjects\\demo\\HelloFX\\src\\main\\java\\com\\example\\hellofx\\images\\snowShoes.png");
    private String sneakers = new String("C:\\Users\\chris\\IdeaProjects\\demo\\HelloFX\\src\\main\\java\\com\\example\\hellofx\\images\\sneakers.png");
    private String enormousBoots = new String("C:\\Users\\chris\\IdeaProjects\\demo\\HelloFX\\src\\main\\java\\com\\example\\hellofx\\images\\enormousBoots.png");
    private String topHat = new String("C:\\Users\\chris\\IdeaProjects\\demo\\HelloFX\\src\\main\\java\\com\\example\\hellofx\\images\\tophat.png");
    private String tinfoilHat = new String("C:\\Users\\chris\\IdeaProjects\\demo\\HelloFX\\src\\main\\java\\com\\example\\hellofx\\images\\tinfoilHat.png");
    private String tinfoilHatSprite = new String("C:\\Users\\chris\\IdeaProjects\\demo\\HelloFX\\src\\main\\java\\com\\example\\hellofx\\images\\tinfoilHatSprite.png");
    private String topHatSprite = new String("C:\\Users\\chris\\IdeaProjects\\demo\\HelloFX\\src\\main\\java\\com\\example\\hellofx\\images\\topHatSprite.png");
    private String propellerHat = new String("C:\\Users\\chris\\IdeaProjects\\demo\\HelloFX\\src\\main\\java\\com\\example\\hellofx\\images\\propellerHat.png");
    private String extraTermiteMound = new String("C:\\Users\\chris\\IdeaProjects\\demo\\HelloFX\\src\\main\\java\\com\\example\\hellofx\\images\\extraTermiteMound.png");
    private String extraGlasses = new String("C:\\Users\\chris\\IdeaProjects\\demo\\HelloFX\\src\\main\\java\\com\\example\\hellofx\\images\\extraGlasses.png");
    private String extraGlassesSprite = new String("C:\\Users\\chris\\IdeaProjects\\demo\\HelloFX\\src\\main\\java\\com\\example\\hellofx\\images\\extraGlassesSprite.png");
    private String shorts = new String("C:\\Users\\chris\\IdeaProjects\\demo\\HelloFX\\src\\main\\java\\com\\example\\hellofx\\images\\shorts.png");
    // EVERY SINGLE IMAGE PATH _________________________________________________________________________________________

    private String[] shirtIcons = new String[]{plainShirt, bipedAstronaut, PEShirt, jeanShirtIMG};
    private String[] pantsIcons = new String[]{jeanShirtIMG, shorts};
    private String[] hatsIcons = new String[]{topHat, propellerHat, tinfoilHat};
    private String[] shoesIcons = new String[]{snowShoes, sneakers, enormousBoots};
    private String[] extrasIcons = new String[]{extraTermiteMound, extraGlasses, extraAnteater};
    private String[] extrasSprites = new String[]{extraTermiteMound, extraGlassesSprite, extraAnteater};
    private String[] hatsSprites = new String[]{topHatSprite, propellerHat, tinfoilHatSprite};
    private Image plungerShoesImage = new Image(plungerShoes);

    @FXML
    private ImageView plungerShoesOne, shoesOne, shoesTwo, shoesThree;
    private ArrayList<ImageView> shoesFrames = new ArrayList<ImageView>();
    @FXML
    private ImageView hatOne, hatTwo, hatThree;
    private ArrayList<ImageView> hatsFrames = new ArrayList<ImageView>();
    @FXML
    private ImageView shirtOne = new ImageView(), shirtTwo = new ImageView(), shirtThree = new ImageView(), shirtFour = new ImageView();
    private ArrayList<ImageView> shirtFrames = new ArrayList<ImageView>();
    @FXML
    private ImageView pantsOne, pantsTwo;
    private ArrayList<ImageView> pantsFrames = new ArrayList<ImageView>();
    @FXML
    private ImageView extraOne, extraTwo, extraThree;
    private ArrayList<ImageView> extrasFrames = new ArrayList<ImageView>();

    private ArrayList<ArrayList<Pane>> allClothing = new ArrayList<ArrayList<Pane>>();
    private int outfitSlot = 0;
    private ArrayList<ArrayList<Pane>> listOfOutfits = new ArrayList<ArrayList<Pane>>();

    // _________________________________________________________________________________________________________________

    @FXML
    private ImageView jackedAnteaterFrame = new ImageView();
    @FXML
    private AnchorPane housePane = new AnchorPane();
    private BackgroundImage houseBGImage = new BackgroundImage(houseImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
    private Background house = new Background(houseBGImage);
    @FXML
    private Button userInputLog = new Button();

    // SET UP THE SCENE ________________________________________________________________________________________________

    public void initiateAnteater(){
        addStuffToArrayLists();
        housePane.setBackground(house);
        closet.setVisible(true);
        randomizeAll.setVisible(true);
        // assign images to imageviews
        for (int i = 0; i < shirtFrames.size(); i++){
            Image tempImage = new Image(shirtIcons[i]);
            shirtFrames.get(i).setImage(tempImage);
        }
        // assign images to imageviews
        for (int i = 0; i < pantsFrames.size(); i++) {
            Image tempImage = new Image(pantsIcons[i]);
            pantsFrames.get(i).setImage(tempImage);
        }

        for (int i = 0; i < shoesFrames.size(); i++){
            Image tempImage = new Image(shoesIcons[i]);
            shoesFrames.get(i).setImage(tempImage);
        }
        for (int i = 0; i < hatsFrames.size(); i++){
            Image tempImage = new Image(hatsIcons[i]);
            hatsFrames.get(i).setImage(tempImage);
        }
        for (int i = 0; i < hatsImages.size(); i++){
            Image tempImage = new Image(hatsSprites[i]);
            hatsImages.get(i).setImage(tempImage);
        }

        for (int i = 0; i < extrasFrames.size(); i++){
            Image tempImage = new Image(extrasIcons[i]);
            extrasFrames.get(i).setImage(tempImage);
        }
        for (int i = 0; i < extrasImages.size(); i++){
            Image tempImage = new Image(extrasSprites[i]);
            extrasImages.get(i).setImage(tempImage);
        }
        plungerShoesOne.setImage(plungerShoesImage);
        startButton.setVisible(false);
        startText.setVisible(false);
        userInputLog.setMinWidth(Region.USE_PREF_SIZE);
        userInputLog.setMinHeight(Region.USE_PREF_SIZE);
        userInputLog.setVisible(true);
        anteaterButton.setVisible(true);
    }
    // SET UP THE SCENE ________________________________________________________________________________________________


    // ADD CLOTHING RELATED FX NODES INTO ARRAYLISTS ___________________________________________________________________

    public void addStuffToArrayLists(){
        jackedAnteaterFrame.setImage(anteaterJacked);

        shirtFrames.add(shirtOne);
        shirtFrames.add(shirtTwo);
        shirtFrames.add(shirtThree);
        shirtFrames.add(shirtFour);
        shirtSVGS.add(plainShirtSVG);
        shirtSVGS.add(noHandsAstronautSus);
        shirtSVGS.add(PEShirt1);
        shirtSVGS.add(jeanShirt);
        shirtPanes.add(shirtPaneOne);
        shirtPanes.add(shirtPaneTwo);
        shirtPanes.add(shirtPaneThree);
        shirtPanes.add(shirtPaneFour);

        pantsFrames.add(pantsOne);
        pantsFrames.add(pantsTwo);
        pantsSVGS.add(pantsJeans);
        pantsSVGS.add(shortsSVG);
        pantsPanes.add(pantsPaneOne);
        pantsPanes.add(pantsPaneTwo);

        shoesFrames.add(shoesOne);
        shoesFrames.add(shoesTwo);
        shoesFrames.add(shoesThree);
        shoesSVGS.add(leftSnowshoeSVG);
        shoesSVGS.add(rightSnowshoeSVG);
        shoesSVGS.add(leftSneakerSVG);
        shoesSVGS.add(rightSneakerSVG);
        shoesSVGS.add(leftBootSVG);
        shoesSVGS.add(rightBootSVG);
        shoesPanes.add(shoesPaneOne);
        shoesPanes.add(shoesPaneTwo);
        shoesPanes.add(shoesPaneThree);

        hatsFrames.add(hatOne);
        hatsFrames.add(hatTwo);
        hatsFrames.add(hatThree);
        hatsImages.add(topHatImage);
        hatsImages.add(propellerHatImage);
        hatsImages.add(tinfoilHatImage);
        hatsPanes.add(hatsPaneOne);
        hatsPanes.add(hatsPaneTwo);
        hatsPanes.add(hatsPaneThree);

        extrasFrames.add(extraOne);
        extrasFrames.add(extraTwo);
        extrasFrames.add(extraThree);
        extrasImages.add(extraTermiteMoundImage);
        extrasImages.add(extraGlassesImage);
        extrasImages.add(extraSmallAnteaterImage);
        extrasPanes.add(extraTermiteMoundPane);
        extrasPanes.add(extraGlassesPane);
        extrasPanes.add(extraSmallAnteaterPane);

        allClothing.add(shirtPanes);
        allClothing.add(pantsPanes);
        allClothing.add(shoesPanes);
        allClothing.add(hatsPanes);
        allClothing.add(extrasPanes);
    }
    // ADD CLOTHING RELATED FX NODES INTO ARRAYLISTS ___________________________________________________________________


    // CHECK FOR / REMOVE CURRENTLY ACTIVE CLOTHING ITEMS ______________________________________________________________

    private Rotate plunger180 = new Rotate(180, 150, 0);
    private Rotate resetAngle = new Rotate(-180, 150,0);
    private boolean isWearingPlungers;

    public void checkIfWearing(ArrayList<Pane> pane){
        if (pane == plungerShoesRotationPane){
            if (isWearingPlungers){
                epicRotationPane.getTransforms().add(resetAngle);
                isWearingPlungers = false;
                plungerShoesFakePane.setVisible(false);
            }
            else if (!isWearingPlungers) {
                epicRotationPane.getTransforms().add(plunger180);
                isWearingPlungers = true;
                plungerShoesFakePane.setVisible(true);
            }
        }
        else {
            for (int i = 0; i < pane.size(); i++) {
                if (pane.get(i).isVisible())
                    pane.get(i).setVisible(false);
            }
        }
    }
    // CHECK FOR / REMOVE CURRENTLY ACTIVE CLOTHING ITEMS ______________________________________________________________



    // COLOR SELECTION _________________________________________________________________________________________________

    public void modifyCurrentClothing(ArrayList<Pane> clothingPane, ArrayList<SVGPath> clothingSVG){
        for (int i = 0; i < clothingPane.size(); i++){
            if (clothingPane.get(i).isVisible()){
                if (clothingSVG == shoesSVGS){
                    currentClothing = clothingSVG.get(2 * i);
                    currentClothing2 = clothingSVG.get(2 * i + 1);
                }
                else {currentClothing = clothingSVG.get(i);}

                break;
            }
        }
    }

    public void changeTopColor(){
        Color colorShirt = shirtColors.getValue();
        modifyCurrentClothing(shirtPanes, shirtSVGS);

        currentClothing.setFill(colorShirt);
    }
    public void changePantsColor(){
        Color colorPant = pantsColors.getValue();
        modifyCurrentClothing(pantsPanes, pantsSVGS);
        currentClothing.setFill(colorPant);
    }
    public void changeShoesColor(){
        Color colorShoe = shoesColors.getValue();
        modifyCurrentClothing(shoesPanes, shoesSVGS);
        if (shoesPaneOne.isVisible()) {
            currentClothing.setStroke(colorShoe);
            currentClothing2.setStroke(colorShoe);
        }
        else {
            currentClothing.setFill(colorShoe);
            currentClothing2.setFill(colorShoe);
        }
    }
    // COLOR SELECTION _________________________________________________________________________________________________

    // ALL RANDOMIZATION _______________________________________________________________________________________________

    private Integer randR, randG, randB;

    public Color randomRGB(){
        randR = (int) (Math.random() * 256);
        randG = (int) (Math.random() * 256);
        randB = (int) (Math.random() * 256);
        String randomRGBString = new String("rgb(" + randR.toString() + "," + randG.toString() + "," + randB.toString() + ")");
        Color randomRGB = Color.web(randomRGBString);
        return randomRGB;
    }


    // CLOTHING RANDOMIZER ________________________________________________________
    public void randomClothingSVG(int eger, boolean doPreserveColor, int clothingType){
        if (clothingType == 0) {
            checkIfWearing(shirtPanes);
            shirtPanes.get(eger).setVisible(true);
            if (!doPreserveColor) {
                shirtSVGS.get(eger).setFill(randomRGB());
            }
        }
        else if (clothingType == 1){
            checkIfWearing(pantsPanes);
            pantsPanes.get(eger).setVisible(true);
            if (!doPreserveColor){
                pantsSVGS.get(eger).setFill(randomRGB());

            }
        }
        else if (clothingType == 2) {
            checkIfWearing(shoesPanes);
            shoesPanes.get(eger).setVisible(true);
            if (!doPreserveColor) {
                Color unitedShoeColors = randomRGB();
                if (shoesPaneOne.isVisible()) {
                    shoesSVGS.get(eger * 2).setStroke(unitedShoeColors);
                    shoesSVGS.get(eger * 2 + 1).setStroke(unitedShoeColors);
                }
                else {
                    shoesSVGS.get(eger * 2).setFill(unitedShoeColors);
                    shoesSVGS.get(eger * 2 + 1).setFill(unitedShoeColors);
                }
            }
        }
        else if (clothingType == 3) {
            checkIfWearing(hatsPanes);
            hatsPanes.get(eger).setVisible(true);
        }
        else if (clothingType == 4){
            checkIfWearing(extrasPanes);
            extrasPanes.get(eger).setVisible(true);
        }

    }

    @FXML
    private ChoiceBox<String> randomTopSelector, randomPantsSelector, randomShoesSelector, outfitSelector;
    private String[] topSelectorOptions = {"Randomize, Random Colors","Randomize, Keep Colors"};
    private String[] pantsSelectorOptions = {"Randomize, Random Colors","Randomize, Keep Colors"};
    private String[] shoesSelectorOptions = {"Randomize, Random Colors","Randomize, Keep Colors"};
    private String[] outfitSelectorOptions = {"Outfit 1","Outfit 2","Outfit 3","Outfit 4","Outfit 5"};

    public void setRandomClothingPreserveColor(String[] icons, int clothingType) {
        int randClothingIndex = (int)(Math.random() * (icons.length));
        randomClothingSVG(randClothingIndex, true, clothingType);
    }
    public void setRandomClothingNewColor(String[] icons, int clothingType){
        int randClothingIndex = (int)(Math.random() * (icons.length));
        randomClothingSVG(randClothingIndex, false, clothingType);

    }
    // EVERYTHING RANDOMIZER ___________________________________________________
    public void buttonRandomizerAll(){
        setRandomClothingNewColor(shirtIcons, 0);
        setRandomClothingNewColor(pantsIcons, 1);
        setRandomClothingNewColor(shoesIcons, 2);
        setRandomClothingNewColor(hatsIcons, 3);
        setRandomClothingNewColor(extrasIcons, 4);
    }

    // EXTRAS RANDOMIZER _______________________________________________________
    public void buttonRandomizerExtra(){
        setRandomClothingPreserveColor(extrasIcons, 4);
    }

    // HATS RANDOMIZER _________________________________________________________
    public void buttonRandomizerHat(){
        setRandomClothingPreserveColor(hatsIcons, 3);
    }

    // SHOES RANDOMIZER ________________________________________________________
    public void checkBoxDeciderShoes(ActionEvent check){
        String choice = randomShoesSelector.getValue();
        if (choice.equals("Randomize, Random Colors")){
            setRandomClothingNewColor(shoesIcons, 2);
        }
        else{
            setRandomClothingPreserveColor(shoesIcons, 2);
        }
    }

    // PANTS RANDOMIZER ________________________________________________________
    public void checkBoxDeciderPants(ActionEvent check){
        String choice = randomPantsSelector.getValue();
        if (choice.equals("Randomize, Random Colors")){
            setRandomClothingNewColor(pantsIcons, 1);
        }
        else{
            setRandomClothingPreserveColor(pantsIcons, 1);
        }
    }

    // SHIRT RANDOMIZER ________________________________________________________

    public void checkBoxDeciderShirt(ActionEvent check){
        String choice = randomTopSelector.getValue();
        if (choice.equals("Randomize, Random Colors")){
            setRandomClothingNewColor(shirtIcons, 0);
        }
        else{
            setRandomClothingPreserveColor(shirtIcons, 0);
        }
    }
    // ALL RANDOMIZATION _______________________________________________________________________________________________

    // SAVING/LOADING OUTFITS __________________________________________________________________________________________
    public void saveOutfit() {
        ArrayList<Pane> currentOutfit = new ArrayList<Pane>();
        currentOutfit.removeAll(currentOutfit);
        for (int i = 0; i < allClothing.size(); i++) {
            for (int j = 0; j < allClothing.get(i).size(); j++) {
                if (allClothing.get(i).get(j).isVisible()) {
                    currentOutfit.add(allClothing.get(i).get(j));
                }
            }
        }
        if (listOfOutfits.size() < 5) {
            listOfOutfits.add(currentOutfit);
            userInputLog.setText("Outfit saved successfully");
            userInputLog.setTextFill(Color.GREEN);
            }
        else {
            userInputLog.setText("You cannot save any more outfits");
            userInputLog.setTextFill(Color.RED);
        }
    }

    public void loadOutfit(ActionEvent check) {
        int index = 5;
        for (int i = 0; i < 5; i++) {
            if (outfitSelector.getValue().equals(outfitSelectorOptions[i])) {
                index = i;
                break;
            }
        }
        if (index >= listOfOutfits.size()){
            userInputLog.setTextFill(Color.CRIMSON);
            userInputLog.setText("This is an empty outfit");
        }
        else {
            for (ArrayList<Pane> clothingCategory : allClothing) {
                for (Pane clothes : clothingCategory) {
                    clothes.setVisible(false);
                }
            }
            for (int j = 0; j < listOfOutfits.get(index).size(); j++) {
                listOfOutfits.get(index).get(j).setVisible(true);
            }

            userInputLog.setTextFill(Color.GREEN);
            userInputLog.setText("Outfit change successful! " + outfitSelector.getValue());
        }
    }
    // SAVING/LOADING OUTFITS __________________________________________________________________________________________

    // CHOICEBOXES _____________________________________________________________________________________________________
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        randomTopSelector.getItems().addAll(topSelectorOptions);
        randomTopSelector.setOnAction(this::checkBoxDeciderShirt);
        randomPantsSelector.getItems().addAll(pantsSelectorOptions);
        randomPantsSelector.setOnAction(this::checkBoxDeciderPants);
        randomShoesSelector.getItems().addAll(shoesSelectorOptions);
        randomShoesSelector.setOnAction(this::checkBoxDeciderShoes);
        outfitSelector.getItems().addAll(outfitSelectorOptions);
        outfitSelector.setOnAction(this::loadOutfit);
    }
    // CHOICEBOXES _____________________________________________________________________________________________________

    // INDIVIDUAL CLOTHING ASSIGNMENTS _________________________________________________________________________________

    public void wearShirtOne(){
        checkIfWearing(shirtPanes);
        shirtPaneOne.setVisible(true);
    }
    public void wearShirtTwo(){
        checkIfWearing(shirtPanes);
        shirtPaneTwo.setVisible(true);

    }
    public void wearShirtThree(){
        checkIfWearing(shirtPanes);
        shirtPaneThree.setVisible(true);


    }
    public void wearShirtFour(){
        checkIfWearing(shirtPanes);
        shirtPaneFour.setVisible(true);
    }

    public void wearPantsOne(){
        checkIfWearing(pantsPanes);
        pantsPaneOne.setVisible(true);
    }
    public void wearPantsTwo(){
        checkIfWearing(pantsPanes);
        pantsPaneTwo.setVisible(true);
    }

    public void wearShoesOne(){
        checkIfWearing(shoesPanes);
        shoesPaneOne.setVisible(true);
    }
    public void wearShoesTwo(){
        checkIfWearing(shoesPanes);
        shoesPaneTwo.setVisible(true);
    }
    public void wearShoesThree(){
        checkIfWearing(shoesPanes);
        shoesPaneThree.setVisible(true);
    }
    public void wearPlungerShoes(){
        checkIfWearing(plungerShoesRotationPane);

    }

    public void wearHatOne(){
        checkIfWearing(hatsPanes);
        hatsPaneOne.setVisible(true);
    }
    public void wearHatTwo(){
        checkIfWearing(hatsPanes);
        hatsPaneTwo.setVisible(true);
    }
    public void wearHatThree(){
        checkIfWearing(hatsPanes);
        hatsPaneThree.setVisible(true);
    }

    public void wearExtraOne(){
        extraTermiteMoundPane.setVisible(!(extraTermiteMoundPane.isVisible()));
    }
    public void wearExtraTwo(){
        extraGlassesPane.setVisible(!(extraGlassesPane.isVisible()));
    }
    public void wearExtraThree(){
        extraSmallAnteaterPane.setVisible(!(extraSmallAnteaterPane.isVisible()));
    }
    // INDIVIDUAL CLOTHING ASSIGNMENTS _________________________________________________________________________________

}