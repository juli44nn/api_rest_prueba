package com.example.inicial1.services;

import com.example.inicial1.entities.Base;
import com.example.inicial1.entities.Persona;
import com.example.inicial1.repositories.BaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;


@Service
public abstract class BaseServiceImp <E extends Base, ID extends Serializable> implements BaseService<E,ID> {

    @Autowired
    protected BaseRepository<E, ID> repositorio;

    public BaseServiceImp(BaseRepository<E, ID> repositorio) {
        this.repositorio = repositorio;
    }

    @Transactional
    @Override
    public List<E> findAll() throws Exception {
        try {
            List<E> entidades = repositorio.findAll();
            return entidades;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    @Override
    public E findById(ID id) throws Exception {
        try {
            Optional<E> entityOptional = repositorio.findById(id);
            return entityOptional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    @Override
    public E save(E entity) throws Exception {
        try {
            entity = repositorio.save(entity);
            return entity;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    @Override
    public E update(ID id, E entity) throws Exception {
        try {
            Optional<E> entityOptional = repositorio.findById(id);
            E entityUpdate = entityOptional.get();
            entityUpdate= repositorio.save(entity);
            return entityUpdate;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    @Override
    public Boolean delete(ID id) throws Exception {
        try {
            repositorio.deleteById(id);
            return true;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    @Override
    public Page<E> findAll(Pageable pageable) throws Exception {
        try{
            Page<E> entities = repositorio.findAll(pageable);
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}


