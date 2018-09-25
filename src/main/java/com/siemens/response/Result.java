package com.siemens.response;

import java.io.Serializable;

/**
 * 用于存放结果
 * 
 *
 */
public class Result<T> implements Serializable {
	private static final long serialVersionUID = 3619080130735289328L;

	private Integer code; //

	private String msg; //

	private T data;
	public static Result getInitializedResult() {
		Result result = new Result();
		result.code = Status.LSucceed.getCode();
		result.msg = Status.LSucceed.getMessage();
		return result;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
