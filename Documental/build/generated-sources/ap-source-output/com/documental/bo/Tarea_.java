package com.documental.bo;

import com.documental.bo.TipoUsuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-24T11:50:00")
@StaticMetamodel(Tarea.class)
public class Tarea_ { 

    public static volatile SingularAttribute<Tarea, Integer> idTarea;
    public static volatile SingularAttribute<Tarea, String> nombreTarea;
    public static volatile CollectionAttribute<Tarea, TipoUsuario> tipoUsuarioCollection;

}