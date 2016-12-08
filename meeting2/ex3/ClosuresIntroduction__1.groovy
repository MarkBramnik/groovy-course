package meeting2.ex3

import groovy.transform.Canonical

@Canonical
class Employee {
    String name
    int year
    boolean manager
}


List<Employee> employees = [
                 new Employee(name : "John", year : 2015, manager : false),
                 new Employee("Jack", 2010, true),
                 new Employee("Jenny", 2012, false)
]


List<Employee> findManagers(List<Employee> employeesList) {
    List<Employee> result = []
    for(Employee emp : employeesList)  {
        if(emp.manager) {
            result << emp
        }
    }
    result
}


List<Employee> findManagersStartedAfter2011(List<Employee> employeesList) {
    List<Employee> result = []
    for(Employee emp : employeesList)  {
        if(emp.year >= 2011) {
            result << emp
        }
    }
    result
}


// OK, Let's refactor:

interface Filter {
    boolean accept(Employee emp)
}

class ManagerFilter implements Filter {
    @Override
    boolean accept(Employee emp) {
         emp.manager
    }
}

class StartedAfter2011Filter implements Filter {
    @Override
    boolean accept(Employee emp) {
        emp.year >= 2011
    }
}

def findWithFilter(List<Employee> employeesList, Filter filter) {
    List<Employee> result = []
    for(Employee emp : employeesList) {
        if(filter.accept(emp)) {
         result << emp
        }
    }
    result
}

// Now this is the closest thing to closure. Why do we need an interface???

Closure<Boolean> managerClosure = { Employee emp ->
    emp.manager
}

def findWithClosure(List<Employee> employeesList, Closure<Boolean> filter) {
    List<Employee> result = []
    for(Employee emp : employeesList) {
        if(filter.call(emp)) {
            result << emp
        }
    }
    result
}


// How to use this?
findWithClosure(employees, managerClosure)
// some syntactic sugar:
findWithClosure(employees, {Employee emp -> emp.manager})

//////////////////////////////////////////////////////////////////


// Closure can be coerced to interface:
findWithFilter(employees, {Employee emp -> emp.manager})
// Warning in old Groovy versions:
findWithFilter(employees, {Employee emp -> emp.manager} as Filter)


//////////////////////////////////////////////////////////////////
// it is an implicit parameter

findWithClosure(employees, {it.manager})

// The iteration has been already implemented on List:
// The method each/collect and many others accept a closure as a parameter
// and check whether it matches for the current element of the list

employees.findAll ({it.manager })

// When the closure is the last parameter to the method, () can be omitted:
employees.findAll {it.manager}
employees.findAll {it.year >= 2011}
