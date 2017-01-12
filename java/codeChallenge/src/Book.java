  
public class Book {
    
private String name;
private String author;
private Integer numOfPages;
private Double price;
private String publication;
Book()
{
}
	public Book (String name,String author,Integer numOfPages,Double price,String publication)
	{
		this.name = name;
		this.author = author;
		this.numOfPages = numOfPages;
		this.price = price;
		this.publication = publication;
	}
void setName(String name)
{
    this.name = name;
}
String getName()
{
    return name;
}

   


void setAuthor(String author)
{
    this.author = author;
}
String getAuthor()
{
    return author;
}

void setNumOfPages(Integer numOfPages)
{
    this.numOfPages = numOfPages;
}
Integer getNumOfPages()
{
    return numOfPages;
}


void setPrice(Double price)
{
    this.price = price;
}
Double getPrice()
{
    return price;
}
void setPublication(String publication)
{
    this.publication = publication;
}
String getPublication()
{
    return publication;
}

public String toString()
{

return String.format("%s %s %d %2.2f %s",getName(),getAuthor(),getNumOfPages(),getPrice(),getPublication());
}
}


