package application;


import javafx.scene.image.Image;

public class Symbol implements ISymbol{
   
	
	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	private Image image;
	private int Value;
	
	//Image image = new Image(new FileInputStream("url for the image)); "
	public int getValue() {
		return Value;
	}

	public void setValue(int value) {
		Value = value;
	}

	


	
	
}
