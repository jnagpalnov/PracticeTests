package serializedPojos;

/**
 * Created by Jatin on 8/16/2018.
 */
public class Fees {
    private String Subtitle;

    private String Reserve;

    private String Bundle;

    private String Listing;

    private String EndDate;

    private ListingFeeTiers[] ListingFeeTiers;

    private String TenDays;

    private String SecondCategory;

    private String Gallery;

    private String Feature;

    public String getSubtitle ()
    {
        return Subtitle;
    }

    public void setSubtitle (String Subtitle)
    {
        this.Subtitle = Subtitle;
    }

    public String getReserve ()
    {
        return Reserve;
    }

    public void setReserve (String Reserve)
    {
        this.Reserve = Reserve;
    }

    public String getBundle ()
    {
        return Bundle;
    }

    public void setBundle (String Bundle)
    {
        this.Bundle = Bundle;
    }

    public String getListing ()
    {
        return Listing;
    }

    public void setListing (String Listing)
    {
        this.Listing = Listing;
    }

    public String getEndDate ()
    {
        return EndDate;
    }

    public void setEndDate (String EndDate)
    {
        this.EndDate = EndDate;
    }

    public ListingFeeTiers[] getListingFeeTiers ()
    {
        return ListingFeeTiers;
    }

    public void setListingFeeTiers (ListingFeeTiers[] ListingFeeTiers)
    {
        this.ListingFeeTiers = ListingFeeTiers;
    }

    public String getTenDays ()
    {
        return TenDays;
    }

    public void setTenDays (String TenDays)
    {
        this.TenDays = TenDays;
    }

    public String getSecondCategory ()
    {
        return SecondCategory;
    }

    public void setSecondCategory (String SecondCategory)
    {
        this.SecondCategory = SecondCategory;
    }

    public String getGallery ()
    {
        return Gallery;
    }

    public void setGallery (String Gallery)
    {
        this.Gallery = Gallery;
    }

    public String getFeature ()
    {
        return Feature;
    }

    public void setFeature (String Feature)
    {
        this.Feature = Feature;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Subtitle = "+Subtitle+", Reserve = "+Reserve+", Bundle = "+Bundle+", Listing = "+Listing+", EndDate = "+EndDate+", ListingFeeTiers = "+ListingFeeTiers+", TenDays = "+TenDays+", SecondCategory = "+SecondCategory+", Gallery = "+Gallery+", Feature = "+Feature+"]";
    }
}
