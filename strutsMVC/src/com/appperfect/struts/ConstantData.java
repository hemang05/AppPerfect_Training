package com.appperfect.struts;

public interface ConstantData {

	String DRIVERNAME = "driver";
	String DRIVERDATA = "com.mysql.jdbc.Driver";
	String URLCHECK = "jdbc:mysql://localhost:3306/Northwind";
	String PASSWORDCHECK = "";
	String USERNAMECHECK = "root";
	String USERNAMEDATA = "root";
	String USERNAME = "username";
	String URLDATA = "url";
	String PASSWORD = "password";
	String QUERYINPUT = "query";
	String HTMLCLOSE = "</table></body>";
	String TABLEROW = "<tr>";
	String TABLECOLUMN = "<td>";
	String ENDCOLUMN = "</td>";
	String QUERYMSG = "<br><h2 style='color:red'>---- you entered an incorrect query";
	String INPUTMSG = "<br><h2 style='color:red'>---- ENTER correct Input";
	String HTMLDATAS = "<body style='background-color:lightblue'>Data :<table border='1'  style='background-color:#EBDFF7'>";
	String HTMLDATAE = "<h2 style='color:red'><i>no data present as per requirement </h2></i>";

	String DATAIN = "root";
	String HTMLSTYLING = "<body style='background-color:lightblue'><h2>Data:</h2><table border='1' style='background-color:#EBDFF7'> ";

	String CNF = "ClassNotFoundException";
	String MCNF = "driver class not found";
	String IURL = "No suitable driver found for";
	String MIURL = "url is not proper";
	String IUP = "Access denied for user";
	String MIUP = "incorrect username or password";

	String WQUERY = "SQLSyntaxErrorException";
	String MWQUERY = "you entered an incorrect query";

	String CORRECT = "<br><h2 style='color:red'><i>enter the correct data";
	String DCE="driver cannot be empty ... ";
	String URLCE="url cannot be empty ... ";
	String QCE="query cannot be empty ... ";
	String UCE="username cannot be empty ... ";
	String ROWBREAK="----------------------------";
}
