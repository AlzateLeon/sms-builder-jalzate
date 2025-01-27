package co.edu.utp.gia.sms.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
public class DatoDTO implements Serializable {
    /**
     * Variable que representa el atributo serialVersionUID de la clase
     */
    private static final long serialVersionUID = -7860668035943218928L;
    @Getter
    @Setter
    @NonNull
    private String etiqueta;
    @Getter
    @Setter
    @NonNull
    private Float valor;

    public DatoDTO(Object etiqueta, Long valor) {
        this.etiqueta = etiqueta.toString();
        this.valor = valor.floatValue();
    }

    /**
     * Metodo que permite inicializar los elementos de la clase DatoDTO
     *
     * @param etiqueta
     * @param valor
     */
    public DatoDTO(String etiqueta, Long valor) {
        this.etiqueta = etiqueta;
        this.valor = valor.floatValue();
    }

    /**
     * Metodo que permite inicializar los elementos de la clase DatoDTO
     *
     * @param etiqueta
     * @param valor
     */
    public DatoDTO(String etiqueta, Float valor) {
        this.etiqueta = etiqueta;
        this.valor = valor;
    }

    /**
     * Metodo que permite inicializar los elementos de la clase DatoDTO
     *
     * @param etiqueta
     * @param valor
     */
    public DatoDTO(String etiqueta, Double valor) {
        this.etiqueta = etiqueta;
        this.valor = valor.floatValue();
    }


}
