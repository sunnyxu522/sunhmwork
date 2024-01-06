package cn.sun.hw.model.fetch;

import java.io.Serializable;

//graphql查询数据json对应object
public class QueryInfo implements Serializable {


	private String operationName;

	private String query;

	private Variable variables;

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public Variable getVariables() {
		return variables;
	}

	public void setVariables(Variable variables) {
		this.variables = variables;
	}
	
	

}
