/*function Person(ssn,firstName,lastName){
    this.ssn = ssn;
    this.firstName = firstName;
    this.lastName = lastName;
}

Person.prototype.getFullNames = function(){
    return `${this.firstName} ${this.lastName}`;
}
let person = new Person('171-28-0926', 'htech','agen');
console.log(person.getFullNames());*/
//////////////////////////////////////

class Persons{
    private ssn:any;
    private firstName: string;
    private lastName: string;
    constructor(ssn:any, firstName:string, lastName:string){
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public getFullNames(){
        return `${this.ssn} ${this.firstName} ${this.lastName}`;
    }
}

let person = new Persons('98-218-12712','htech','agen');
let person2 : Persons = new Persons('98-218-12712','zack','zoerak');
console.log(person.getFullNames());
console.log(person2.getFullNames());
