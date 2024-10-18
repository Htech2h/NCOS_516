let p ={
    name:"htech",
    age: 19,
    surname:"agen"
}

function constr(name,lastName,age)
{
    this.name = name;
    this.lastName = lastName;
    this.age = age;
}

let p2 = new constr("htech","agem",19);

console.log(p2.name);