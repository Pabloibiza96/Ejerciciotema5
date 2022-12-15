package com.company;

/*
Crear una interfaz CocheCRUD.
Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
Como métodos de CocheCRUD podemos poner:
save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
Ejemplo:
CocheCRUD cocheCrud = new CocheCRUDImpl()
 */
public class Main {

    static CocheCRUD coche1 = new CocheCrudImpl();
    public static void main(String[] args) {

        coche1.findAll();
        coche1.save((CocheCrudImpl) coche1);
        coche1.delete((CocheCrudImpl) coche1);



    }



}
