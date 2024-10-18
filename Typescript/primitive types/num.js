var num = 5;
if (num <= 0 || num > 7) {
    num = Number.NaN;
    console.log(num);
}
else {
    console.log(num.toExponential());
    console.log(num.toFixed());
    console.log(num.toLocaleString());
    console.log(num.toPrecision(3));
}
