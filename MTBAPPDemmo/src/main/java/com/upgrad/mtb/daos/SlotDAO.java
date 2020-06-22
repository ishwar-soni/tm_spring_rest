package com.upgrad.mtb.daos;

import com.upgrad.mtb.beans.Slot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SlotDAO extends JpaRepository<Slot,Integer> {
}
