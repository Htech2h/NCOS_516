//a group of names constants values, it stands for enumerated type
//
var Month;
(function (Month) {
    Month[Month["jan"] = 0] = "jan";
    Month[Month["feb"] = 1] = "feb";
    Month[Month["mar"] = 2] = "mar";
    Month[Month["apr"] = 3] = "apr";
    Month[Month["may"] = 4] = "may";
})(Month || (Month = {}));
function isSummer(month) {
    var yes;
    switch (month) {
        case Month.jan:
        case Month.feb:
            yes = true;
            break;
        default:
            yes = false;
            break;
    }
    return yes;
}
console.log(isSummer(1));
console.log(Month);
////////////////////////////////////////
var aproveStatus;
(function (aproveStatus) {
    aproveStatus[aproveStatus["draft"] = 0] = "draft";
    aproveStatus[aproveStatus["submitted"] = 1] = "submitted";
    aproveStatus[aproveStatus["approved"] = 2] = "approved";
    aproveStatus[aproveStatus["rejected"] = 3] = "rejected";
})(aproveStatus || (aproveStatus = {}));
var request = {
    id: 1,
    status: aproveStatus.approved,
    description: 'i need this job',
};
if (request.status == aproveStatus.approved) {
    console.log('get email');
}
