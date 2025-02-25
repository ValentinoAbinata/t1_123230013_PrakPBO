/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package t1_123230013;

/**
 *
 * @author ASUS
 */
public class IPKException extends Exception {

    /**
     * Creates a new instance of <code>IPKException</code> without detail
     * message.
     */
//    public IPKException() {
//    }

    /**
     * Constructs an instance of <code>IPKException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public IPKException(String msg) {
        super(msg);
    }
}
