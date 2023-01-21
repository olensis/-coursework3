package me_sad.coursework3.Service;

import me_sad.coursework3.Model.FileMessageException;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;

public interface FilesService {
    boolean saveSockToFile(String json);

    String readSocksFromFile() throws FileMessageException;

    void cleanFile(String fileName) throws FileNotFoundException, FileMessageException;

    Path createTempFile(String suffix);

    File getFileSOck();

    void cleanSockFile() throws FileMessageException, FileNotFoundException ;


}

