//The string literal type allow you to define a ty[e that accepts only one specified
//string literal

let click:'click';
click = 'click'; // it will show an error if you assign anything else
console.log(click);
////////////////////////////

type Mouse = 'mousemove' | 'mouseup' |'click';
let mouse: Mouse;
mouse = 'click';