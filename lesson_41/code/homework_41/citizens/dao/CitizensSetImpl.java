package homework_41.citizens.dao;

import homework_41.citizens.model.Person;

import java.time.LocalDate;
import java.util.*;

public class CitizensSetImpl implements Citizens{

    // fields
    private Set<Person> idSet;
    private SortedSet<Person> lastNameSet;
    private SortedSet<Person> ageSet;

    public CitizensSetImpl() {
        idSet = new HashSet<>();
        lastNameSet = new TreeSet<>();
        ageSet = new TreeSet<>();
    }

    public CitizensSetImpl(Set<Person> citizens) {
        this();
        citizens.forEach(p -> add(p));
    }

    //O(log(n))
    @Override
    public boolean add(Person person) {
        if (person == null) {
            return false;
        }
        idSet.add(person);
        ageSet.add(person);
        lastNameSet.add(person);
        return true;
    }

    //O(log(n))
    @Override
    public boolean remove(int id) {
        Person victim = find(id);
        if (victim == null) {
            return false;
        }
        idSet.remove(victim);
        ageSet.remove(victim);
        lastNameSet.remove(victim);
        return true;
    }

    //O(1)
    @Override
    public Person find(int id) {
        for (Person person : idSet) {
            if(person.getId() == id){
                return person;
            }
        }
        return null;
    }

    //O(log(n))
    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
          LocalDate now = LocalDate.now();
          Person start = new Person(Integer.MIN_VALUE, "", "", now.minusYears(minAge));
          Person end = new Person(Integer.MAX_VALUE, "", "", now.minusYears(maxAge));
          return ageSet.subSet(end, start);
    }

    //O(log(n))
    @Override
    public Iterable<Person> find(String lastName) {
        Person start = new Person(Integer.MIN_VALUE, "", lastName, LocalDate.now());
        Person end = new Person(Integer.MAX_VALUE, "", lastName, LocalDate.now());
        return lastNameSet.subSet(start, end);
    }

    //O(1)
    @Override
    public Iterable<Person> getAllPersonSortedById() {
        return idSet;
    }

    //O(1)
    @Override
    public Iterable<Person> getAllPersonSortedByLastName() {
        return lastNameSet;
    }

    //O(1)
    @Override
    public Iterable<Person> getAllPersonSortedByAge() {
        return ageSet;
    }

    //O(1)
    @Override
    public int size() {
        return size();
    }
}
