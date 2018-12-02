package com.ahmedgeze.webservice.response;

public class BaseResponse {
    public static final String ERROR_CODE="404";
    public static final String NOT_AUTHENTICATİON="401";
    public static final String SUCCESS_CODE="200";




    private String operationCode;
    private Boolean operationSuccess;
    private String operationMessage;


    public BaseResponse() {

    }

    public BaseResponse(String operationCode, Boolean operationSuccess, String operationMessage) {
        this.operationCode = operationCode;
        this.operationSuccess = operationSuccess;
        this.operationMessage = operationMessage;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    public Boolean getOperationSuccess() {
        return operationSuccess;
    }

    public void setOperationSuccess(Boolean operationSuccess) {
        this.operationSuccess = operationSuccess;
    }

    public String getOperationMessage() {
        return operationMessage;
    }

    public void setOperationMessage(String operationMessage) {
        this.operationMessage = operationMessage;
    }
}
