package schronisko;

import java.util.ArrayList;

public class Zwierze {
    public Zwierze(){}
    public Zwierze(String name){
        this.name = name;
    }
    public Zwierze(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Zwierze(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void addZwierze(Zwierze z){
        lista.add(z);
    }
    public void delZwierze(int z){
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).id == z) lista.remove(i);
        }
    }
    public void printStatus(){
        for(Zwierze z: lista) System.out.println("Id: " + z.id + ", imie: " + z.name + ", wiek: "
                + z.age);
    }
    public int numberOfAnimals(){
        int a;
        a = getList().size();
        return a;
    }
    public int nextId(){
        int nextId = 0;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).id > nextId) nextId = lista.get(i).id;
        }
        return nextId + 1;
    }
    public void fillList(){
        lista.add(new Zwierze(1, "zwierze1", 6));
        lista.add(new Zwierze(2, "zwierze2", 4));
        lista.add(new Zwierze(3, "zwierze3", 8));
        lista.add(new Zwierze(4, "zwierze4", 3));
        lista.add(new Zwierze(5, "zwierze5", 5));
        lista.add(new Zwierze(6, "zwierze6", 2));
    }
    public ArrayList<Zwierze> getList(){
        return lista;
    }
    
    ArrayList<Zwierze> lista = new ArrayList<>();
    String name;
    int age;
    int id;
}
