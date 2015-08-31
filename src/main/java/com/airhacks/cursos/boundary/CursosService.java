package com.airhacks.cursos.boundary;

import javax.ejb.Stateless;

/**
 * Created by expertojava on 31/08/15.
 */
@Stateless
public class CursosService {

    public String All()
    {
        return "JavaEE, JavaScript, MongoDB";
    }
}
