    package com.example.userapimvc.repository;

    import com.example.userapimvc.entity.User;
    import org.springframework.data.jpa.repository.JpaRepository;

    public interface UserRepository extends JpaRepository<User,Integer> {
    }
