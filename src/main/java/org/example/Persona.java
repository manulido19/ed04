package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un contacto en una agenda.
 */
class Persona {

    private String name;
    private List<String> phones;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}
/**
 * Constructor de la clase Contacto.
 *
 * @param name  Nombre del contacto.
 * @param phone Número de teléfono del contacto.
 */

