package com.ty.hospitalController;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class GetHospital {

	public static void main(String[] args) {
		
		HospitalService service=new HospitalService();
		Hospital hospital=service.getHospitalById(1);
		System.out.println(hospital.getHospital_id());
		System.out.println(hospital.getHospital_name());
		System.out.println(hospital.getHospital_web());
		
	}

}
