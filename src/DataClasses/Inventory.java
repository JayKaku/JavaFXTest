package DataClasses;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Inventory {
    private SimpleIntegerProperty id;
    private SimpleStringProperty name;
    private SimpleIntegerProperty price;
    private SimpleIntegerProperty quantity;
    private SimpleStringProperty image;
    private SimpleStringProperty description;
    private SimpleStringProperty category;

    public int getId() {
        return id.get();
    }

    public void setId(SimpleIntegerProperty id) {
        this.id = id;
    }

    public String getName() {
        return name.get();
    }

    public void setName(SimpleStringProperty name) {
        this.name = name;
    }

    public int getPrice() {
        return price.get();
    }

    public void setPrice(SimpleIntegerProperty price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity.get();
    }

    public void setQuantity(SimpleIntegerProperty quantity) {
        this.quantity = quantity;
    }

    public String getImage() {
        return image.get();
    }

    public void setImage(SimpleStringProperty image) {
        this.image = image;
    }

    public String getDescription() {
        return description.get();
    }

    public void setDescription(SimpleStringProperty description) {
        this.description = description;
    }

    public String getCategory() {
        return category.get();
    }

    public void setCategory(SimpleStringProperty category) {
        this.category = category;
    }
}
