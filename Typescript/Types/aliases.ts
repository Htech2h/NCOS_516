//allows you to create new name for existing types
//

type chars = string;
let msg:chars;
////for unions
type alphanumeric = string | number;
let input:alphanumeric;
input = 10;
input = 'hello';
console.log(input);