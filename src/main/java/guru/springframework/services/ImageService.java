package guru.springframework.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by rbenitez on November 2018.
 */
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}
