package com.djs.community.community.dao;

import org.springframework.stereotype.Repository;

@Repository("Hibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
