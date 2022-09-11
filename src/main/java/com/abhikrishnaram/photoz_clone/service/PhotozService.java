package com.abhikrishnaram.photoz_clone.service;

import com.abhikrishnaram.photoz_clone.model.Photo;
import com.abhikrishnaram.photoz_clone.repository.PhotozRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//@Component
@Service
public class PhotozService {

    private final PhotozRepository photozRepository;

    public PhotozService(PhotozRepository photozRepository) {
        this.photozRepository = photozRepository;
    }


    public Iterable<Photo> get() {
        return photozRepository.findAll();
    }

    public Photo get(Integer id) {
        return photozRepository.findById(id).orElse(null);
    }

    public void remove(Integer id) {
        photozRepository.deleteById(id);
    }

    public Photo save(String fileName, String contentType, byte[] data) {
        Photo photo = new Photo();
        photo.setContentType(contentType);
        photo.setFileName(fileName);
        photo.setData(data);
        photozRepository.save(photo);
        return photo;
    }
}
