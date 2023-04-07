package com.ty.hospitalController;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class SaveHospital {

	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		HospitalService service=new HospitalService();
		hospital.setHospital_name("sidaganga");
		hospital.setHospital_web("www.sidaganga.com");
		hospital.setHospital_web("www.sidaganga.com");
		service.saveHospital(hospital);
	}

}
