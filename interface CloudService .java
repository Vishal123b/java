interface CloudService {
    void upload(String file);
}

class FileStorage implements CloudService {
    public void upload(String file) {
        System.out.println("Uploading: " + file);
    }
}

public class Main {
    public static void main(String[] args) {
        CloudService service = new FileStorage();
        service.upload("file.txt");
    }
}
