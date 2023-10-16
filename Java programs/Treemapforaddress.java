 import java.util.TreeMap;
class Address {
private String plotNo;
private String at;
private String post;
public Address(String plotNo, String at, String post) {
this.plotNo = plotNo;
this.at = at;
this.post = post;
}
public String getPlotNo() {
return plotNo;
}
public String getAt() {
return at;
}
public String getPost() {
return post;
}
}
public class Treemapforaddress {
public static void main(String[] args) {
TreeMap<String, Address> addressBook = new TreeMap<>();
addressBook.put("John Doe", new Address("123", "Main Street",
"New York"));
addressBook.put("Jane Smith", new Address("456", "High Street",
"London"));
addressBook.put("Bob Johnson", new Address("789", "Elm Street",
"Los Angeles"));
for (String name : addressBook.keySet()) {
Address address=addressBook.get(name);
System.out.println(name + ": Plot No. " +
address.getPlotNo() + ", At " + address.getAt() + ", Post " +
address.getPost());
}
}
}

    

