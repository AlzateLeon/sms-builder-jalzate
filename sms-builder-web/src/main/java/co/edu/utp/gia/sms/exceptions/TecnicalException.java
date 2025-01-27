package co.edu.utp.gia.sms.exceptions;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase que representa las excepciones tecnicas del sistema. Es usada para
 * envolver errores de caracter tecnico y presentarlos de una manera adecuada.
 *
 * @author Christian A. Candela
 * @author Luis Eduardo Sepúlveda
 * @author Grupo de Investigacion en Inteligencia Artificial - GIA
 * @author Universidad Tecnológica de Pereira
 * @author Grupo de Investigacion en Redes Informacion y Distribucion - GRID
 * @author Universidad del Quindío
 * @version 1.0
 * @since 10 abr. 2020
 */
public class TecnicalException extends RuntimeException {

    /**
     * Variable que representa el atributo serialVersionUID de la clase
     */
    private static final long serialVersionUID = 1L;

    /**
     * Determina si la excepcion debe o no tener visibilidad hacia el usuario.
     */
    @Getter
    @Setter
    private boolean visible;

    /**
     * Metodo que permite inicializar los elementos de la clase
     * TecnicalException
     *
     * @param message Mensaje de error
     */
    public TecnicalException(String message) {
        super(message);
        setVisible(true);
    }

    /**
     * Metodo que permite inicializar los elementos de la clase
     * TecnicalException
     *
     * @param cause Causa del error
     */
    public TecnicalException(Throwable cause) {
        super(cause);
        setVisible(false);
    }

    /**
     * Metodo que permite inicializar los elementos de la clase
     * TecnicalException
     *
     * @param message Mensaje del error
     * @param cause   Causa del error
     */
    public TecnicalException(String message, Throwable cause) {
        super(message, cause);
        setVisible(true);
    }

}
