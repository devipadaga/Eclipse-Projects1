package factory.design.Pattern;

public class Factory {
	
	public Profession getProfession(String typeOfProfession)

	{
		if(typeOfProfession==null)
		{
			return null;
		}
		else if(typeOfProfession.equalsIgnoreCase("Doctor"))
		{
			return new Doctor();
		}
		else if(typeOfProfession.equalsIgnoreCase("Engineer"))
		{
			return new Engineer();
		}
		else if(typeOfProfession.equalsIgnoreCase("Teacher"))
		{
			return new Teacher();
		}
		return null;
		
	}
}
