import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

class Untitled {
	IntegerProperty d1 = new SimpleIntegerProperty(1);
	IntegerProperty d2 = new SimpleIntegerProperty(2);
	//d1.bind(d2);
	System.out.println("d1 is " + d1.getValue() + " and d2 is " + d2.getValue());
	//d2.setValue(3);
	System.out.println(", d1 is " + d1.getValue() + " and d2 is " + d2.getValue());
}