package com.company;

import java.util.List;

public interface CocheCRUD {

    //save() findAll() delete() que simplemente impriman por consola el nombre del propio

    void save(CocheCrudImpl cocheCrudImpl);

    List<CocheCrudImpl> findAll();

    void delete(CocheCrudImpl cocheCrudImpl);
}
