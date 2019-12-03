
public class NewRegularPrice extends Price{

	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	public double getChager(int daysRented) {
		//return daysRented;
	    return daysRented * 3;
	}
	public int getFrequentRentalPoint(int daysRented) {
  		 return (daysRented>1) ? 2 : 1;
   }
}
