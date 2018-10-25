class NamedCow extends Cow
{
	private String name;
	public NamedCow(String type, String sound, String n)
	{
		setType(type);         
        setSound(sound);     
        name = n;
	}
	public String getName()
	{
	return name;
}
}