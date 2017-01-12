class Processor
{
	private String type;
	private double frequency;
	public String getType()
	{
		return type;
	}
	public double getFrequency()
	{
		return frequency;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public void setFrequency(double frequency)
	{
		this.frequency = frequency;
	}
	public Processor( String type, double frequency)
	{
		this.type = type;
		this.frequency = frequency;
	}
	public Processor()
	{
	}
	public String toString()
	{
		return String.format("%-20s %-5.2f", type, frequency);
	}
}

