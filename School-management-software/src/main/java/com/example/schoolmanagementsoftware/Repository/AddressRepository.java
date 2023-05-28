package com.example.schoolmanagementsoftware.Repository;

import com.example.schoolmanagementsoftware.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

    Address findAddressById(Integer id);

    @Query("delete from Address a where a.id=?1")
    void deleteAddress(Integer id);
}
