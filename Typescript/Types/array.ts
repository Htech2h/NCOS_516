let arrayName = [1,2,3];
arrayName.push(4);
arrayName.reverse();
let doubleIt = arrayName.map(e=>e*2);

console.log(arrayName.length);
console.log(doubleIt);
///////////////////////////mixed types

let scores:(string|number)[]=['one',1,'two',2];
for(let i = 0; i<arrayName.length; i++){
    if(scores[i] === 'two'){
        console.log(scores[i+1]);
        break;
    }
}