package Main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.InputMismatchException;

public class Rubric extends ArrayList<Contact> {
    private ArrayList<Contact> rubric;

    public Rubric() {
        rubric = new ArrayList<>();
    }

    //z=122
    //a=97
    public void sort() {
        ArrayList<String> surnames = new ArrayList<>();
        for (int i = 0; i < this.size(); i++) {
            surnames.add(this.get(i).getSurname());
        }
        Collections.sort(surnames);
        for (int j = 0; j < surnames.size(); j++) {
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i).getSurname().equals(surnames.get(j))) {
                    Contact memory = this.get(j);
                    this.set(j, this.get(i));
                    this.set(i, memory);
                }
            }
        }
    }

    public String OutPut(){
        String output="";
        for (int i = 0; i < this.size(); i++) {
            output=output+this.get(i).toString()+"\n";
        }
        return output;
    }
    public boolean remove(String surname){
        for (int i = 0; i < this.size(); i++) {
            if(this.get(i).getSurname().toLowerCase().equals(surname.toLowerCase())){
                this.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean modify(String surname){
        InputStreamReader in= new InputStreamReader(System.in);
        BufferedReader reader= new BufferedReader(in);
        for (int i = 0; i < this.size(); i++) {
            if(this.get(i).getSurname().toLowerCase().equals(surname.toLowerCase())){
                try {
                    System.out.println("new name: ");
                    String new_name= reader.readLine();
                    System.out.println("new surname: ");
                    String new_surname= reader.readLine();
                    System.out.println("new number: ");
                    int new_number=reader.read();
                    reader.readLine();
                    System.out.println("new address: (optional)");
                    String new_address= reader.readLine();
                    this.set(i, new Contact(new_name, new_surname, new_number, new_address));
                    return true;
                }catch (Exception e){
                    System.out.println("insert the right type of variables");

                }
            }
        }
        return false;
    }
    public boolean modify(int number){
        return false;
    }
    public String SeeAContact(String surname){
        for (int i = 0; i < this.size(); i++) {
            if(this.get(i).getSurname().toLowerCase().equals(surname.toLowerCase())){
                return this.get(i).getName()+"  "+this.get(i).getSurname()+"  "+this.get(i).getPhone_number()+"  "+this.get(i).getAddress();
            }
        }
        return null;
    }
}

