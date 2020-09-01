
public class r {



public String getProfile(String prof)
	{
		String Profile=new String();
		Profile=prof;
		StringBuilder BuildProfile = new StringBuilder(Profile);
		BuildProfile.replace(0, 15, "");
		return BuildProfile.toString();
	}

}