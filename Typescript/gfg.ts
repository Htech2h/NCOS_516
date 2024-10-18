class geek{
    local_var:number = 10;
    assign():void{
        this.local_var = 12;
    }
    c_out():void{
        let something = 4;
        console.log(something);
    }
}

let obj = new geek();
obj.assign();
obj.c_out();
console.log(obj.local_var);

var num1:number = 1;
function var_keywords()
{
    var num2:number = 2;
    if(num1+num2 == 3){
        var num3:number = 3;
    }
    console.log(num1);
    console.log(num2);
    console.log(num3);
}

//var_keywords();

