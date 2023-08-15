package CustomerStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
public class Customer {
    private int customerId;
    private String customerName;
    private String customerStatus;
    private String totalCustomerMileage;
    @Id
    private Long id;


    public Customer( ) {
        this.customerName = customerName;
        this.customerStatus = customerStatus;
        this.totalCustomerMileage = totalCustomerMileage;
    }

    public int getCustomerId( ) {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName( ) {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerStatus( ) {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    public String getTotalCustomerMileage( ) {
        return totalCustomerMileage;
    }

    public void setTotalCustomerMileage(String totalCustomerMileage) {
        this.totalCustomerMileage = totalCustomerMileage;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId( ) {
        return id;
    }
}

