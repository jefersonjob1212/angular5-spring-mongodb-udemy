import { Person } from './../lesson01-classes/person';
import { DaoInterface } from './dao.interface';
import { Dao } from './dao';

let dao: Dao<Person> = new Dao<Person>();
let person: Person = new Person("Jeferson Job");

dao.insert(person);
