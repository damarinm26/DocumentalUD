package com.documental.bo;

import com.documental.bo.TipoUsuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-24T11:49:59")
@StaticMetamodel(Login.class)
public class Login_ { 

    public static volatile SingularAttribute<Login, String> correo;
    public static volatile SingularAttribute<Login, String> usuario;
    public static volatile SingularAttribute<Login, String> contrasena;
    public static volatile SingularAttribute<Login, TipoUsuario> tipoUsuario;

}