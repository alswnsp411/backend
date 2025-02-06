package org.nova.backend.board.common.application.port.out;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.nova.backend.board.common.domain.model.entity.File;

public interface FilePersistencePort {
    void save(File file);
    void deleteFilesByIds(List<UUID> fileIds);
    List<File> findFilesByIds(List<UUID> fileIds);
    Optional<File> findFileById(UUID fileId);
}
