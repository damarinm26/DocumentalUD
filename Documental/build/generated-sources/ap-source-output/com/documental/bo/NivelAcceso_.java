package com.documental.bo;

import com.documental.bo.TipoUsuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-24T11:49:59")
@StaticMetamodel(NivelAcceso.class)
public class NivelAcceso_ { 

    public static volatile SingularAttribute<NivelAcceso, String> descripcion;
    public static volatile CollectionAttribute<NivelAcceso, TipoUsuario> tipoUsuarioCollection;
    public static volatile SingularAttribute<NivelAcceso, Integer> id;

}