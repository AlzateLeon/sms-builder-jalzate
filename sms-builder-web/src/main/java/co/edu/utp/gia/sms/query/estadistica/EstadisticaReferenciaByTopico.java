package co.edu.utp.gia.sms.query.estadistica;

import co.edu.utp.gia.sms.dtos.DatoDTO;
import co.edu.utp.gia.sms.query.Queries;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.TypedQuery;

/**
 * Consulta que permite obtener el número de referencias por Topico en una revision
 */
@Entity
@NamedQuery(name = EstadisticaReferenciaByTopico.NAME, query = EstadisticaReferenciaByTopico.QUERY)
public class EstadisticaReferenciaByTopico extends Queries {
    public static final String NAME = "Estadistica.referenciaByTopico";
    public static final String QUERY = "select new co.edu.utp.gia.sms.dtos.DatoDTO( CONCAT( t.pregunta.codigo,'-', t.descripcion ), COUNT(1) ) " +
            "from Revision revision inner join revision.pasoSeleccionado.referencias r LEFT JOIN r.topicos t  " +
            "where revision.id = :id GROUP BY t.id ORDER BY t.pregunta.id, t.descripcion";

    /**
     * Consulta que permite obtener el número de referencias por Topico en una revision
     *
     * @param entityManager Para la ejecución de la consulta
     * @param id            Id de la {@link co.edu.utp.gia.sms.entidades.Revision}
     * @return TypedQuery<DatoDTO> que representa la consulta
     */
    public static TypedQuery<DatoDTO> createQuery(EntityManager entityManager, Integer id) {
        return entityManager.createNamedQuery(NAME, DatoDTO.class)
                .setParameter("id", id);
    }
}
