package kea.group4.backend.repositories;

import kea.group4.backend.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {

    Address findByStreetAndHouseNumberAndFloorNumberAndDoorNumberAndZipCode(
            String street, int houseNumber, int floorNumber, String doorNumber, int zipCode);
}
