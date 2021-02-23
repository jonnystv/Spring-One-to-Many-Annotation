package com.codeclan.example.Spring_Annotation.components;

import com.codeclan.example.Spring_Annotation.models.File;
import com.codeclan.example.Spring_Annotation.models.Folder;
import com.codeclan.example.Spring_Annotation.models.User;
import com.codeclan.example.Spring_Annotation.repositories.FileRepository;
import com.codeclan.example.Spring_Annotation.repositories.FolderRepository;
import com.codeclan.example.Spring_Annotation.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args) {

        User ann = new User("Ann Brown");
        userRepository.save(ann);

        User bob = new User("Bob Cooper");
        userRepository.save(bob);

        Folder docs = new Folder("My Documents", ann);
        folderRepository.save(docs);

        Folder vids = new Folder("My Videos", ann);
        folderRepository.save(vids);

        Folder pics = new Folder("My Pictures", bob);
        folderRepository.save(pics);

        Folder download = new Folder("My Downloads", bob);
        folderRepository.save(download);

        File video1 = new File("Party_Video", ".mp4", "100MB", vids);
        fileRepository.save(video1);

        File video2 = new File("Holiday_Video", ".mp4", "150MB", vids);
        fileRepository.save(video2);

        File photo1 = new File("Birthday_Portrait", ".jpeg", "10MB", pics);
        fileRepository.save(photo1);

        File photo2 = new File("Mum_and_Dad", ".jpeg", "8MB", pics);
        fileRepository.save(photo2);

        File document1 = new File("Paella_Recipe", ".docx", "50KB", docs);
        fileRepository.save(document1);

        File document2 = new File("My_CV", ".docx", "60KB", docs);
        fileRepository.save(document2);

        File download1 = new File("Ubuntu_20.04_LTS", ".iso", "750MB", download);
        fileRepository.save(download1);

        File download2 = new File("VMWare_Player", ".exe", "350MB", download);
        fileRepository.save(download2);





    }
}
