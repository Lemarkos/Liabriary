public class Reader {
    private String firstName;
    private String lastName;
    private String birth;
    private String faculty;
    private int idCard;
    private String tel;

    public Reader(String firsName, String lastName, String birth, String faculty, int idCard, String tel) {
        this.firstName = firsName;
        this.lastName = lastName;
        this.birth = birth;
        this.faculty = faculty;
        this.idCard = idCard;
        this.tel = tel;
    }


    public void takeBook(int bookQuantity){
        System.out.println(getFirsName() + " took " + bookQuantity + " books");
    }

    public void takeBook(Book[] numBooks){
        System.out.print(getFirsName() + " took: ");
        for (Book num : numBooks){
            String bookName = "";
            bookName += num.getBookName();
            System.out.print(bookName + ", ");
        }
    }

    public void returnBook(int bookQ){
        System.out.println("\n" + getFirsName() + " " + getLastName() + " returned " + bookQ + " books");
    }

    public void returnBook(Book[] returnBooks){
        System.out.print(getFirsName() + " returned: ");
        for (Book rNum : returnBooks){
            String bookName = "";
            bookName += rNum.getBookName();
            System.out.println(bookName);
        }
    }

    public String getFirsName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirth() {
        return birth;
    }

    public int getIdCard() {
        return idCard;
    }

    public String getTel() {
        return tel;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birth='" + birth + '\'' +
                ", faculty='" + faculty + '\'' +
                ", idCard=" + idCard +
                ", tel='" + tel + '\'' +
                '}';
    }
}
