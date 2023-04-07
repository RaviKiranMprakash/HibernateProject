package com.ty.hospitalController;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class updateHospital {
	public static void main(String[] args) {
		
	
	Hospital hospital=new Hospital();
	HospitalService service=new HospitalService();
	hospital.setHospital_name("vini");
	hospital.setHospital_web("www.vini.com");
	service.updateHospitalById(2, hospital);
	}

}
