class Employee{
    private static headcount:number = 0;

    constructor(private name:string, private lastName:string, private title:string){
        Employee.headcount++;
        console.log("Constructor");
    }
    public static getCount():number{
        return Employee.headcount;
    }
    hello():void{
        console.log("hi");
    }
}

let worker = new Employee('htech','agen','ceo');
let worker2 = new Employee('htech','agen','ceo');
console.log(Employee.getCount());
//worker.hello();