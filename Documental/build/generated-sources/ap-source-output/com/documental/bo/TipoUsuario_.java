package com.documental.bo;

import com.documental.bo.Login;
import com.documental.bo.NivelAcceso;
import com.documental.bo.Tarea;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-24T11:49:59")
@StaticMetamodel(TipoUsuario.class)
public class TipoUsuario_ { 

    public static volatile SingularAttribute<TipoUsuario, Integer> idTipoUsuario;
    public static volatile SingularAttribute<TipoUsuario, NivelAcceso> idNivelAcceso;
    public static volatile SingularAttribute<TipoUsuario, String> tipoUsuario;
    public static volatile CollectionAttribute<TipoUsuario, Login> loginCollection;
    public static volatile CollectionAttribute<TipoUsuario, Tarea> tareaCollection;

}