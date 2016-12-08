package meeting1.ex4

class Car {
    String make
    String model
}

def cars = [
        new Car(make: 'Peugeot', model: '508'),
        new Car(make: 'Renault', model: 'Clio')
]

def makes = cars*.make
assert makes == ['Peugeot', 'Renault']
