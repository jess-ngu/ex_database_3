package ca.sheridancollege.nguye399.drinks;

import java.io.Serializable;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drink implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9123984775845707509L;

	private int id;
	private String name;
	private String main;
	private double amount1;
	private String second;
	private double amount2;
	private String directions;
}
