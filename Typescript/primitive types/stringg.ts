type Status = "success" | "error" | "warning";
let currentStatus: Status;
currentStatus = "success";
function isStatus(status: Status):string {
    return status;
}
console.log(isStatus(currentStatus));

let msg = 'Hello World!';
console.log(msg.search("H"));

let variable :null;
variable = undefined;
console.log(variable);