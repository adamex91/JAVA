import java.time.LocalDate;
import java.util.Date;
import java.text.SimpleDateFormat;


public class expense {
    public int amount;
    public String category;
    public String date;
    public String description;


    public int getAmount(){
        return amount;
    }
    public void setAmount(int newAmount){
        this.amount=newAmount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
