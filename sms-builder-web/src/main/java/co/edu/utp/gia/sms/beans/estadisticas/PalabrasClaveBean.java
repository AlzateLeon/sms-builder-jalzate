package co.edu.utp.gia.sms.beans.estadisticas;

import co.edu.utp.gia.sms.beans.AbstractRevisionBean;
import co.edu.utp.gia.sms.dtos.DatoDTO;
import co.edu.utp.gia.sms.negocio.EstadisticaEJB;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.model.tagcloud.DefaultTagCloudItem;
import org.primefaces.model.tagcloud.DefaultTagCloudModel;
import org.primefaces.model.tagcloud.TagCloudModel;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@ViewScoped
public class PalabrasClaveBean extends AbstractRevisionBean {

    /**
     * Variable que representa el atributo serialVersionUID de la clase
     */
    private static final long serialVersionUID = -2705046687022203958L;
    @Getter
    @Setter
    private TagCloudModel modelo;
    @Inject
    private EstadisticaEJB estadisticaEJB;

    @Getter
    @Setter
    private Integer minimo;

    @Getter
    @Setter
    private List<DatoDTO> palabras;


    public void inicializar() {
        minimo = 2;
        if (getRevision() != null) {
            crearModelo();
        }
    }

    public void crearModelo() {
        palabras = estadisticaEJB.obtenerPalabrasClave(getRevision().getId(), minimo);
        modelo = new DefaultTagCloudModel();
        palabras.forEach(d ->
                modelo.addTag(new DefaultTagCloudItem(d.getEtiqueta(), d.getValor().intValue()))
        );
    }

}
