package org.sakaiproject.scorm.service.api;

import org.sakaiproject.scorm.model.api.SessionBean;

public interface INavigable {

	public void displayResource(SessionBean sessionBean, Object target);
	
}