function getFullName(person) {
    return {
        firstName: person.firstName,
        lastName: person.lastName,
        age: person.age,
        getFullNames: function () {
            return "".concat(this.firstName, " ").concat(this.lastName) + (this.age ? " ".concat(this.age) : '');
        }
    };
}
var person = getFullName({
    firstName: 'January',
    lastName: 'February',
    age: 19,
    getFullNames: function () { return ''; } // placeholder, will be overridden
});
console.log(person.getFullNames());
var Format;
Format = function (str, isUpperCase) {
    return isUpperCase ? str.toUpperCase() : str.toLowerCase();
};
console.log(Format('HEY', true));
var Mail = /** @class */ (function () {
    function Mail() {
    }
    Mail.prototype.late = function (email) {
        return false;
    };
    Mail.prototype.queue = function (email) {
        return false;
    };
    Mail.prototype.send = function (email) {
        return false;
    };
    return Mail;
}());
