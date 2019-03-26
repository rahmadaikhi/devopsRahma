package com.esprit.system.rahma.services;

import javax.ejb.Remote;

import com.esprit.system.rahma.entities.User;
import com.esprit.system.rahma.utilities.IGenericDAO;

@Remote
public interface UserServiceRemote extends IGenericDAO<User> {

}
