package src.shared.domain;

import java.util.Date;

public class CreatedAt {
    final protected Date value;

    public CreatedAt(Date value){
        this.value = value;
    }

    public Date value() {
        return  this.value;
    }
}