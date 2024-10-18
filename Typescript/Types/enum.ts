//a group of names constants values, it stands for enumerated type
//

enum Month{
    jan,
    feb,
    mar,
    apr,
    may
}
function isSummer(month: Month){
    let yes:boolean;
    switch(month){
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
enum aproveStatus{
    draft,
    submitted,
    approved,
    rejected
}
const request = {
    id:1,
    status:aproveStatus.approved,
    description:'i need this job',
}

if(request.status==aproveStatus.approved){
    console.log('get email');
}
