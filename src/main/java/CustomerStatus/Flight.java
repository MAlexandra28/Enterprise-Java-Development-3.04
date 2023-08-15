package CustomerStatus;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;



@Entity
@Data

public class Flight extends Customer{

    private int flightId;
    private int flightNumber;
    private int aircraft;
    private int totalAircraftSeats;
    private int flightMileage;
    private Long flight;
    private Long costumer;
    @Id
    private Long id;

    public Flight() {
        super ();
    }

    public Flight(int flightNumber, int aircraft, int totalAircraftSeats, int flightMileage) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.totalAircraftSeats = totalAircraftSeats;
        this.flightMileage = flightMileage;
    }


    public void setCostumer(Long costumer) {
        this.costumer = costumer;
    }

    public Long getCostumer( ) {
        return costumer;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId( ) {
        return id;
    }
}



