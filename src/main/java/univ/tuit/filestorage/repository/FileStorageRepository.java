package univ.tuit.filestorage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import univ.tuit.filestorage.domain.FileStorage;
import univ.tuit.filestorage.domain.enums.FileStorageStatus;

import java.util.List;

@Repository
public interface FileStorageRepository extends JpaRepository<FileStorage, Long> {

    FileStorage findByHashId(String hashId);

    List<FileStorage> findByFileStorageStatus(FileStorageStatus status);
}
