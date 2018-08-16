package serializedPojos;

/**
 * Created by Jatin on 8/16/2018.
 */
public class Promotions {
    private String Name;

    private String Description;

    private String Price;

    private String Id;

    private String MinimumPhotoCount;

    public String getName ()
    {
        return Name;
    }

    public void setName (String Name)
    {
        this.Name = Name;
    }

    public String getDescription ()
    {
        return Description;
    }

    public void setDescription (String Description)
    {
        this.Description = Description;
    }

    public String getPrice ()
    {
        return Price;
    }

    public void setPrice (String Price)
    {
        this.Price = Price;
    }

    public String getId ()
    {
        return Id;
    }

    public void setId (String Id)
    {
        this.Id = Id;
    }

    public String getMinimumPhotoCount ()
    {
        return MinimumPhotoCount;
    }

    public void setMinimumPhotoCount (String MinimumPhotoCount)
    {
        this.MinimumPhotoCount = MinimumPhotoCount;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Name = "+Name+", Description = "+Description+", Price = "+Price+", Id = "+Id+", MinimumPhotoCount = "+MinimumPhotoCount+"]";
    }
}
