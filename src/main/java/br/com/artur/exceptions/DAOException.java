/**
 * 
 */
package br.com.artur.exceptions;

/**
 * @author artur.matos
 *
 */
public class DAOException extends Exception {

	private static final long serialVersionUID = 7054379063290825137L;

	public DAOException(String msg, Exception ex) {
		super(msg, ex);
    }
}
