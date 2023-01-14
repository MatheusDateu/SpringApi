package com.tjrr.rpa.springapi.util;

import com.tjrr.rpa.springapi.bean.BotBean;

import java.util.List;

public interface BotRepository {
    public BotBean inserir(BotBean bot);
    public BotBean alterar(BotBean bot);
    public void deletar(BotBean bot);
    public BotBean selecionar(long codigo);
    public List<BotBean> listar();
}
