package accesoOtroClas;

import acceso.trabajo;

public class acces {

    void accederDesdeOtraClase() {
        trabajo base = new trabajo();
        System.out.println(base.publico); // Acceso a propiedad pública
        // System.out.println(base.protegido); // Error: No se puede acceder a propiedad protegida
        // System.out.println(base.predeterminado); // Error: No se puede acceder a propiedad predeterminada
        // System.out.println(base.privado); // Error: No se puede acceder a propiedad privada
        base.metodoPublico(); // Acceso a método público
        // base.metodoProtegido(); // Error: No se puede acceder a método protegido
        // base.metodoPredeterminado(); // Error: No se puede acceder a método predeterminado
        // base.metodoPrivado(); // Error: No se puede acceder a método privado
    }
}
