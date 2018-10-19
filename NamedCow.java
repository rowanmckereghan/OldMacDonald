class NamedCow extends Cow
{
	private String myType;
	private String mySound;
	private String name;
	public NamedCow(String type, String sound, String n)
	{
		myType = type;         
        mySound = sound;     
        name = n;
	}
	public String getName()
	{
	return name;
}
}