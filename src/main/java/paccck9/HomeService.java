package paccck9;

import org.springframework.stereotype.Service;

import pacck9.HouseRqo;

@Service
public class HomeService {
	public HouseRqo AllSrvice() {

		HouseRqo hr = new HouseRqo();
		hr.setAddress("2276 penbury Woodbridge VA 22191");
		hr.setNumber("204");
		hr.setRooms("3 Rooms");
		hr.setFlour("5th");
		return hr;

	}

}
