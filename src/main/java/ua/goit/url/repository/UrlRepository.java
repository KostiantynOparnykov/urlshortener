package ua.goit.url.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.goit.url.UrlEntity;

import java.util.UUID;

@Repository
public interface UrlRepository extends JpaRepository<UrlEntity, UUID> {

}