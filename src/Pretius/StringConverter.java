package Pretius;

public class StringConverter {

	public float convertPriceToFloat(String pln) {
		float returnedValue = 0.0f;
		if (pln.trim() != null || pln.trim() != "" ) {
			String [] split = pln.split(",");
			String amountFirst = split[0];
			String amountSecond = split[1];
			int amountFirstInt = Integer.parseInt(amountFirst);
			int amountSecondInt = 0;
			if (amountSecond.length() == 4) {
				amountSecondInt = Integer.parseInt(amountSecond.substring(0,1));
			}
			else {
				amountSecondInt = Integer.parseInt(amountSecond.substring(0,2));
			}
			
			
			returnedValue = amountFirstInt + amountSecondInt/100f;
		}
		System.out.println(returnedValue);
		return returnedValue;
	}
}
