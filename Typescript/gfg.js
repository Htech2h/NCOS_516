var geek = /** @class */ (function () {
    function geek() {
        this.local_var = 10;
    }
    geek.prototype.assign = function () {
        this.local_var = 12;
    };
    geek.prototype.c_out = function () {
        var something = 4;
        console.log(something);
    };
    return geek;
}());
var obj = new geek();
obj.assign();
obj.c_out();
console.log(obj.local_var);
var num1 = 1;
function var_keywords() {
    var num2 = 2;
    if (num1 + num2 == 3) {
        var num3 = 3;
    }
    console.log(num1);
    console.log(num2);
    console.log(num3);
}
//var_keywords();
