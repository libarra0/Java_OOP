package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User
{
    private String speciality;

//    model.Doctor()
//    {
//        System.out.println("Building the model.Doctor object");
//    }


    public String getSpeciality()
    {
        return speciality;
    }

    public void setSpeciality(String speciality)
    {
        this.speciality = speciality;
    }

    public Doctor(String name, String email)
    {
        super(name, email);
        System.out.println("The doctor's name is: " + name);
        this.speciality = speciality;
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time)
    {
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments()
    {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return "model.Doctor{" + '\n' + super.toString() +
                "speciality='" + speciality + '\n' +
                "Available=" + availableAppointments.toString() + '\n' +
                '}';
    }

    public static class AvailableAppointment
    {
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time)
        {
            this.date = date;
            this.time = time;
        }

        public int getId()
        {
            return id;
        }

        public void setId(int id)
        {
            this.id = id;
        }

        public Date getDate()
        {
            return date;
        }

        public void setDate(Date date)
        {
            this.date = date;
        }

        public String getTime()
        {
            return time;
        }

        public void setTime(String time)
        {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointment{"  + '\n' +
                    "date=" + date  + '\n' +
                    "time='" + time + '\n' +
                    '}';
        }
    }
}
