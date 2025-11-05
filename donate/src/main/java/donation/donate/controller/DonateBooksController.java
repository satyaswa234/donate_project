package donation.donate.controller;

import donation.donate.dto.DonateItemDTO;
import donation.donate.entity.DonateBooks;
import donation.donate.service.DonateBooksService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.*;
import java.util.List;

@RestController
@RequestMapping("/api/books")
@CrossOrigin("*")
public class DonateBooksController {

    private final DonateBooksService service;

    public DonateBooksController(DonateBooksService service) {
        this.service = service;
    }

    @PostMapping("/upload")
    public String uploadImage(@RequestParam("image") MultipartFile file) {
        try {
            String folder = "uploads/books/";
            Files.createDirectories(Paths.get(folder));

            String filePath = folder + file.getOriginalFilename();
            Path path = Paths.get(filePath);

            Files.write(path, file.getBytes());

            return "http://localhost:8080/" + filePath; // ✅ Returns URL
        } catch (Exception e) {
            return "Error";
        }
    }

    @PostMapping
    public DonateBooks donateBook(@RequestBody DonateItemDTO dto) {
        return service.saveDonation(dto);
    }

    @GetMapping("/all")
    public List<DonateBooks> getAll() {
        return service.getAll();
    }
}

