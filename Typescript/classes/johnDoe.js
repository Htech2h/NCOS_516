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
var Persons = /** @class */ (function () {
    function Persons(ssn, firstName, lastName) {
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Persons.prototype.getFullNames = function () {
        return "".concat(this.ssn, " ").concat(this.firstName, " ").concat(this.lastName);
    };
    return Persons;
}());
var person = new Persons('98-218-12712', 'htech', 'agen');
var person2 = new Persons('98-218-12712', 'zack', 'zoerak');
console.log(person.getFullNames());
console.log(person2.getFullNames());
