interface Person {
    firstName: string;
    lastName: string;
    readonly age?: number; // age cannot be changed
    getFullNames(): string;
}

function getFullName(person:Person): Person {
    return {
        firstName: person.firstName,
        lastName: person.lastName,
        age: person.age,
        getFullNames:function (){
        return `${this.firstName} ${this.lastName}` + (this.age ? ` ${this.age}` : '');
    }
    };
}
let person = getFullName({
    firstName: 'January',
    lastName: 'February',
    age: 19,
    getFullNames: () => '' // placeholder, will be overridden
});
console.log(person.getFullNames());

//////////////////////////////////////////

interface StringFormat {
    (str:string, isUpperCase?:boolean):string;
}
let Format: StringFormat;
Format = function (str:string, isUpperCase:boolean){
    return isUpperCase ? str.toUpperCase() : str.toLowerCase();
}
console.log(Format('HEY',true));

///////////////////////////mailable

interface Mailable{
    send(email:string):boolean;
    queue(email:string):boolean;
}

interface FutureMailable extends Mailable{
    late(email:string):boolean;
}
class Mail implements FutureMailable{
    late(email: string): boolean {
        return false;
    }

    queue(email: string): boolean {
        return false;
    }

    send(email: string): boolean {
        return false;
    }

}