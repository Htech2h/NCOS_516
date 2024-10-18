// func that expect a parameter
function add(b, a) {
    if (typeof a === "string" && typeof b === "string") {
        return a.concat(b);
    }
    if (typeof a === "number" && typeof b === "number") {
        return a + b;
    }
    throw new Error("you bitch we need to add a number! or strings");
}
console.log(add(true, true));
