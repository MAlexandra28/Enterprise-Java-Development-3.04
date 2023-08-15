package CustomerStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Entity
@Data

public class FlightBooking {

    private int bookingId;
    private int customerId;
    private int flightId;
    private Long flightBook;
    private Long flightBooking;
    @Id
    private Long id;

    public FlightBooking( ) {
    }

    public FlightBooking(int customerId, int flightId) {
        this.customerId = customerId;
        this.flightId = flightId;
    }

    public void setFlightBooking(Long flightBooking) {
        this.flightBooking = flightBooking;
    }

    public Long getFlightBooking( ) {
        return flightBooking;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId( ) {
        return id;
    }
}



