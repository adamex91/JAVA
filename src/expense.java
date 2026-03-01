import java.time.LocalDate;

public class expense {
    public int amount;
    public String category;
    public java.time.LocalDate date;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
