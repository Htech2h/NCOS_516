//console.log("hello world");
let num:number = 5;
console.log(num-2);

let arr:number[] = [1,2,3,4,5,6,7,8,9,10];
for(let x of arr){
    console.log(x);
}

function letTest()
{
    let x:number = 5;
    if(true){
        let x:number = 8;
        console.log(x);
    }
    console.log(x);
}

//letTest();
let msg:string = 'Hello World!';
let ot:string = `${msg}`;
console.log(ot);    