package com.tjrr.rpa.springapi.dao;

import com.tjrr.rpa.springapi.bean.BotBean;
import com.tjrr.rpa.springapi.util.BotRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class BotDao implements BotRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    @Transactional
    public BotBean inserir(BotBean bot) {
        return manager.merge(bot);
    }

    @Override
    @Transactional
    public BotBean alterar(BotBean bot) {
        return manager.merge(bot);
    }

    @Override
    @Transactional
    public void deletar(BotBean bot) {
        bot = selecionar(bot.getCodigo());
        manager.remove(bot);
    }

    @Override
    public BotBean selecionar(long codigo) {
        return manager.find(BotBean.class, codigo);
    }

    @Override
    public List<BotBean> listar() {
        return manager.createQuery("from BotBean", BotBean.class).getResultList();
    }
}
