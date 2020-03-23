package com.appperfect.struts;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResourceCloseUtil {

	public static void closeResource(Object obj) {

		try {
			if (obj != null && obj.toString().equals("con"))
				((Connection) obj).close();
			if (obj != null && obj.toString().equals("rs"))
				((ResultSet) obj).close();
			if (obj != null && obj.toString().equals("st"))
				((Statement) obj).close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
