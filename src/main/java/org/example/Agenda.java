package org.example;

import java.util.*;

/**
 * Clase que representa una agenda de contactos.
 */
public class Agenda {
    private List<Contacto> contacts; // Lista de Contacto
    /**
     * Constructor de la clase Agenda.
     * Inicializa la lista de contactos.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Método para añadir un nuevo contacto a la agenda.
     *
     * @param name  Nombre del contacto a añadir.
     * @param phone Número de teléfono del contacto a añadir.
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Método para eliminar un contacto de la agenda.
     *
     * @param name Nombre del contacto a eliminar.
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Método para modificar el número de teléfono de un contacto en la agenda.
     *
     * @param name     Nombre del contacto cuyo número de teléfono se quiere modificar.
     * @param oldPhone Número de teléfono antiguo que se quiere cambiar.
     * @param newPhone Nuevo número de teléfono.
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Método para obtener la lista de contactos de la agenda.
     *
     * @return La lista de contactos de la agenda.
     */
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}
