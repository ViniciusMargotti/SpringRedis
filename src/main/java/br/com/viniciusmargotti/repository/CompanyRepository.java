package br.com.viniciusmargotti.repository;

import br.com.viniciusmargotti.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, String> {
}
