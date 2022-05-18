//create a currency object
public class Currency
{
    private String symbol ; //symbol of the currency
    private String name ;  // name of the currency
    private int rank ; // rank of the currency
    private Double price ; //price of the currency $.
    private Double maxbid ; //shows the maximum bid currency got.at the begining it is null

    //constructor
    public Currency(String name , String symbol , int rank )
    {
        this.name = name ;
        this.symbol = symbol ;
        this.rank = rank ;
        this.price = null ;   //at the begining we dont know the price
        this.maxbid = null ; // at the initialisation there is no bid
    }

    //get methods
    public String getSymbol()
    {
        return symbol;
    }

    public String getName()
    {
        return name;
    }

    public int getRank()
    {
        return rank;
    }

    public double getPrice()
    {
        return price;
    }

    public Double getMaxbid()
    {
        return maxbid;
    }

    //set methods
    public void setName(String name)
    {
        this.name = name;
    }

    public void setSymbol(String symbol)
    {
        this.symbol = symbol;
    }

    public void setRank(int rank)
    {
        this.rank = rank;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setMaxbid(Double maxbid)
    {
        this.maxbid = maxbid;
    }
}
