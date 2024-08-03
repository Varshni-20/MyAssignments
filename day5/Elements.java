package day5;

public class Elements extends Button {

	public static void main(String[] args) {
		WebElement ele = new WebElement();
		TextField txt = new TextField();
		RadioButton r = new RadioButton();
		CheckBoxButton c = new CheckBoxButton();
		Button b = new Button();
		ele.click();
		ele.setText("Varshni");
		txt.getText();
		txt.click();
		txt.setText("Nila");
		r.selectRadioButton();
		r.submit();
		c.clickCheckButton();
		c.submit();
		b.submit();
		b.click();
		b.setText("Nila Varshni");

	}

}
