package persistence.commons;

import persistence.*;
import persistence.impl.*;


public class DAOFactory {

	public static UserDAO getUserDAO() {
		return new UserDAOImpl();
	}
	
	public static AttractionDAO getAttractionDAO() {
		return new AttractionDAOImpl();
	}
	
	public static BasePromotionDAO getPromotionDAO() {
		return new BasePromotionDAOImpl();
	}
	public static ItineraryDAO  getItineraryDAO(){
		return new ItineraryDAOImpl();
	}

}
