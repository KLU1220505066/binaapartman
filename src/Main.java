
public class Main {
    public static void main(String[] args) {
        // then press Enter. You can now see whitespace characters in your code.
        public class Main {
            public static void main(String[] args) {
// Daire sınıfı
                public class Daire {
                    private int apartmentNumber;
                    private String ownerName;
                    private int floorNumber;

                    public Daire(String ownerName, int apartmentNumber, int floorNumber) {
                        this.ownerName = ownerName;
                        this.apartmentNumber = apartmentNumber;
                        this.floorNumber = floorNumber;
                    }

                    public void displayInfo() {
                        // Bilgileri gösterme işlevi
                    }

                    public int compareTo(Daire other) {
                        // Karşılaştırma işlevi
                        return Integer.compare(this.apartmentNumber, other.apartmentNumber);
                    }
                }

// Bina sınıfı
                public class Bina {
                    private int numberOfFloors;

                    public Bina(String address, int numberOfFloors) {
                        this.numberOfFloors = numberOfFloors;
                    }

                    public void displayInfo() {
                        // Bilgileri gösterme işlevi
                    }
                }

// Konut sınıfı
                public class Konut extends Bina {
                    private String address;

                    public Konut(String address) {
                        super(address, 0); // Eğer kat sayısı önemli değilse, 0 olarak atanabilir.
                        this.address = address;
                    }

                    @Override
                    public void displayInfo() {
                        // Bilgileri gösterme işlevi
                        super.displayInfo(); // Bina sınıfının displayInfo metodunu çağırabilir.
                    }
                }

// Kiracı sınıfı
                public class Kiraci {
                    private String name;
                    private String surname;
                    private evSahibi landlord;

                    public Kiraci(String name, String surname, evSahibi landlord) {
                        this.name = name;
                        this.surname = surname;
                        this.landlord = landlord;
                    }

                    public void displayInfo() {
                        // Bilgileri gösterme işlevi
                    }
                }

// evSahibi sınıfı
                public class evSahibi {
                    private String name;
                    private String surname;
                    private Bina building;

                    public evSahibi(String name, String surname, Bina building) {
                        this.name = name;
                        this.surname = surname;
                        this.building = building;
                    }

                    public void displayInfo() {
                        // Bilgileri gösterme işlevi
                    }

                    public void addApartment(Daire apartment) {
                        // Daire ekleyen işlev
                    }
                }

// Main sınıfı
                public class Main {
                    public static void main(String[] args) {
                        // Uygulama giriş noktası
                    }
                }
            }
        }
    }

}
    }
            }