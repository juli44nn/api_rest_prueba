package com.example.inicial1.congif;


import com.example.inicial1.audit.Revision;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {


    @Override
    public void newRevision(Object revisionEntity) {

        Revision rev = (Revision) revisionEntity;

    }
}
