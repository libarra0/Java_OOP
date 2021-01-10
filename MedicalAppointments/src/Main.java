import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        //showMenu();

        Doctor myDoctor = new Doctor("Adrian Macedo", "arian@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        System.out.println(myDoctor);

        for(Doctor.AvailableAppointment avAp: myDoctor.getAvailableAppointments())
        {
            System.out.println(avAp.getDate() + " " + avAp.getTime());
        }

        Patient patient = new Patient("Angel", "angel@gmail.com");
        System.out.println(patient);
    }
}
