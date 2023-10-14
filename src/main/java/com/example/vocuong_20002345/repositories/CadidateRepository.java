package com.example.vocuong_20002345.repositories;

import com.example.vocuong_20002345.models.Candidate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CadidateRepository extends JpaRepository<Candidate,Long> {




}
