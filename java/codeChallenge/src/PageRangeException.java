class PageRangeException extends Exception
{
	private String msg;
	
	//fill the code
if(numOfPages>1000 && numOfPages<0)
{
msg="Number of pages is not within range";
}
	public String toString()
	{
		return "PageRangeException: "+ msg;


	}}
