class Person{
    constructor(private name: string, private lastName: string){
        this.name = name;
        this.lastName = lastName;
    }
    getFullName():string{
        return `${this.name} ${this.lastName}`;
    }
    describe():string{
        return `This is ${this.name} ${this.lastName}`;
    }
}

class Employee extends Person{
    constructor(name: string, lastName: string,private title:string) {
        super(name, lastName);
    }
    describe(): string {
        return super.describe() + ` I am the ${this.title}`;
    }
}

let employee = new Employee('htech_', 'agen','Ceo');
console.log(employee.describe());