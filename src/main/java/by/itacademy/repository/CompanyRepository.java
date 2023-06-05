package by.itacademy.repository;


import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CompanyRepository implements MyRepository {

    @Override
    public List<String> findAll() {
        return null;
    }
}
