package co.edu.utp.gia.sms.configuration;

public final class RecursosConstants {

    /**
     * Variable que representa el atributo recursos disponibles en la aplicacion
     */
    static final String[] RECURSOS_ADMINISTRADOR = { "/administracion/index.xhtml", "/seguridad/recurso/index.xhtml",
            "/seguridad/rol/index.xhtml", "/seguridad/usuario/index.xhtml", "/seguridad/usuario/actualizar.xhtml" };


    /**
     * Variable que representa el atributo recursosUsuario, el cual contiene el
     * listado de los recursos disponibles para usuarios no empleados o
     * administradores dentro de la aplicacion
     */
    static final String[] RECURSOS_USUARIO = { "/boleta/vender.xhtml", "/seguridad/usuario/actualizar.xhtml",
            "/revision/analizarReferencias.xhtml",
            "/revision/aplicarCriterios.xhtml",
            "/revision/aplicarCriterios2.xhtml",
            "/revision/evaluarReferencia.xhtml",
            "/revision/evaluarReferencias.xhtml",
            "/revision/gestionarReferenciasRepetidas.xhtml",
            "/revision/editarRevision.xhtml",
            "/revision/configurarProceso.xhtml",
            "/revision/referenciaAdicionarCitas.xhtml",
            "/revision/registrarTopico.xhtml",
            "/revision/registroAtributoCalidad.xhtml",
            "/revision/registroInicial.xhtml",
            "/revision/registroObjetivo.xhtml",
            "/revision/registroPregunta.xhtml",
            "/revision/registroReferencias.xhtml",
            "/revision/importarReferencias.xhtml",
            "/revision/importarReferenciasBaseDatos.xhtml",
            "/revision/importarReferenciasManual.xhtml",
            "/revision/importarReferenciasBolaNieve.xhtml",
            "/revision/registroRevision.xhtml",
            "/revision/registroTermino.xhtml",
            "/revision/resumenReferenciasDestacadas.xhtml",
            "/revision/resumenReferenciasSeleccionadas.xhtml",
            "/revision/seleccionarRevision.xhtml",
            "/revision/tablaResumenEvaluacionReferencias.xhtml",
            "/revision/tablaResumenEvaluacionReferenciasAtributo.xhtml",
            "/revision/revisores/index.xhtml",
            "/revision/cadenabusqueda/registro.xhtml",
            "/estadisticas/palabrasClave.xhtml",
            "/estadisticas/referenciaPalabrasClave.xhtml",
            "/estadisticas/referenciasCalidadYear.xhtml",
            "/estadisticas/referenciasPregunta.xhtml",
            "/estadisticas/referenciasTipo.xhtml",
            "/estadisticas/referenciasTipoFuente.xhtml",
            "/estadisticas/referenciasTermino.xhtml",
            "/estadisticas/referenciasTopico.xhtml",
            "/estadisticas/referenciasTopicoAtributoCalidad.xhtml",
            "/estadisticas/referenciasYear.xhtml",
            "/estadisticas/tablaReferenciasPreguntas.xhtml",
            "/estadisticas/tablaReferenciasTopicos.xhtml",
            "/ayuda/proceso.xhtml"
    };

    /**
     * Variable que representa el atributo recursos disponibles en la aplicacion
     */
    static final String[] RECURSOS_PUBLICOS = { "/index.xhtml", "/seguridad/usuario/registro.xhtml" };

    private RecursosConstants(){}
}
