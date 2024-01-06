package cn.sun.hw.model.fetchInfo;

import java.io.Serializable;

//graphql查询数据json对应object
public class QueryDetail implements Serializable {


	private String operationName;

	private String query;

	private VariableDetail variables;

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

	public VariableDetail getVariables() {
		return variables;
	}

	public void setVariables(VariableDetail variables) {
		this.variables = variables;
	}

}
