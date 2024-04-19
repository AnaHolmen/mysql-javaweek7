
package projects;

import projects.dao.DbConnection;

/**
 * @author AnaH
 *
 */
public class ProjectsApp {
	

	/**
	 * @Param args
	 */
	public static void main(String[]args) {
		DbConnection.getConnection();
		
	}
}

