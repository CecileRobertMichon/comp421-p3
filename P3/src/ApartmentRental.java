import java.sql.Connection;
import java.util.List;

import ui.ScreenRenderer;
import db.JDBCConnectionManager;
import db.models.Lodging;
import db.queries.lodgings.AllLodgingsQuery;

/**	
 * 	COMP 421 - Group 40
 * 	
 * 	Dang Khoa Do - 260584925
 * 	Yordan Neshev - 260587938
 * 	Cécile Robert-Michon - 260552816
 * 	Oleg Zhilin - 260581713
 * 
 * 	Main class for the apartment rental program.
 */

public class ApartmentRental {

	/**
	 * @param args The database password is provided as a command line argument 
	 */
	public static void main(String[] args) {
		Connection conn = JDBCConnectionManager.getConnection(args[0], args[1]);
		
		allLodgingsExample();
		
		System.out.println("Done");
	}
	
	/**
	 * 	EXAMPLE USAGE YO
	 */
	private static void allLodgingsExample() {
		AllLodgingsQuery alq = new AllLodgingsQuery();
		List<Lodging> lodgings = alq.getAllLodgings();
		
		for (Lodging l : lodgings) {
			System.out.println(l.lid + ", " + l.name);
		}
	}
}
