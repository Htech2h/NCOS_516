// func that expect a parameter

function add(a:number|string, b:number|string){
    if(typeof a === "string" && typeof b === "string"){
        return a.concat(b);
    }
    if(typeof a === "number" && typeof b === "number"){
        return a + b;
    }
    throw new Error("you bitch we need to add a number! or strings");
}
console.log(add(1,5));