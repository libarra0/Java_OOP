package model;

public class Patient extends User
{
    private String birthday;
    private double weight;
    private double height;
    private String bloodType;

    public Patient(String name, String email)
    {
        super(name, email);
        System.out.println("Building the model.Patient object");
    }

    public String getBirthday()
    {
        return birthday;
    }

    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }

    public String getWeight()
    {
        return weight + " Kg";
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public String getHeight()
    {
        return height + " Mts.";
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public String getBloodType()
    {
        return bloodType;
    }

    public void setBloodType(String bloodType)
    {
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return "model.Patient{" + '\n' + super.toString() +
                "birthday='" + birthday + '\n' +
                "weight=" + getWeight() + '\n' +
                "height=" + getHeight() + '\n' +
                "bloodType='" + bloodType + '\n' +
                '}';
    }
}
