class DesktopPC
{
	private String model;
	private int ramSize;
	private int hardDiskCapacity;
	private Processor processor;
	public String getModel()
	{
		return model;
	}
	public int getRamSize()
	{
		return ramSize;
	}
	public int getHardDiskCapacity()
	{
		return hardDiskCapacity;
	}
	public Processor getProcessor()
	{
		return processor;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public void setRamSize(int ramSize)
	{
		this.ramSize = ramSize;
	}
	public void setHardDiskCapacity(int hardDiskCapacity)
	{
		this.hardDiskCapacity = hardDiskCapacity;					
	}
	public void setProcessor(Processor processor)
	{
		this.processor = processor;
	}
	public DesktopPC( String model, int ramSize, int hardDiskCapacity, Processor processor)
	{
		this.model = model;
		this.ramSize = ramSize;
		this.hardDiskCapacity = hardDiskCapacity;
		this.processor = processor;
	}
	public DesktopPC()
	{
	}
	public String toString()
	{
		return String.format("%-10s %-10d %-15d %-40s", model, ramSize, hardDiskCapacity, processor);
	}
}


