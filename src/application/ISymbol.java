package application;

import javafx.scene.image.Image;

public interface ISymbol {

	public Image getImage();
	public void setImage(Image image) ;
	public void setValue(int value) ;
	public int getValue();
}
