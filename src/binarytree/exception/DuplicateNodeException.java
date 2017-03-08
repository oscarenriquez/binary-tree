/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree.exception;

/**
 *
 * @author Oscar Enríquez
 */
public class DuplicateNodeException extends Exception {    
    private String message;
    private Throwable cause;

    public DuplicateNodeException() {
        this.message = "DUPLICATE NODE";
    }        
    
    public DuplicateNodeException(String message, Throwable cause) {        
        this.message = message;
        this.cause = cause;
    }

    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public void setCause(Throwable cause) {
        this.cause = cause;
    }       
    
}