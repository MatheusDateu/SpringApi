package com.tjrr.rpa.springapi.controller;

import com.tjrr.rpa.springapi.bean.BotBean;
import com.tjrr.rpa.springapi.dao.BotDao;
import com.tjrr.rpa.springapi.util.BotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BotController implements BotRepository {
    @Autowired
    public BotDao botDao;
    @PostMapping
    public BotBean inserir(@RequestBody BotBean bot) {
        return botDao.inserir(bot);
    }

    @PutMapping("/{codigo}")
    public BotBean alterar(@PathVariable BotBean bot) {
        return null;
    }

    @DeleteMapping("/{codigo}")
    public void deletar(@PathVariable BotBean bot) {

    }

    @GetMapping("/{codigo}")
    public BotBean selecionar(@PathVariable long codigo) {
        return null;
    }

    @GetMapping
    public List<BotBean> listar() {
        return null;
    }
}
