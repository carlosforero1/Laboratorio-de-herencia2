package acceso;

import acceso.trabajo;

public class herenciaModif extends trabajo {
    void accederDesdeClaseHija() {
        System.out.println(publico); // Acceso a propiedad pública
        System.out.println(protegido); // Acceso a propiedad protegida
        System.out.println(predeterminado); // Acceso a propiedad predeterminada (paquete)
        // System.out.println(privado); // Error: No se puede acceder a propiedad privada
        metodoPublico(); // Acceso a método público
        metodoProtegido(); // Acceso a método protegido
        metodoPredeterminado(); // Acceso a método predeterminado (paquete)
        // metodoPrivado(); // Error: No se puede acceder a método privado
    }
}
