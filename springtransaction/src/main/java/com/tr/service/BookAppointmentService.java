package com.tr.service;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.tr.controller.dto.AppointmentFormDto;
import com.tr.entity.Appointment;
import com.tr.entity.Patient;
import com.tr.repo.AppointmentRepo;
import com.tr.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Date;

@Service
//@Transactional
public class BookAppointmentService {

    @Autowired
    private PatientRepo patientRepo;

    @Autowired
    private AppointmentRepo appointmentRepo;

   @Transactional //(noRollbackFor = ArithmeticException.class) //-->for unchecked exception
   // @Transactional (rollbackFor = ClassNotFoundException.class)
    public String bookAppointment(AppointmentFormDto appointmentFormDto) throws ClassNotFoundException {
    	
        Patient patient = new ObjectMapper().convertValue(appointmentFormDto, Patient.class);
        Long patientNo = patientRepo.save(patient).getPatientNo();
        System.out.println(">>>>>>>>>patient saved successfully!!!<<<<<<<<<");


     //   System.out.println(10 / 0); //unchecked exception
        
       Class.forName("The Class do not Exist"); //checked exception
		
        
        Appointment appointment = Appointment.builder()
                .date(new Date(System.currentTimeMillis()))
                .doctorNo(101l)
                .patientNo(patientNo)
                .build();
        Long appointmentNo = appointmentRepo.save(appointment).getAppointmentNo();

        return "Appointment booked successfully!! with : " + appointmentNo;
    }
}