package com.appperfect.struts;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

/**
 * this is struts MVC assignment
 * <h1>To take form data and connect to database and display query result on
 * browser!</h1> The Class ServiceDataAction is an Action class extending Action
 * Support this class uses FormBean class to get form parameter it returns
 * either success or error
 * 
 * @author Hemang Joshi
 * @since 2020-03-10
 */
public class ServiceDataAction extends ActionSupport implements ConstantData {

	List<String> data = new ArrayList<>();
	List<String> listTest = new ArrayList<>();
	List<String[]> resultData = new ArrayList<>();

	private FormBean bean;
	private String errorMsg;
	
	private int clmCount;
	private int recordCount;

	public FormBean getBean() {
		return bean;
	}

	public void setBean(FormBean bean) {
		this.bean = bean;
	}

	public String execute() {
		/**
		 * this function connect to database depending on driver and query
		 * executes query and return data in list
		 */
		String isError = ERROR;
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			Class.forName(bean.getDriver().trim());
		} catch (ClassNotFoundException e) {
			errorMsg = MCNF;
			isError = ERROR;
			return isError;
		}
		try {
			con = DriverManager.getConnection(bean.getUrl().trim(), bean.getUsername().trim(), bean.getPassword());
			st = con.createStatement();
			rs = st.executeQuery(bean.getQuery());
			recordCount = 0;

			while (rs.next()) {
				recordCount++;
				clmCount = rs.getMetaData().getColumnCount();
				String[] row = new String[clmCount];
				for (int i = 0; i < clmCount; i++) {
					row[i] = rs.getString(i + 1);
				}
				resultData.add(row);
				isError = SUCCESS;
			}
		} catch (SQLSyntaxErrorException e) {
			errorMsg = MWQUERY;
			return isError;
		} catch (SQLException se) {
			String a = se.toString();

			if (a.contains(IURL)) {
				errorMsg = MIURL;
			}
			if (a.contains(IUP)) {
				errorMsg = MIUP;
			}
		} finally {
			ResourceCloseUtil.closeResource(rs);
			ResourceCloseUtil.closeResource(st);
			ResourceCloseUtil.closeResource(con);
		}

		return isError;
	}

	public List<String[]> getResult() {
		return resultData;
	}

	public void setResult(List<String[]> result) {
		this.resultData = result;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public int getClmCount() {
		return clmCount;
	}

	public void setClmCount(int clmCount) {
		this.clmCount = clmCount;
	}

	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

}
