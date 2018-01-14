package com.ydev.management.view;

import java.util.List;


import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;

import com.ydev.management.dao.Client;
import com.ydev.management.dao.Jpa;

@ManagedBean
@RequestScoped
public class SuccessBean {
//	Client client = new Client();
	Jpa dao = new Jpa();
	private List<Client> clients;
	@PostConstruct
	public void init()
	{
		clients = dao.getAll();
	}
	public void delete(Client client)
	{
		dao.delete(client);
		init();
	}
	
	public List<Client> getClients(){
		return clients;
	}
	
	public void edit(RowEditEvent event) {
		Client client = (Client)event.getObject();
		dao.update(client);
		FacesMessage msg = new FacesMessage("Client updated");
//        FacesMessage msg = new FacesMessage("", ((Client) event.getObject()).getId());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
	
	 public void cancelEvent(RowEditEvent event) {
		 FacesMessage msg = new FacesMessage("Update cancled !!!");
//       FacesMessage msg = new FacesMessage("", ((Client) event.getObject()).getId());
		 FacesContext.getCurrentInstance().addMessage(null, msg);
    }
	
	
}
