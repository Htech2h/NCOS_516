var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Person = /** @class */ (function () {
    function Person(name, lastName) {
        this.name = name;
        this.lastName = lastName;
        this.name = name;
        this.lastName = lastName;
    }
    Person.prototype.getFullName = function () {
        return "".concat(this.name, " ").concat(this.lastName);
    };
    Person.prototype.describe = function () {
        return "This is ".concat(this.name, " ").concat(this.lastName);
    };
    return Person;
}());
var Employee = /** @class */ (function (_super) {
    __extends(Employee, _super);
    function Employee(name, lastName, title) {
        var _this = _super.call(this, name, lastName) || this;
        _this.title = title;
        return _this;
    }
    Employee.prototype.describe = function () {
        return _super.prototype.describe.call(this) + " I am the ".concat(this.title);
    };
    return Employee;
}(Person));
var employee = new Employee('htech_', 'agen', 'Ceo');
console.log(employee.describe());
