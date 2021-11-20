package com.model.persistence;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.beans.AddOns;

@Repository
public interface AddOnDao extends JpaRepository<AddOns,Integer> {


	 @Query(" FROM AddOns")
	 ArrayList<AddOns> getAddOnDetails();
	 
	 @Query("Select addOn FROM AddOns")
	 ArrayList<String> getAddOns();
}
