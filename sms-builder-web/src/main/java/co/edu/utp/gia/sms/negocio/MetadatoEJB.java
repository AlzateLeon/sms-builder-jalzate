package co.edu.utp.gia.sms.negocio;

import co.edu.utp.gia.sms.entidades.Metadato;
import co.edu.utp.gia.sms.entidades.TipoMetadato;
import co.edu.utp.gia.sms.query.referencia.ReferenciaGetMetadatos;
import co.edu.utp.gia.sms.query.referencia.ReferenciaGetMetadatosByTipo;

import javax.ejb.Stateless;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class MetadatoEJB extends AbstractEJB<Metadato, Integer> {

    public MetadatoEJB() {
        super(Metadato.class);
    }

    /**
     * Consulta que permite obtener los metadatos de una referencia que pertenecen a un cierto tipo
     *
     * @param id Id de la {@link co.edu.utp.gia.sms.entidades.Referencia}
     * @param tipo Tipo de metadato que se desea obtener
     * @return List< Metadato > de la referencia que son del tipo indicado
     */
    public List<Metadato> obtenerListMetadatoByTipo(Integer id, TipoMetadato tipo) {
        return ReferenciaGetMetadatosByTipo.createQuery(entityManager,id,tipo).getResultList();
    }

    public String obtenerStringMetadatoByTipo(Integer idReferencia, TipoMetadato tipoMetadato) {
        List<Metadato> listMetadatos = obtenerListMetadatoByTipo(idReferencia, tipoMetadato);


        return listMetadatos.stream().map(Metadato::getValue).collect(Collectors.joining(" ; "));
    }

    /**
     * Consulta que permite obtener los Metadatos de una Referencia
     *
     * @param id Id de la {@link co.edu.utp.gia.sms.entidades.Referencia}
     * @return List<Metadato> listado de los metadatos de la referencia del id dado
     */
    public List<Metadato> obtenerMetadatos(Integer id) {
        return ReferenciaGetMetadatos.createQuery(entityManager,id).getResultList();
    }

}
