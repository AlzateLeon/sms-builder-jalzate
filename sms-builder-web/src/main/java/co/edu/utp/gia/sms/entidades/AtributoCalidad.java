package co.edu.utp.gia.sms.entidades;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * @author Christian A. Candela
 * @author Luis Eduardo Sepúlveda
 * @author Grupo de Investigacion en Redes Informacion y Distribucion - GRID
 * @author Universidad del Quindío
 * @author Grupo de Investigacion en Inteligencia Artificial - GIA
 * @author Universidad Tecnológica de Pereira
 * @version 1.0
 * @since 13/06/2019
 */
@Entity
@EqualsAndHashCode
@NoArgsConstructor
@RequiredArgsConstructor
public class AtributoCalidad implements Entidad<Integer> {
    /**
     * Variable que representa el atributo serialVersionUID de la clase
     */
    private static final long serialVersionUID = -176556849502833317L;

    /**
     * Variable que representa el atributo id de la clase
     */
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Getter
    @Setter
    private Integer id;

    /**
     * Variable que representa el atributo texto de la clase
     */
    @Column(nullable = false)
    @Getter
    @Setter
    @EqualsAndHashCode.Exclude
    @NonNull
    private String descripcion;

    /**
     * {@link Revision} a la cual pertenece el atributo de calidad
     */
    @ManyToOne
    @Getter
    @Setter
    @EqualsAndHashCode.Exclude
    @NonNull
    private Revision revision;

}
