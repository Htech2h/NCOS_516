let greet: (name: string) => string;

greet = function (name: string) {
    return `string ${name}`;
};
console.log(greet('name'));