var arrayName = [1, 2, 3];
arrayName.push(4);
arrayName.reverse();
var doubleIt = arrayName.map(function (e) { return e * 2; });
console.log(arrayName.length);
console.log(doubleIt);
///////////////////////////mixed types
var scores = ['one', 1, 'two', 2];
for (var i = 0; i < arrayName.length; i++) {
    if (scores[i] === 'two') {
        console.log(scores[i + 1]);
        break;
    }
}
