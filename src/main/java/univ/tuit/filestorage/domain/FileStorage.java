package univ.tuit.filestorage.domain;

import lombok.Getter;
import lombok.Setter;
import univ.tuit.filestorage.domain.enums.FileStorageStatus;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class FileStorage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String extension;

    private Long fileSize;

    private String hashId;

    private String contentType;

    private String uploadPath;

    @Enumerated(value = EnumType.STRING)
    private FileStorageStatus fileStorageStatus;

}
