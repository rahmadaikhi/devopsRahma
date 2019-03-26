package com.esprit.system.rahma.services;

import javax.ejb.Local;

import com.esprit.system.rahma.entities.User;
import com.esprit.system.rahma.utilities.IGenericDAO;

@Local
public interface UserServiceLocal extends IGenericDAO<User> {

	User login(String login, String password);

}
