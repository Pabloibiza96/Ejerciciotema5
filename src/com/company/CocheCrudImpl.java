package com.company;

import java.util.List;

public class CocheCrudImpl implements CocheCRUD {

    @Override
    public void save(CocheCrudImpl cocheCrudImpl) {
        System.out.println("Este es el método save");
    }

    @Override
    public List<CocheCrudImpl> findAll() {
        System.out.println("Este es el método findAll");
        return null;
    }

    @Override
    public void delete(CocheCrudImpl cocheCrudImpl) {
        System.out.println("Este es el método save");
    }
}
